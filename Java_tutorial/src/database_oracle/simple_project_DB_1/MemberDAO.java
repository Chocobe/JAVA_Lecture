package database_oracle.simple_project_DB_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database_oracle.util_practice_2.DBConnection;



// DAO : Data Access Object
// 데이터베이스 기능을 구현하는 클래스
// (자료저장, 조회, 수정, 삭제)

public class MemberDAO {
	private Connection conn;
	private PreparedStatement pre_statement;	
	
	
	public MemberDAO() {
		this.conn = new DBConnection().get_connection();
	}
	
	
	public int registerMember(MemberDTO _dto) {
		String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";
		
		int result_state = 0;
		
		try {
			pre_statement =  this.conn.prepareStatement(sql);
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
	
	
	public boolean isDuplicate(MemberDTO _dto) {
		ResultSet result_set = null; 
		boolean isDuplicate = false;
		int cur_id = _dto.getId();
		
		String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
		
		try {
			this.pre_statement = this.conn.prepareStatement(sql);
			pre_statement.setInt(1, cur_id);
			result_set = pre_statement.executeQuery();
			
			while(result_set.next()) {
				System.out.println(cur_id + "는 중복된 ID입니다\n");
				isDuplicate = true;
				break;
			}
			
		} catch(SQLException e) {
			System.out.println("SELECT 실패 : " + e.getMessage());
		}
		
		return isDuplicate;
	}
	
	
	public ArrayList<MemberDTO> get_all_list() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "SELECT * FROM MEMBER";
		MemberDTO cur_dto = null;
		
		try {
			this.pre_statement = this.conn.prepareStatement(sql);
			ResultSet rs = pre_statement.executeQuery();
			
			while(rs.next()) {
				cur_dto = new MemberDTO();
				cur_dto.setId(rs.getInt("ID"));
				cur_dto.setName(rs.getString("NAME"));
				cur_dto.setPassword(rs.getString("PASSWORD"));
				cur_dto.setEmail(rs.getString("EMAIL"));
				
				list.add(cur_dto);
			}
			
			System.out.println("전체 정보 가져오기 완료");
			
		} catch(SQLException e) {
			System.out.println("전체 정보 가져오기 실패 : " + e.getMessage());
		}
		
		return list;
	}
	
	
	public void delete_all() {
		String sql = "DELETE FROM MEMBER";
		try {
			this.pre_statement = conn.prepareStatement(sql);
			this.pre_statement.executeUpdate(sql);
			System.out.println("전체 데이터 삭제 완료");
			
		} catch (SQLException e) {
			System.out.println("삭제 에러 : " + e.getMessage());
		}
	}
	
	
	public void delete_data(MemberDTO _dto) {
		int id = _dto.getId();
		String sql = "DELETE FROM MEMBER WHERE ID = ?";
		
		try {
			pre_statement = conn.prepareStatement(sql);
			int result_state = pre_statement.executeUpdate();
			
			if(result_state == 1) {
				System.out.println(id + "데이터 삭제 완료");
				
			} else {
				System.out.println(id + "데이터가 존재하지 않습니다");
			}
			
		} catch(SQLException e) {
			System.out.println("삭제 에러 : " + e.getMessage());
		}
	}
	

	public void close() {
		try {
			this.pre_statement.close();
			this.conn.close();
			
		} catch (SQLException e) {
			System.out.println("비정상 종료 : " + e.getMessage());
		}
	}
}
