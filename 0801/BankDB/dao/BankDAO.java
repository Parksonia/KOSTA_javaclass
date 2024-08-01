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
import java.util.PrimitiveIterator.OfDouble;

import acc.Account;
import acc.SpecialAccount;

public class BankDAO {

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

	// 계좌 하나 조회
	public static Account selectAccount(String num) {
		Account acc = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null; // 쿼리문 결과 데이터를 불러오기 위함
		String sql = "select * from account where id = ?";

		try {
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, num); // string 쿼리문의 ? 셋팅
			rs = pstm.executeQuery();
			if (rs != null && rs.next()) {
				String accNo = rs.getString("id");
				String name = rs.getString("name");
				Integer balance = rs.getInt("balance");

				String grade = rs.getString("grade");
				if (grade == null) {
					acc = new Account(accNo, name, balance);
				} else {
					acc = new SpecialAccount(accNo, name, balance, grade);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(conn);
		}

		return acc;
	}

	public static void insertAccount(Account acc) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		String sql = "insert into account(id,name,balance,grade)values(?,?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, acc.getNum());
			pstmt.setString(2, acc.getName());
			pstmt.setInt(3, acc.getBalance());
			if (acc instanceof Account) {
				pstmt.setString(4, null);
			}
			if (acc instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount) acc).getGrade());
			}
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close(pstmt);
			close(conn);
		}
	}

	public static void updateBalance(Account acc) {

		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update account set balance=? where id=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, acc.getBalance());
			pstmt.setString(2, acc.getNum());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}

	}

	public static List<Account> selectAllAccount() {
		List<Account> list = new ArrayList<>();

		Statement stmt = null;
		Connection conn = getConnection();
		ResultSet rs = null;
		String sql = "select * from account";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) { // 테이블 행을 읽어오는 반복문

					String accNo = rs.getString("id");
					String name = rs.getString("name");
					Integer balance = rs.getInt("balance");
					String grade = rs.getString("grade");

					if (grade == null) {
						list.add(new Account(accNo, name, balance));
					} else {
						list.add(new SpecialAccount(accNo, name, balance, grade));
					}

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

}
