package database_oracle.simple_project_DB_1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database_oracle.util_OracleDataSource.DBConnection_data_source;

// DAO : Data Access Object
// 데이터베이스 기능을 구현하는 클래스
// (자료저장, 조회, 수정, 삭제)

public class MemberDAO {
	private Connection conn;
	
	
// 생성자
	public MemberDAO() {
		this.conn = DBConnection_data_source.get_connection();
	}
	
	
// 회원등록
	public boolean registerMember(MemberDTO _dto) throws SQLException {
		String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";
		PreparedStatement pre_statement = null;
		
		int result_state = 0;
		
		try {
			pre_statement =  this.conn.prepareStatement(sql);
			pre_statement.setInt(1, _dto.getId());
			pre_statement.setString(2, _dto.getName());
			pre_statement.setString(3, _dto.getPassword());
			pre_statement.setString(4, _dto.getEmail());
			
			result_state = pre_statement.executeUpdate();
			
		} finally {
			DBConnection_data_source.close(pre_statement);
		}
		
		if(result_state == 1) {return true; }
		else { return false; }
	}
	
	
// ID 중복 검사
	public boolean isDuplicate(MemberDTO _dto) {
		PreparedStatement pre_statement = null;
		ResultSet result_set = null;	
		
		boolean isDuplicate = false;
		int cur_id = _dto.getId();
		
		String sql = "SELECT ID FROM MEMBER WHERE ID = ?";
		
		try {
			pre_statement = this.conn.prepareStatement(sql);
			pre_statement.setInt(1, cur_id);
			result_set = pre_statement.executeQuery();
			
			while(result_set.next()) {
				System.out.println(cur_id + "은(는) 중복된 ID입니다");
				isDuplicate = true;
				break;
			}
			
		} catch(SQLException e) {
			System.out.println("SELECT 에러 : " + e.getMessage());
		
		} finally {
			DBConnection_data_source.close(pre_statement);
			DBConnection_data_source.close(result_set);
		}
		
		return isDuplicate;
	}
	
	
// Email 유효검사
	public boolean isValidEmail(MemberDTO _dto) {
		boolean is_valid = true;
		String email = _dto.getEmail();
		
		if(email.indexOf("@") == -1) {
			is_valid = false;
		}
		
		return is_valid;
	}

	
// 정보 전체 반환
	public ArrayList<MemberDTO> get_all_list() {
		PreparedStatement pre_statement = null;
		ResultSet result_set = null;
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "SELECT * FROM MEMBER";
		MemberDTO cur_dto = null;
		
		try {
			pre_statement = this.conn.prepareStatement(sql);
			result_set = pre_statement.executeQuery();
			
			while(result_set.next()) {
				cur_dto = new MemberDTO();
				cur_dto.setId(result_set.getInt("ID"));
				cur_dto.setName(result_set.getString("NAME"));
				cur_dto.setPassword(result_set.getString("PASSWORD"));
				cur_dto.setEmail(result_set.getString("EMAIL"));
				
				list.add(cur_dto);
				
			}
			
			System.out.println("전체 정보 가져오기 완료");
			
		} catch(SQLException e) {
			System.out.println("전체 정보 가져오기 실패 : " + e.getMessage());
			
		} finally {
			System.out.println();
			DBConnection_data_source.close(pre_statement);
			DBConnection_data_source.close(result_set);
		}
		
		return list;
	}
	
	
// 이름으로 검색
	public ArrayList<MemberDTO> get_search_name(String _name) {
		PreparedStatement pre_statement = null;
		ResultSet result_set = null;
	
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		String sql = "SELECT * FROM MEMBER WHERE NAME LIKE '%" + _name + "%'";
		MemberDTO dto = null;
		
		try {
			pre_statement = this.conn.prepareStatement(sql);
			result_set = pre_statement.executeQuery();
			
			while(result_set.next()) {
				dto = new MemberDTO();
				
				dto.setId(result_set.getInt("ID"));
				dto.setName(result_set.getString("NAME"));
				dto.setPassword(result_set.getString("PASSWORD"));
				dto.setEmail(result_set.getString("EMAIL"));
				
				list.add(dto);
			}
			
			System.out.println(_name + "정보 가져오기 완료");
			
		} catch(SQLException e) {
			System.out.println("SELECT 에러 : " + e.getMessage());
			
		} finally {
			try {
				if(pre_statement != null) { pre_statement.close(); }
				if(result_set != null) { result_set.close(); }
				
			} catch(SQLException e) {
				System.out.println("비정상 종료 : " + e.getMessage());
				
			} finally {
				DBConnection_data_source.close(result_set);
				DBConnection_data_source.close(pre_statement);
			}
		}

		return list;
	}
	
	
// 회원 수정
	public void modify_data(int _id) {
		PreparedStatement pre_statement = null;
		String password = "";
		String email = "";
		String sql = "UPDATE MEMBER SET " +
					 "PASSWORD = ?, EMAIL = ?" +
					 "WHERE ID = ?";

		System.out.print("비밀번호 변경 : ");
		password = ManagerData.scanner.nextLine();
		
		while(true) {
			System.out.print("이메일 변경 : ");
			email = ManagerData.scanner.nextLine();
			
			MemberDTO temp = new MemberDTO();
			temp.setEmail(email);
			if(isValidEmail(temp)) {
				break;
				
			} else {
				System.out.println("유효하지 않은 Email입니다\n");
			}
		}
		
		int update_state = 0;
		
		try {
			pre_statement = conn.prepareStatement(sql);
			pre_statement.setString(1, password);
			pre_statement.setString(2, email);
			pre_statement.setInt(3, _id);
			
			update_state = pre_statement.executeUpdate();
			
			if(update_state == 1) {
				System.out.println("[회원번호 : " + _id + "]의 정보가 수정되었습니다");
				
			} else {
				System.out.println("[회원번호 : " + _id + "] 회원 정보 수정 실패");
			}
			
		} catch(SQLException e) {
			System.out.println("정보수정 에러 : " + e.getMessage());
			
		} finally {
			System.out.println();
			DBConnection_data_source.close(pre_statement);
		}
	}
	
	
// 전체 삭제
	public void delete_all() {
		PreparedStatement pre_statement = null;
		String sql = "DELETE FROM MEMBER";
		
		try {
			pre_statement = conn.prepareStatement(sql);
			pre_statement.executeUpdate(sql);
			System.out.println("전체 데이터 삭제 완료");
			
		} catch (SQLException e) {
			System.out.println("삭제 에러 : " + e.getMessage());
			
		} finally {
			DBConnection_data_source.close(pre_statement);
		}
	}
	
	
// 회원 삭제
	public void delete_data(int _id) {
		PreparedStatement pre_statement = null;
		String sql = "DELETE FROM MEMBER WHERE ID = ?";
		
		try {
			pre_statement = conn.prepareStatement(sql);
			pre_statement.setInt(1, _id);
			int result_state = pre_statement.executeUpdate();
			
			if(result_state == 1) {
				System.out.println("[회원번호 : " + _id + "] 데이터 삭제 완료");
				
			} else {
				System.out.println("[회원번호 : " + _id + "] 데이터가 존재하지 않습니다");
			}
			
		} catch(SQLException e) {
			System.out.println("삭제 에러 : " + e.getMessage());
			
		} finally {
			DBConnection_data_source.close(pre_statement);
		}
	}
}
