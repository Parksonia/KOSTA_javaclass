
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// DataBase 처리과정
// 1. Database 연결 : Connection 
// 2. SQL문 실행을 위해 statement열기  : Statement, PreparedStatement (클래스)  ex) conn.createStatement()
// 3. SQL문 문자열로 작성(쿼리문 작성)
// 4. 쿼리문을 Statement에 담아 실행 : executeUpdate(insert,update,delete), executeQuery(select) ex) stmt.executeUpdaet(),stmt.executeQuery()

public class UserDB {
	// ** Database 연결
	// 1) Driver 설정 (mariaDB인가? mySQL인가? Oracle인가? 설정하는 것)
	// 2) URL 설정
	// 3) username 설정 (DB계정 입력)
	// 4) password 설정 (패스워드 입력)

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // Maria db Driver설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb24", "root", "7564"); // 연결위한
			stmt = conn.createStatement();
			String sqlString  ="insert into user(id,name)values('song','송길동')";
			int cnt =stmt.executeUpdate(sqlString);
			System.out.println(cnt+"개 데이터가 삽입 성공");
			//System.out.println("접속 성공!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

		}

	}

}
