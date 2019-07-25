package project_school_management;

import static java.lang.System.out;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Teacher extends Person {
	private String id;			// 교번
	private String subject;		// 과목

	
// 생성자
	public Teacher() {
		this("N/A", "N/A", "N/A", "N/A");
	}
	
	public Teacher(
			String _name, String _address, String _id, String _subject) {
		super(_name, _address);
		this.set_id(_id);
		this.set_subject(_subject);
	}
// 생성자
	
	
// id
	@Override
	public String get_id() {
		return this.id;
	}
	
	@Override
	public void set_id(String _id) {
		this.id = _id;
	}
// id
	
	
// subject
	public String get_subject() {
		return this.subject;
	}
	
	public void set_subject(String _subject) {
		this.subject = _subject;
	}
// subject
	
	
// 교사 정보 입력
	@Override
	public void input_info() {
		// 이름, 주소 입력
		try {
			super.input_info();
			
		} catch(NotSupportNameException e) {
			out.println(e.getMessage());
			return;
		}
		
		// 교번, 과목 입력
		Scanner scanner = new Scanner(System.in);
		
		out.print("교번 입력 : ");
		String temp_id = scanner.nextLine();
		this.set_id(temp_id);
		
		out.print("과목 입력 : ");
		String temp_subject = scanner.nextLine();
		this.set_subject(temp_subject);
	}
// 교사 정보 입력
	
	
// 교사 정보 출력
	// 교사 정보를 문자열로 반환하는 메소드
	@Override
	public String get_info() {
		return super.get_info() + "\n교번 : " + this.get_id() + "\n과목 : " + this.get_subject();
	}
	
	
	// 교사 정보를 콘솔에 출력하는 메소드
	@Override
	public void print_all() {
		out.println(this.get_info());
	}
// 교사 정보 출력
}
