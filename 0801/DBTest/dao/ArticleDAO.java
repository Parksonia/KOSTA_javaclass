package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Article;

public class ArticleDAO {
	// DataBase Access 하는 클래스를 따로 만들고 이를 DAO라고 부름
		public static Connection getConnection() {
			Connection conn = null;
			try {
				// db.properties 파일에서 읽어옴
				Properties prop = new Properties();
				prop.load(new FileInputStream("db.properties"));
				// Driver설정
				Class.forName(prop.getProperty("driver")); // properties 파일의 Key인 "driver" 로 해당 값을 가져오게됨
				//
				conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
						prop.getProperty("password"));

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}

		public static void close(Connection conn) {
			try {
				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void close(Statement stmt) {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void close(ResultSet rs) {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static void insertArticle(Article article) {
			Connection conn = getConnection();
	//1. Statement방식 
//			Statement stmt = null;
//			String sql = String.format("insert into article(title,content,writer) values('%s','%s','%s')", article.getTitle(),
//					article.getContent(), article.getWriter());

			// 2. PreparedStatment 방식 - 가변되는 값을? 로 표시함
			PreparedStatement pstmt = null;
			String sql = "insert into article (title,content,writer)  values (?,?,?)";

			try {
//				stmt = conn.createStatement();
//				int cnt = stmt.executeUpdate(sql);

				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getContent());
				pstmt.setString(3, article.getWriter());
				int cnt = pstmt.executeUpdate();

				System.out.println(cnt + "개 데이터가 입력");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				// close(stmt);
				close(pstmt); // Statement의 자식이라서, close메서드 사용 가능
				close(conn);
			}
		}

		public static Article selectArticle(Integer num) {
			// select 결과값을 Article에 받아서 리턴

			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Article article = null;
			String sql = "select * from article where num =?";
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, num); // setInt의 1 은 ?의 위치를 나타냄 (1부터 시작한다~)

				rs = pstmt.executeQuery();
				if (rs != null && rs.next()) { // rs : 한 행
					String title = rs.getString(2); // title 인덱스를 가져와도 되고
					String content = rs.getString("content"); // content 컬럼명을 가져와도 됨
					String writer = rs.getString("writer"); // writer
					article = new Article(num, title, content, writer);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(pstmt);
				close(conn);
			}
			return article;
		}

		public static void updateArticle(Article article) {
			Connection conn = getConnection();
			PreparedStatement pstmt = null;
			String sql = "update article set title=?,content=? where num=?";

			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getTitle());
				pstmt.setString(2, article.getContent());
				pstmt.setInt(3, article.getNum());
				int cnt = pstmt.executeUpdate();

				System.out.println(cnt + "개 데이터가 업데이트");

				// ResultSet rs = pstmt.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(pstmt);
				close(conn);
			}
		}

		public static List<Article> selectAllArticle() {
			List<Article> list = new ArrayList<>();
			Connection conn = getConnection();
			// 가변적인 부분이 없기 때문에 prepared 쓸 필요 없음
			Statement stmt = null;
			ResultSet rs = null;
			String sql = "select * from article";
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				if (rs != null) {
					while (rs.next()) {
						Integer num = rs.getInt("num");
						String title = rs.getString("title");
						String content = rs.getString("content");
						String writer = rs.getString("writer");
						list.add(new Article(num, title, content, writer));
					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close(rs);
				close(stmt);
				close(conn);
			}

			return list;
		}

		public static void deleteArticle(Integer num) {
			Connection conn = getConnection();
			PreparedStatement pstm = null;
			String sql = "delete from article where num=?";
			try {
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, num);
				pstm.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(pstm);
				close(conn);
			}
		}

}
