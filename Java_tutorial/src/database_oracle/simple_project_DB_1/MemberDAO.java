package database_oracle.simple_project_DB_1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database_oracle.util.DBConnection;

// DAO : Data Access Object
// 데이터베이스 기능을 구현하는 클래스
// (자료저장, 조회, 수정, 삭제)

public class MemberDAO {
	private PreparedStatement pre_statement;
	private ResultSet result_set;
	
	
	public int registerMember(MemberDTO _dto) {
		String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";
		
		int result_state = 0;
		
		try {
			pre_statement =  DBConnection.connection.prepareStatement(sql);
			pre_statement.setInt(1, _dto.getId());
			pre_statement.setString(2, _dto.getName());
			pre_statement.setString(3, _dto.getPassword());
			pre_statement.setString(4, _dto.getEmail());
			
			result_state = pre_statement.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("입력 오류 : " + e.getMessage());
		}		
		
		return result_state;
	}
}
