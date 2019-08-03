package project_lecture_sequence.lecture_system;

public class Student implements Person {
	private final String name;
	private final int age;
	private final String tel;
	private final int attend_rate;
	
	private boolean today_attend;
	private String book;
	

// 생성자
	public Student(String _name, int _age, String _tel) {
		this(_name, _age, _tel, 90);
	}
	
	public Student(String _name, int _age, String _tel, int _attend_rate) {
		this.name = _name;
		this.age = _age;
		this.tel = _tel;
		this.attend_rate = _attend_rate;
		
		this.today_attend = false;
	}
	
	
// 학생 정보 출력
	public void print_info() {
		System.out.println(this.name + "학생 정보 :");
		System.out.println("나이 : " + this.age);
		System.out.println("연락처 : " + this.tel);
		System.out.println("교제 : " + this.book);
	}
	
	
// 출석 여부
	private void is_attend() {
		int today_attend = (int)(Math.random() * 100);
		
		if(today_attend > this.attend_rate) {
			this.today_attend = false;
			
		} else {
			this.today_attend = true;
		}
	}// end is_attend()
	
	
// 배우기
	public void learn() {
		if(this.today_attend) {
			System.out.println("\t" + this.name + " : 수업을 듣습니다");
		}
	}
	
	
// 교제 받기
	public void get_book(String _book) {
		this.book = _book;
	}
	
	
// 재정의
	@Override
	public void go_to_work() {
		this.is_attend();
		
		if(this.today_attend) { 
			System.out.println("\t" + this.name + " : 등교합니다");
			
		} else {
			System.out.println("\t" + this.name + " : 결석...");
		}
	}// end go_to_work()

	@Override
	public void go_home() {
		if(this.today_attend) { 
			System.out.println("\t" + this.name + " : 귀가합니다");
		}
	}// end go_home()

	@Override
	public void have_lunch() {
		if(this.today_attend) { 
			System.out.println("\t" + this.name + " : 점심을 먹습니다");
		}
	}// end have_lunch()

	@Override
	public void rest() {
		if(this.today_attend) { 
			System.out.println("\t" + this.name + " : 쉽니다");
		}
	}// end rest()	
}
