package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class WeaponsDBConnector {
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
	
	
	public static Connection getConnection() {
		return conn;
	}
	
	
	private WeaponsDBConnector() { }
	
	
// Connection initialize
	private static void initConnection() {
		try {
			OracleDataSource dataSource = new OracleDataSource();
			dataSource.setURL(URL);
			dataSource.setUser(USER);
			dataSource.setPassword(PW);
			
			conn = dataSource.getConnection();
			System.out.println("접속 성공");
			
		} catch(SQLException e) {
			System.out.println("접속에러 : " + e.getMessage());
		}
	}
	
	
	public static void close(Connection connection) {
		try {
			if(connection != null) {
				connection.close();
			}
			
		} catch(SQLException e) {
			System.out.println("종료에러 : " + e.getMessage());
		}
	}
	
	
	public static void close(PreparedStatement preparedStatement) {
		try {
			if(preparedStatement != null) {
				preparedStatement.close();
			}
			
		} catch(SQLException e) {
			System.out.println("종료에러 : " + e.getMessage());
		}
	}
	
	
	public static void close(ResultSet resultSet) {
		try {
			if(resultSet != null) {
				resultSet.close();
			}
			
		} catch(SQLException e) {
			System.out.println("종료에러 : " + e.getMessage());
		}
	}
}
