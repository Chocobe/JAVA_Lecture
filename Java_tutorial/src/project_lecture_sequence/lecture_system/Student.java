package project_lecture_sequence.lecture_system;

public class Student extends Person {
	private final int attend_rate;
	
	private boolean today_attend;
	private String book;
	

// 생성자	
	private Student(String _name, int _age, String _tel, int _attend_rate) {
		super(_name, _age, _tel);
		this.attend_rate = _attend_rate;
		this.today_attend = false;
		this.book = "";
	}
	
	
// 학원 등록하기 (생성자)
	public static Student register(String _name, int _age, String _tel, int _attend_rate) {
		System.out.println("\t" + _name + " 학생이 수강 등록하였습니다");		
		return new Student(_name, _age, _tel, _attend_rate);
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
			System.out.println("\t" + super.get_name() + " : 수업을 듣습니다");
		}
	}// end learn()
	
	
// 교제 받기
	public void set_book(String _book) {
		this.book = _book;
	}// end get_book()
	
	
// 재정의
// 학생 정보 출력
	@Override
	public void print_info() {
		super.print_info();
		System.out.println("교제 : " + this.book);
	}// end print_info()
	

// 등교하기
	@Override
	public void go_to_work() {
		this.is_attend();
		
		if(this.today_attend) { 
			System.out.println("\t" + super.get_name() + " : 등교합니다");
			
		} else {
			System.out.println("\t" + super.get_name() + " : 결석...");
		}
	}// end go_to_work()
}
