package database_oracle.insert_prepared_test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB에 넘길 쿼리문의 틀을 만드는 방법
// VALUES(...) 의 인자값을 대입하기 위해, PreparedStatement 객체 사용
//
// INSERT INTO VALUES(?, ?, ?, ?, ?, ?, ?, ?)
// 쿼리상의 ?는 "자리채움" 이라고 한다.
//
// 각 인자값은 PreparedStatement객체.set자료형(자리채움 순번값, 입력값)
// 의 형식으로 대입하게 된다.
//
// DB의 Date형은 Date.valueOf(String _val) 형식으로 입력하면 된다.
// 이 때, 매개변수값은 

public class Insert_prepared_test {
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
	public static PreparedStatement ps;
	
	
// Database 접속
	public static Connection makeConnection() {
		Connection c = null;
		
		try {
			Class.forName(DRIVER);
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
			int _empno, String _ename, String _job, int _mgr, String _hiredate, int _sal,
			double _comm, int _deptno) {
		
		String sql = "INSERT INTO EMP_JAVA VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		int result_state = 0;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, _empno);
			ps.setString(2, _ename);
			ps.setString(3, _job);
			ps.setInt(4, _mgr);
			ps.setDate(5, Date.valueOf(_hiredate));
			ps.setInt(6, _sal);
			ps.setDouble(7, _comm);
			ps.setInt(8, _deptno);
			
			result_state = ps.executeUpdate();
			
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
		
		st = con.createStatement();

		rs = st.executeQuery(sql);

		return rs;
	}
	
// 메인
	public static void main(String[] args) {
		init_connection();
		
		addEmp(9954, "World", "MANAGER", 7902, "2022-01-01", 2500, 0.0F, 10);		
		
		try {
			ResultSet rs = select_all_emp();
			
			while(rs.next()) {
				System.out.printf(
						"%6d | %6s | %10s | %s", 
						rs.getInt("EMPNO"), rs.getString("ENAME"), rs.getString("JOB"), rs.getString("HIREDATE"));
						
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}