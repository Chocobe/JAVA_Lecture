package school_management;

import static java.lang.System.out;

import java.util.Scanner;

public class Staff extends Person {
	private int id;			// 사번
	private String department;	// 부서
	
	
// 생성자
	public Staff(
			String _name, String _address, int _id, String _department) {
		super(_name, _address);
		this.set_id(_id);
		this.set_department(_department);
	}
// 생성자
	
	
// id
	@Override
	public void set_id(int _id) {
		this.id = _id;
	}

	@Override
	public int get_id() {
		return this.id;
	}
// id
	
	
// department
	public String get_department() {
		return this.department;
	}
	
	public void set_department(String _department) {
		this.department = _department;
	}
// department
	
	
// 직원 정보 입력
	@Override
	public void input_info() {
		// 이름, 주소 입력
		try {
			super.input_info();
			
		} catch(NotSupportNameException e) {
			out.println(e.getMessage());
			return;
		}
		
		// 사번, 부서 입력
		Scanner scanner = new Scanner(System.in);
		
		out.print("사번 입력 : ");
		int temp_id = scanner.nextInt();
		this.set_id(temp_id);
		scanner.nextLine();
		
		out.print("부서 입력 : ");
		String temp_department = scanner.nextLine();
		this.set_department(temp_department);
		
		scanner.close();	// 의심되는 부분
	}
// 직원 정보 입력
	
	
// 직원 정보 출력
	// 직원 정보를 문자열로 반환하는 메소드
	@Override
	public String get_info() {
		return super.get_info() + "\n사번 : " + this.get_id() + "\n부서 : " + this.get_department();
	}
	
	
	// 직원 정보를 콘솔에 출력하는 메소드
	@Override
	public void print_all() {
		out.println(this.get_info());
	}
// 직원 정보 출력
}
