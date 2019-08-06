package database_oracle.util_practice_2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Tester {
	public static void main(String[] args) {
		Statement statement = null;
		ResultSet result_set = null;
		
		try {
			String sql = "SELECT * FROM EMP_JAVA";
			
			statement = DBConnection.get_connection().createStatement();
			result_set = statement.executeQuery(sql);
			
			while(result_set.next()) {
				System.out.printf(
						"[EMPNO : %d] | " +
						"[ENAME : %s]\n",
						result_set.getInt("EMPNO"),
						result_set.getString("ENAME"));
				
			}
			
		} catch(SQLException e) {
			System.out.println("쿼리에러 : " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");
	}
}
