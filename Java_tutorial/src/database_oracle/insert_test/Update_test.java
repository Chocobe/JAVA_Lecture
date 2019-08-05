package database_oracle.insert_test;

// 사원번호가 9999인 사원의
// JOB = ANALYST, 부서 = 20 으로 변경하기


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database_oracle.util.DBConnection;

public class Update_test {
	private final static String DRIVER;
	private final static String URL;
	private final static String ID;
	private final static String PW;
	
	static {
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		ID = "scott";
		PW = "tiger";
	}
	
	private Connection con;
	private Statement st;
	
	public void init_connection() {
		Connection c = null;
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 구동 성공");
			
			c = DriverManager.getConnection(URL, ID, PW);
			System.out.println(ID + "계정의 접속 성공");
						
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 구동 실패 : " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("접속 실패 : " + e.getMessage());
		}
		
		this.con = c;
	}
	
	
	public int update_data(int _empno, String _job, int _deptno) {
		int result_state = 0;
		String sql = "UPDATE EMP_JAVA SET ";
		sql += "EMPNO = " + _empno + ", JOB = '" + _job + "', DEPTNO = " + _deptno + " ";
		sql += "WHERE ENAME = 'JAVA'";
		
		try {
			st.executeUpdate(sql);
			System.out.println("UPDATE 쿼리 정상 완료");
		} catch (SQLException e) {
			System.out.println("UPDATE 쿼리 에러 : " + e.getMessage());
		}
		
		return result_state;
	}
	
	
	public void select_emp(int _empno) {
		String sql = "SELECT EMPNO, JOB, DEPTNO " +
					 "FROM EMP_JAVA " +
					 "WHERE EMPNO = " + _empno + "";
		
		try {
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println("\n---SELECT 결과 ---");
				System.out.printf("%d, %s, %d\n\n", rs.getInt("EMPNO"), rs.getString("JOB"), rs.getInt("DEPTNO"));
			}
			
		} catch (SQLException e) {
			System.out.println("쿼리 에러 : " + e.getMessage());
		}		
	}
	
	
	public static void main(String[] args) {	
		Update_test up = new Update_test();
		up.init_connection();
		
		try {
			up.st = up.con.createStatement();
			System.out.println("쿼리 전송 준비 완료");
			
		} catch (SQLException e) {
			System.out.println("에러 : " + e.getMessage());
		}
		
		up.update_data(9991, "BOSS", 90);
		
		up.select_emp(9991);
		
		DBConnection.close();
	}
}
