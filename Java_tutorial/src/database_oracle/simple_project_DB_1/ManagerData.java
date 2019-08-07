package database_oracle.simple_project_DB_1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManagerData {
	public MemberDTO dto = new MemberDTO();
	public MemberDAO dao = new MemberDAO();
	
	public static Scanner scanner;
	
	static {
		scanner = new Scanner(System.in);
	}
	
	public void inputData() {
		// id 입력시, 잘못된 데이터 처리(정수형 입력)
		//		- 정수 이외는 예외처리로 재입력
		// id 중복 처리
		
		// ID 입력부
		do {
			try {
				System.out.print("ID입력 : ");
				dto.setId(scanner.nextInt());
				
				if(dao.isDuplicate(dto)) { continue; }
				
				scanner.nextLine();	// 버퍼상 ENTER값 지우기
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("ID는 정수만 가능합니다\n");
				scanner.nextLine();
			}
		} while(true);
		
		// 이름 입력부		
		System.out.print("이름입력 : ");
		dto.setName(scanner.nextLine());
		
		// 비번 입력부
		System.out.print("비번입력 : ");
		dto.setPassword(scanner.nextLine());
		
		// email 입력부
		while(true) {
			System.out.print("email입력 : ");
			String email = scanner.nextLine();
			dto.setEmail(email);
			
			if(dao.isValidEmail(dto)) {
				break;
				
			} else {
				System.out.println("유효하지 않은 Email 입니다\n");
			}
		}
		
		// 완성된 DTO를 DAO로 보내기
		boolean is_registed = false;
		
		try {
			is_registed = dao.registerMember(dto);
			
		} catch(SQLException e) {
			System.out.println("등록실패 : " + e.getMessage());
		}
		
		if(is_registed) { System.out.println("회원가입 성공"); }
		else { System.out.println("회원가입 실패"); }
		
		System.out.println();
	}
	
	
	public void writeAll() {
		System.out.println("전체 회원 출력 페이지");
		
		ArrayList<MemberDTO> list = dao.get_all_list();
		for(Iterator<MemberDTO> itr = list.iterator(); itr.hasNext(); ) {
			MemberDTO cur_dto = itr.next();
			System.out.printf("[%10d] | [%10s] | [%10s] | [%10s]\n",
					cur_dto.getId(), cur_dto.getName(),
					cur_dto.getPassword(), cur_dto.getEmail());
		}
	}
	
	
	public void searchName() {
		System.out.println("이름으로 회원 검색 페이지");
		System.out.print("검색할 이름 : ");
		String input_name = scanner.nextLine();
		
		ArrayList<MemberDTO> list = null;
		MemberDTO cur_dto = null;
		
		list = dao.get_search_name(input_name);
		
		for(Iterator<MemberDTO> itr = list.iterator(); itr.hasNext(); ) {
			cur_dto = itr.next();
			System.out.printf("[%10d] | [%10s] | [%10s] | [%10s]\n",
					cur_dto.getId(), cur_dto.getName(),
					cur_dto.getPassword(), cur_dto.getEmail());
		}
	}
	
	
	public void modifyData() {
		System.out.println("회원 수정 페이지");
		int cur_id = 0;
		
		while(true) {
			try {			
				System.out.print("수정할 회원번호 입력 : ");
				cur_id = scanner.nextInt();
				scanner.nextLine();
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("** 회원번호는 숫자입니다 **\n");
				scanner.nextLine();
				
			}
		}
		
		dao.modify_data(cur_id);
	}
	
	
	public void deleteData() {
		System.out.println("회원 탈퇴");
		int delete_id = 0;
		
		while(true) {
			try {
				System.out.print("탈퇴 ID 입력 : ");
				delete_id = scanner.nextInt();
				scanner.nextLine();
				
				break;
				
			} catch(InputMismatchException e) {
				System.out.println("회원번호는 숫자입니다 : " + e.getMessage());
				scanner.nextLine();
			}
		}
		
		dao.delete_data(delete_id);
	}
	
	
	public void delete_all() {
		dao.delete_all();
	}
}
