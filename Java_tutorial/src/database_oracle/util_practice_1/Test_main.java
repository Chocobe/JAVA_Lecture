package database_oracle.util_practice_1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test_main {
	public static void main(String[] args) {
		Statement statement = null;
		ResultSet result_set = null;
		
		try {
			statement = DBConnection.get_connection().createStatement();
			
			String sql = "SELECT * FROM EMP_TEMP";
			
			result_set = statement.executeQuery(sql);
			while(result_set.next()) {
				System.out.printf("[EMPNO : %d] | " +
								  "[ENAME : %s]\n", 
								  result_set.getInt("EMPNO"),
								  result_set.getString("ENAME"));
			}
			
		} catch (SQLException e) {
			System.out.println("Statement 에러 : " + e.getMessage());
		}
	}
}
