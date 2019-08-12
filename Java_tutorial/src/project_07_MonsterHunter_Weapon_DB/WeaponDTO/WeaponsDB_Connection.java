package project_07_MonsterHunter_Weapon_DB.WeaponDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class WeaponsDB_Connection {
	private static Connection conn;
	
	private static final String URL;
	private static final String USER;
	private static final String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "monster_hunter";
		PW = "tiger";
		
		initConnection();
	}
	
	private WeaponsDB_Connection() { }
	

// Connection getter
	public static Connection getConnection() {
		return WeaponsDB_Connection.conn;
	}
	

// Connection 초기화
	private static void initConnection() {
		try {
			OracleDataSource dataSource = new OracleDataSource();
			dataSource.setURL(URL);
			dataSource.setUser(USER);
			dataSource.setPassword(PW);
			
			conn = dataSource.getConnection();
			System.out.println(USER + "계정으로 접속완료");
			
		} catch(SQLException e) {
			System.out.println("접속에러 : " + e.getMessage());
		}
	}
	
	
// close
	public static void close(Connection conn) {
		try {
			if(conn != null) conn.close();
			
		} catch(SQLException e) {
			System.out.println("접속해제 에러 : " + e.getMessage());
		}
	}
	
	public static void close(PreparedStatement ps) {
		try {
			if(ps != null) ps.close();
			
		} catch(SQLException e) {
			System.out.println("PreparedStatement 해제 에러 : " + e.getMessage());
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			if(rs != null) rs.close();
			
		} catch(SQLException e) {
			System.out.println("ResultSet 해제 에러 : " + e.getMessage());
		}
	}
}
