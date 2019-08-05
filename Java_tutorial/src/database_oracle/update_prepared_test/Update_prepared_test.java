package database_oracle.update_prepared_test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update_prepared_test {
	private final static String DRIVER;
	private final static String URL;
	private final static String ID;
	private final static String PW;

	private static Connection connection;
	private static PreparedStatement pre_statement;
	
	static {
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
	}
	
	
	public Update_prepared_test() {
		this.init_DB();
	}
	
	
	private void init_DB() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 구동 성공");
			
			connection = DriverManager.getConnection(URL, ID, PW);
			System.out.println(ID + "계정 접속 완료");
		
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 구동 실패 " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("접속 실패 : " + e.getMessage());
		}
	}
	
	
	// EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO
	public void update_tuple(
			int _empno, String _ename, String _job, int _mgr,
			String _hiredate, int _sal, int _comm, int _deptno) {
		
		String sql = "UPDATE EMP_JAVA SET " +
					 "EMPNO = ?, ENAME = ?, JOB = ?, MGR = ?, " +
					 "HIREDATE = ?, SAL = ?, COMM = ?, DEPTNO = ?" +
					 "WHERE EMPNO = ?";
		int result_state = 0;
		
		try {
			pre_statement = connection.prepareStatement(sql);
			pre_statement.setInt(1, _empno);
			pre_statement.setString(2, _ename);
			pre_statement.setString(3, _job);
			pre_statement.setInt(4, _mgr);
			pre_statement.setDate(5, Date.valueOf(_hiredate));
			pre_statement.setInt(6, _sal);
			pre_statement.setInt(7, _comm);
			pre_statement.setInt(8, _deptno);
			pre_statement.setInt(9, _empno);
			
			result_state = pre_statement.executeUpdate();
			System.out.println("입력 완료");
			
			if(result_state == 1) {
				System.out.println("UPDATE 성공");
				
			} else {
				System.out.println("UPDATE 실패");
			}
			
		} catch (SQLException e) {
			System.out.println("입력 오류 : " + e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		Update_prepared_test tester = new Update_prepared_test();
		tester.update_tuple(
				9991, "Hello", "Member", 10, "1234-4-25", 
				5000, 2000, 80);
	}
}
