package project_lecture_sequence.lecture_system;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Teacher extends Person {
	private final Bookstore_owner bookstore;
	private HashMap<String, Student> my_students;
	private String book;
	
	
// 생성자
	public Teacher(String _name, int _age, String _tel, String _book) {
		super(_name, _age, _tel);
		this.my_students = new HashMap<String, Student>();
		this.bookstore = new Bookstore_owner();
		this.book = _book;
	}
	
	
// 학생 모집하기
	public void accept_student(String _name, int _age, String _tel) {
		this.accept_student(_name, _age, _tel, 90);
	}
	
	public void accept_student(String _name, int _age, String _tel, int _attend_rate) {
		Student student = Student.register(_name, _age, _tel, _attend_rate);
		this.my_students.put(_name, student);
	}// end accept_student()
	
	
// 교제 준비하기
	public void prepare_book() {
		if(this.bookstore.order_book(this.book)) {
			try {
				Thread.sleep(1000);
				System.out.println("\"" + this.book + "\" 책을 수령하였습니다");
				
				Student cur_student = null;
				String student_name = "";
				Set<String> students_set = this.my_students.keySet();
				Iterator<String> students_itr = students_set.iterator();
				
				while(students_itr.hasNext()) {
					student_name = students_itr.next();
					cur_student = this.my_students.get(student_name);
					
					cur_student.set_book(this.book);
				}
				
				Thread.sleep(1000);
				System.out.println("교제 지급이 완료 되었습니다");

			} catch(InterruptedException e) {
				return;
			}
			
		} else {
			System.out.println("교제를 구할 수 없었습니다");
		}
	}
	
	
// 재정의
	@Override
	public void print_info() {
		super.print_info();
		System.out.println("교제 : " + this.book);
	}
}
