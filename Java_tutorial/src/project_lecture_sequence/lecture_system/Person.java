package project_lecture_sequence.lecture_system;

public class Person {
	private String name;
	private int age;
	private String tel;
	
	
// 생성자	
	public Person(String _name, int _age, String _tel) {
		this.name = _name;
		this.age = _age;
		this.tel = _tel;
	}
	
	
// 필드 접근자
	public String get_name() {
		return this.name;
	}
	
	public int get_age() {
		return this.age;
	}
	
	public String get_tel() {
		return this.tel;
	}
	
	
// 정보 출력
	public void print_info() {
		System.out.println("[" + this.name + "의 정보]");
		System.out.println("나이 : " + this.age);
		System.out.println("연락처 : " + this.tel);
	}
	
	
// 출근하기
	public void go_to_work() {
		System.out.println(this.name + " : 출근합니다");
	}
	
	
// 귀가하기
	public void go_home() {
		System.out.println(this.name + " : 퇴근합니다");
	}
	
	
// 점심 먹기
	public void have_lunch() {
		System.out.println(this.name + " : 점심을 먹습니다");
	}
	
	
// 휴식하기
	public void rest() {
		System.out.println(this.name + " : 쉽니다");
	}
}
