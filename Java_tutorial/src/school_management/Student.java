package school_management;

import static java.lang.System.out;

import java.util.Scanner;

public class Student extends Person {
	private int id;			// 학번
	private String class_name;	// 학급
	
	
// 생성자
	public Student() {
		this("N/A", "N/A", 0, "N/A");
	}
	
	public Student(
			String _name, String _address, int _id, String _class_name) {
		super(_name, _address);
		this.set_id(_id);
		this.set_class_name(_class_name);
	}
// 생성자
	
	
// id
	@Override
	public int get_id() {
		return this.id;
	}
	
	@Override
	public void set_id(int _id) {
		this.id = _id;
	}
// id
	
	
// class_name
	public String get_class_name() {
		return this.class_name;
	}
	
	public void set_class_name(String _class_name) {
		this.class_name = _class_name;
	}
// class_name
	
	
// 학생 정보 입력
	@Override
	public void input_info() {
		// 이름, 주소 입력
		try {
			super.input_info();
			
		} catch(NotSupportNameException e) {
			out.println(e.getMessage());
			return;
		}
		
		// 학번, 학급 입력
		Scanner scanner = new Scanner(System.in);
		
		out.print("학번 입력 : ");
		int temp_id = scanner.nextInt();
		this.set_id(temp_id);
		scanner.nextLine();
		
		out.print("학급 입력 : ");
		String temp_class_name = scanner.nextLine();
		this.set_class_name(temp_class_name);
		
		scanner.close(); // 의심되는 부분
	}
// 학생 정보 입력
	

// 학생 정보 출력
	// 학생 정보를 문자열로 반환하는 메소드
	@Override
	public String get_info() {
		return super.get_info() + "\n학번 : " + this.get_id() + "\n학급 : " + this.get_class_name();
	}
	
	
	// 학생 정보를 콘솔에 출력하는 메소드
	@Override
	public void print_all() {
		out.println(this.get_info());
	}
// 학생 정보 출력
}
