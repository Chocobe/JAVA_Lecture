package database_oracle.select_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_test {
	public static void main(String[] args) {
	// SELECT를 쓰기 위한 준비
		// Database 접속
		Connection conn = null;

		// Statement : 쿼리를 작성하고, 전송하는 객체
		Statement st = null;
		
		// ResultSet : 쿼리의 결과 집합 객체
		ResultSet rs = null;
		
		// 구동 드라이버, URL, USER, PASSWORD
		final String DRIVER_PATH = "oracle.jdbc.driver.OracleDriver";
		final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		final String USER = "scott";
		final String PASSWORD = "tiger";
		
		// JAVA에서 전송할 SQL문은 세미콜론(;)은 제외하고 작성한다.
		String sql = "SELECT * FROM EMP";
		
		try {
			// 1. 구동 드라이버 설정
			Class.forName(DRIVER_PATH);
			
			// 2. URL, USER, PASSWORD로 접속
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// 3. 접속완료 메시지 출력
			System.out.println("Database 접속 성공");
			
			// 4. 쿼리 객체 생성
			st = conn.createStatement();
			
			// 5. 쿼리 객체에 SQL문을 담아서 Database에 전송하여, 쿼리의 결과값을 가져온다
			rs = st.executeQuery(sql);
			
			// 6. 쿼리 결과 출력해 보기
			System.out.println("사원번호\t" + "사원명");
			while(rs.next()) {
				System.out.println(rs.getInt("EMPNO") + " : " + rs.getString("ENAME"));
			}
			
			// 7. 사용 후 클래스(스트림?) 닫기
			rs.close();
			st.close();
			conn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println("오라클 구동 파일을 찾을 수 없습니다 : " + e.getMessage());
			
		} catch(SQLException e) {
			System.out.println("접속 실패 : " + e.getMessage());
		}
	}
}
