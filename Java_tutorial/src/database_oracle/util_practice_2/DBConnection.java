package database_oracle.util_practice_2;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class DBConnection {
	private OracleDataSource data_source;
	private Connection conn;
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String ID = "scott";
	private final String PW = "tiger";
	
	
	public DBConnection() {
		try {
			this.data_source = new OracleDataSource();
			data_source.setURL(this.URL);
			this.conn = data_source.getConnection(this.ID, this.PW);
			System.out.println("JDBC 접속 성공");
			
		} catch (SQLException e) {
			System.out.println("접속 실패 : " + e.getMessage());
		}
	}
	
	
	public Connection get_connection() {
		return this.conn;
	}
}
