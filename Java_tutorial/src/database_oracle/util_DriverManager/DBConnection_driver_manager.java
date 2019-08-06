package database_oracle.util_DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public final class DBConnection_driver_manager {
	public static Connection connection;
	public static Statement statement;
	
	private final static String DRIVER;
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
		
		lazy_init_DBConnection();
	}
	
	
// lazy_init
	private static void lazy_init_DBConnection() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 구동 완료");
			
			connection = DriverManager.getConnection(URL, ID, PW);
			System.out.println(ID + "계정으로 접속 완료");
			
		} catch(ClassNotFoundException e) {
			System.out.println("구동 실패" + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println(ID + "계정 접속 실패" + e.getMessage());
		}
	}
	
	
// 스트림 종료
	public static void close() {
		try {
			if(statement != null) { statement.close(); }
			if(connection != null) { connection.close(); }
			
			System.out.println("DB - 정상 접속 종료");
			
		} catch (SQLException e) {
			System.out.println("DB종료 에러 : " + e.getMessage());
		}
	}
}
