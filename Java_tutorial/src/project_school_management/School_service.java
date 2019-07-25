package project_school_management;

import static java.lang.System.out;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")
public class School_service {
	private Person[] p = new Person[30];	// 객체를 저장할 공간
	private int count;						// 저장된 데이터 개수
	
	public Person[] get_person() {
		return this.p;
	}
	
	
	public int get_count() {
		return this.count;
	}
	

	// 메인메뉴를 보여주는 메소드
	public void mainMenu() {
		out.println("---------------Main Menu---------------");
		out.println("| 1.등록 2.검색 3.삭제 4.출력 5.종료 |");
		out.println("---------------------------------------");
		out.print("번호를 입력하세요 : ");
	}
	
	
	// 하위메뉴를 보여주는 메소드
	public void subMenu() {
		out.println("---------------Sub menu----------------");
		out.println("| 1.학생 2.강사 3.직원 4.상위메뉴 |");
		out.println("---------------------------------------");
		out.print("번호를 입력하세요 : ");
	}
	
	
	public void register() {
		Scanner scanner = new Scanner(System.in);
		int no = 0;
		
		outer : while(true) {
			this.subMenu();

			try {
				no = scanner.nextInt();

			} catch(InputMismatchException e) {
				System.out.println("정수로 입력하세요");
				return;
			}
			
			switch(no) {
			case 1:
				Student student = new Student();
				student.input_info();
				this.add_person(student);
				break;
				
			case 2:
				Teacher teacher = new Teacher();
				teacher.input_info();
				this.add_person(teacher);
				break;
				
			case 3:
				Staff staff = new Staff();
				staff.input_info();
				this.add_person(staff);
				break;			
				
			case 4:	// 상위메뉴
				break outer;
				
			default:
				System.out.println("지원되지 않는 번호입니다");
			}
		}// end while(true)
	}
	
	
	// 입력받은 객체 저장
	public void add_person(Person _person) {
		if(this.count < this.p.length) {
			this.p[this.count++] = _person;
			
		} else {
			int cur_len = this.p.length;
			Person[] temp_arr = new Person[cur_len + 10];
			
			for(int i = 0; i < cur_len; i++) {
				temp_arr[i] = this.p[i];
			}
			
			temp_arr[cur_len] = _person;
			this.p = temp_arr;
		}		
	}
	
	
	// 저장된 객체 검색
	public String find_person(String _name) {
		
		for(int i = 0; i < this.count; i++) {
			// 입력된 이름과 배열에 저장된 값을 비교
			if(_name.equals(this.p[i].get_name())) {
				this.p[i].print_all();
				return this.p[i].get_info();
			}
		}
		
		System.out.println(_name + "이란 사람이 없음");
		return "이란 사람이 없음";
	}
	
	
	public String print_all() {
		String str = "";
		
		for(int i = 0; i < this.count; i++) {
			if(this.p[i] instanceof Student) {
				str += "\n---학생정보---\n";
				
			} else if(this.p[i] instanceof Teacher) {
				str += "\n---교사정보---\n";
				
			} else if(this.p[i] instanceof Staff) {
				str += "\n---직원정보---\n";
			}
			
			str += p[i].get_info();
			
		}// end for()
		
		out.println(str);
		
		return str;
	}
	
	
	public String delete_person(String _name) {
		for(int i = 0; i < this.count; i++) {
			String temp_name = this.p[i].get_name();
			
			if(temp_name.equals(_name)) {
				for(int j = i; j < count; j++) {
					this.p[j] = this.p[j + 1];
				}
				this.count--;
				System.out.println(_name + "님의 자료가 삭제되었습니다");
				
				return _name + "님의 자료가 삭제되었습니다";
			}
		}
		
		return _name + "님의 자료가 존재하지 않습니다";
	}
}
