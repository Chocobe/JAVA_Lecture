package database_oracle.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	public static Connection con;
	public static Statement st;
	
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
		
		init_connection();
	}
	
	private static void init_connection() {
		try {			
			con = DriverManager.getConnection(URL, ID, PW);
			System.out.println("드라이버 구동 완료");
			
			st = con.createStatement();
			System.out.println(ID + "계정의 접속 완료");
			
		} catch(SQLException e) {
			System.out.println("Error : " + e.getMessage());
		}
	}
	
	
	public static void close() {
		try {
			if (con != null) { con.close(); }
			if (st != null) { st.close(); }
			System.out.println("DB 정상 종료");
						
		} catch (SQLException e) {
			System.out.println("DB 비정상 종료");
		}
		
	}
}
