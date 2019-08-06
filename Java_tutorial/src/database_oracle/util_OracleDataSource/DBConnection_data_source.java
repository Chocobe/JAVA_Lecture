package database_oracle.util_OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection_data_source {
	private static OracleDataSource data_source;
	private static Connection connection;
	
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
		
		init_connection();
	}
	
	
// 생성자
	private DBConnection_data_source() { }
	
	
// Connection 초기화
	private static void init_connection() {
		try {
			data_source = new OracleDataSource();
			data_source.setURL(URL);
			data_source.setUser(ID);
			data_source.setPassword(PW);
			
			connection = data_source.getConnection();
			
			System.out.println("** " + ID + "계정 접속 완료 **");
			
		} catch(SQLException e) {
			System.out.println("접속 에러 : " + e.getMessage());
		}
	}
	
	
// connection 접근 메소드
	public static Connection get_connection() {
		return connection;
	}
	
	
// connection 해제
	public static void close_connection() {
		if(connection != null) {
			try {
				connection.close();
				
			} catch(SQLException e) {
				System.out.println("connection.close 에러 : " + e.getMessage());
			}
		}
	}
	
	
// Statement 해제
	public static void close(Statement _statement) {
		if(_statement != null) {
			try {
				_statement.close();
				
			} catch(SQLException e) {
				System.out.println("Statement 해제 에러 : " + e.getMessage());
			}
		}
	}
	
	
// PreparedStatement 해제
	public static void close(PreparedStatement _pre_statement) {
		if(_pre_statement != null) {
			try {
				_pre_statement.close();
				
			} catch(SQLException e) {
				System.out.println("PreparedStatement 해제 실패 : " + e.getMessage());
			}
		}
	}
	
	
// ResultSet 해제
	public static void close(ResultSet _result_set) {
		if(_result_set != null) {
			try {
				_result_set.close();
				
			} catch(SQLException e) {
				System.out.println("ResultSet 해제 실패 : " + e.getMessage());
			}
		}
	}
	
	
// Scanner 해제
	public static void close(Scanner _scanner) {
		if(_scanner != null) {
			_scanner.close();
		}
	}
}