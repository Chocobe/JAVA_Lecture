package database_oracle.insert_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_test {
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
	
	private static Connection con;
	private static Statement st;
	
	
// Database 접속
	public static Connection makeConnection() {
		Connection c = null;
		
		try {
			Class.forName(Insert_test.DRIVER);
			System.out.println("드라이버 로딩 성공");
			
			c = DriverManager.getConnection(URL, ID, PW);
			System.out.println("DB 접속 성공");
			
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다 : " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("DB에 연결할 수 없습니다 : " + e.getMessage());
		}
		
		return c;
	}// end makeConnection()
	
	
	public static void init_connection() {
		con = makeConnection();
	}
	
	
// 사원추가
	public static void addEmp(
			int _empno, String _ename, String _job, String _hiredate, int _sal,
			double _comm, int _deptno) {
		
		String sql = "INSERT INTO EMP_JAVA(" +
				"EMPNO, ENAME, JOB, HIREDATE, SAL, COMM, DEPTNO) " + 
				"VALUES ";
		int result_state = 0;
		
		sql += "(" + _empno + ", '" + _ename + "', '" + _job + "', " +
			   "TO_DATE('" + _hiredate + "', 'yyyy-mm-dd'), " + _sal + ", " +
			   _comm + ", " + _deptno + ")";
		
		try {
			st = con.createStatement();
			result_state = st.executeUpdate(sql);
			
		} catch (SQLException e) {
			System.out.println("데이터 입력 실패 : " + e.getMessage());
		}
		
		if(result_state == 1) {
			System.out.println("튜플이 정상적으로 입력되었습니다");
			
		} else {
			System.out.println("튜플 입력 실패");
		}
	}
	
	
// 전체 사원 조회하기
	public static ResultSet select_all_emp()  throws SQLException {
		String sql = "SELECT * FROM EMP_JAVA";
		ResultSet rs = null;

		rs = st.executeQuery(sql);

		return rs;
	}
	
// 메인
	public static void main(String[] args) {
		init_connection();
		
		addEmp(9999, "JAVA", "MANAGER", "2019-01-01", 2500, 0.0F, 10);

		try {
			ResultSet rs = select_all_emp();
			
			while(rs.next()) {
				System.out.printf(
						"%6d | %6s | %10s | %s", 
						rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("JOB"), rs.getString("HIREDATE"));
						
						//"EMPNO, ENAME, JOB, HIREDATE, SAL, COMM, DEPTNO)
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
