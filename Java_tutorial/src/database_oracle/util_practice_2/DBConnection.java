package database_oracle.util_practice_2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {
	private static OracleDataSource data_source;
	private static Connection conn;
	
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
		
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
	
	
	public static void close(Connection _connection) {
		if(_connection != null) {
			try {
				_connection.close();
				
			} catch(SQLException e) {
				System.out.println("Connection 닫기 실패 : " + e.getMessage());
			}
		}
	}
	
	
	public static void close(Statement _statement) {
		if(_statement != null) {
			try {
				_statement.close();
				
			} catch(SQLException e) {
				System.out.println("Statement 닫기 실패 : " + e.getMessage());
			}
		}
	}
	
	
	public static void close(PreparedStatement _pre_statement) {
		if(_pre_statement != null) {
			try {
				_pre_statement.close();
				
			} catch(SQLException e) {
				System.out.println("PreparedStatement 닫기 실패 : " + e.getMessage());
			}
		}
	}
	
	
	public static void close(ResultSet _result_set) {
		if(_result_set != null) {
			try {
				_result_set.close();
				
			} catch(SQLException e) {
				System.out.println("ResultSet 닫기 실패 : " + e.getMessage());
			}
		}
	}
}
