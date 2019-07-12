package school_management;

// 콘솔 출력용 코드 System.를 생략하기 위한 import
import static java.lang.System.out;

import java.util.Scanner;

abstract public class Person {
	private String name;		// 이름
	private String address;		// 주소
	
	
// 생성자
	public Person() {
		this("N/A", "N/A");
	}
	
	public Person(String _name, String _address) {
		// getter, setter를 생성했다면, 생성자에서 그 메소드를 호출하자. (새로 작성할 필요가 없다.)
		set_name(_name);
		set_address(_address);
	}
// 생성자
	
	
// address
		public abstract void set_id(String _id); 
		
		public abstract String get_id();
// address
	
	
// name
	public void set_name(String _name) {
		this.name = _name;
	}
	
	public String get_name() {
		return this.name;
	}
// name
	
	
// address
	public void set_address(String _address) {
		this.address = _address;
	}
	
	public String get_address() {
		return this.address;
	}
	
	
	// 사람 정보 입력
	// @author	:	Chocobe	
	// @param	:	N/A
	// @return	:	N/A
	public void input_info() throws NotSupportNameException {
		Scanner scanner = new Scanner(System.in);
		// 이름 입력부
		out.print("이름을 입력하세요 : ");
		String temp_name = scanner.nextLine();
		
		// 문자열 객체.startWith("문자") : 첫번째 문자 검사
		if(temp_name.startsWith("콩")) {
			throw new NotSupportNameException("콩씨를 등록할 수 없음");
			
		} else if(temp_name.startsWith("팥")) {
			throw new NotSupportNameException("팥씨를 등록할 수 없음");
		}
		set_name(temp_name);
		
		
		// 주소 입력부
		out.print("주소를 입력하세요 : ");
		String temp_address = scanner.nextLine();
		set_address(temp_address);
		
		scanner.close();
	}
	
	
	// 사람의 정보를 문자열로 반환하는 메소드
	public String get_info() {
		String info = "이름 : " + this.name + "\n" + "주소 : " + this.address;
		return info;
	}
	
	
	// 사람 정보를 콘솔에 출력하는 메소드
	public void print_all() {
		out.println(get_info());
	}
	
	
	// 이름 반환
	@Override
	public String toString() {
		return this.name;
	}
}
