package database_oracle.connection_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_test {
	public static void main(String[] args) {
		// Database에 연결하기 위해 알아야 할 3가지
		// URL, 계정자, 암호
		//
		// 1. 구동 드라이브 선택
		// (Package explorer -> Referenced Libraries -> 
		//    ojdbc6.jar -> oracle.jdbc.driver -> OracleDriver.class 파일)
		//    (확장자는 빼고 적는다)
		String driver_path = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		try {
			// 1. 구동 드라이브 선택
			Class.forName(driver_path);
			System.out.println("구동 드라이브 연결 성공");
			
			// 2. url, user, password 로 연결
			@SuppressWarnings("unused")
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Database 연결 성공");
			
		} catch(ClassNotFoundException e) {
			System.out.println("오라클 구동 파일을 찾을 수 없음 : " + e.getMessage());
			
		} catch (SQLException e) {			
			System.out.println("Database 연결 실패 : " + e.getMessage());
		}
	}
}
