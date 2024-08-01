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

import dto.Player;
import dto.Team;

public class BaseballDAO {

	// DB와 connection 부터 쿼리 작성까지 DAO에서 함
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

	// 팀 등록
	public static void insertTeam(Team team) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into team (name,loc) values(?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLoc());
			pstmt.executeUpdate(); // insert문 실행

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(pstmt);
		}

	}

	public static List<Team> sellectAllTeam() {
		List<Team> list = new ArrayList<>();
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from team";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs != null) {
				while (rs.next()) {
					Integer num = rs.getInt("num");
					String name = rs.getString("name");
					String loc = rs.getString("loc");
					list.add(new Team(num, name, loc));
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

	public static Team selectTeam(String name) {
		Team team =null;
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from team where name = ?";

		try {
			pstmt = conn.prepareStatement(sql);	
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs != null && rs.next()) {
				team = new Team(rs.getInt("num"), rs.getString("name"), rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
			close(conn);
		}
		return team;
	}

	public static void insertPlayer(Player player) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into player(name,backnum,teamnum) values(?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBackNum());
			pstmt.setInt(3, player.getTeamNum());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			close(pstmt);
			close(conn);

		}

	}
	public static List<Player> selectPlayer(String name){
		List<Player> list = new ArrayList<>();
		Connection conn = getConnection();
		Statement stmt =null;
		ResultSet rs = null;
		String sql = "select p.*,t.name from Player p join Team t on (p.teamnum = t.num) where p.name='"+name+"'";
		//select p.num,p.name,p.backNum,t.num,t.name from player p join team on(p.teamNum=t.num)where p.name=?
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs !=null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String Pname = rs.getString(2);
					Integer backNum = rs.getInt(3);
					Integer teamNum = rs.getInt(4);
					String teamName = rs.getString(5);
					list.add(new Player(num,Pname,backNum,teamNum,teamName));
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		
		
		
		return list;
	}

	public static List<Player> selectAllPlayer() {
		List<Player> list = new ArrayList<>();
		// select player는 teamName때문에 Join해야함
		Connection conn = getConnection();
		Statement stmt =null;
		ResultSet rs = null;
		String sql = "select p.*,t.name from Player p join Team t on p.teamnum = t.num";
		//select p.num,p.name,p.backNum,t.num,t.name from player p join team on(p.teamNum=t.num)where p.name=?
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs !=null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					Integer backNum = rs.getInt(3);
					Integer teamNum = rs.getInt(4);
					String teamName = rs.getString(5);
					list.add(new Player(num,name,backNum,teamNum,teamName));
				}
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(stmt);
			close(conn);
		}
		
		return list;
	}

}
