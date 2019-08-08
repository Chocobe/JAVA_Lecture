package database_oracle.database_with_swing_sample;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class MemberDAO {
	private Connection connection;
	
	private static final String URL;
	private static final String USER;
	private static final String PW;
	
	static {
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "scott";
		PW = "tiger";
	}
	
	
	public MemberDAO() { }
	
	
	private void init_connection() {
		try {
			OracleDataSource data_source = new OracleDataSource();
			data_source.setURL(URL);
			data_source.setUser(USER);
			data_source.setPassword(PW);
			
			connection = data_source.getConnection();
		
		} catch(SQLException e) {
			System.out.println("접속실패 : " + e.getMessage());
		}		
	}
	
	
	public void dbConnect() {
		init_connection();
	}
	
	
	public Connection get_connection() {
		return connection;
	}
	
	
	public void close() {
		try {
			connection.close();
			
		} catch(SQLException e) {
			System.out.println("Connection 해제 실패 : " + e.getMessage());
		}
	}
}
