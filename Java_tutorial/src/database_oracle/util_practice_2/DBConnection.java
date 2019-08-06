package database_oracle.util_practice_2;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {
	private static OracleDataSource data_source;
	private static Connection conn;
	
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final static String ID = "scott";
	private final static String PW = "tiger";
	
	static {
		init_Connection();
	}
	
	
	// 싱글톤
	private DBConnection() { }
	
	
	private static void init_Connection() {
		try {
			data_source = new OracleDataSource();
			data_source.setURL(URL);
			conn = data_source.getConnection(ID, PW);
			System.out.println("JDBC 접속 성공");
			
		} catch (SQLException e) {
			System.out.println("접속 실패 : " + e.getMessage());
		}
	}
	
	
	public static Connection get_connection() {
		return conn;
	}
	
	
	public static void close() {
		try {
			if(conn != null) { conn.close(); }
			
		} catch (SQLException e) {
			System.out.println("Connection 비정상 종료 : " + e.getMessage());
		}
	}
}
