package database_oracle.delete_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 사원번호가 9991인 데이터 삭제하기

public class Delete_test {
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
	
	public Connection connection;
	public Statement statement;
	
	public Delete_test() {
		init_DB();
		
	}
	
	
	private void init_DB() {
		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 구동 완료");
			
			connection = DriverManager.getConnection(URL, ID, PW);
			System.out.println(ID + "계정 접속 완료");
			
			statement = connection.createStatement();
			System.out.println("쿼리 작성 준비 완료");
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 구동 에러 : " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("에러 : " + e.getMessage());
		}
	}
	
	
	public void delete_empno(int _empno) {
		String sql = "DELETE FROM EMP_JAVA WHERE EMPNO = ";
		sql += _empno;
		
		try {
			statement.executeUpdate(sql);
			
			System.out.println(_empno + "번 사원의 정보를 삭제하였습니다");
			
		} catch (SQLException e) {
			System.out.println("삭제 에러 : " + e.getMessage());
		}
	}
	
	
	public void select_employee(int _empno) {
		String sql = "SELECT * FROM EMP_JAVA WHERE EMPNO = ";
		sql += _empno;
		
		try {
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d",
						rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("JOB"),
						rs.getInt("MGR"), rs.getString("HIREDATE"), rs.getInt("SAL"),
						rs.getInt("COMM"), rs.getInt("DEPTNO"));
				// empno, ename, job, mgr, hiredate, sal, comm, deptno
			}
			
		} catch (SQLException e) {
			System.out.println("SELECT 쿼리 에러 : " + e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		Delete_test del = new Delete_test();
		
//		del.delete_empno(9954);
		
		del.select_employee(9991);
	}
}
