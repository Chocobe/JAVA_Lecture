package database_oracle.util_practice_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static Connection connection;
	
	private final static String DRIVER;
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
		
		init_connection();
	}
	
	
	private static void init_connection() {
		try {
			Class.forName(DRIVER);
			System.out.println("JDBC 구동 완료");
			
			connection = DriverManager.getConnection(URL, ID, PW);
			System.out.println("\"" + ID + "\" 계정으로 접속 완료");
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 구동 실패 : " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("계정 접속 실패 : " + e.getMessage());
		}
	}
	
	
	public static void close_connection() {
		try {
			if(connection != null) {
				connection.close();
			}
			
		} catch(SQLException e) {
			System.out.println("Connection 해제 에러 : " + e.getMessage());
		}
	}
	
	
	public static Connection get_connection() {
		return connection;
	}
}
