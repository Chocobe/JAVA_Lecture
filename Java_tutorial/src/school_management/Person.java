package school_management;

// 콘솔 출력용 코드 System.를 생략하기 위한 import
import static java.lang.System.out;

import java.util.Scanner;

abstract public class Person {
	private String name;
	private String address;
	
	Scanner scanner = new Scanner(System.in);
	
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
	
	
	// 입력부
	// @author	:	Chocobe	
	// @param	:	N/A
	// @return	:	N/A
	public void input_info() {
		out.print("이름을 입력하세요 : ");
		String temp_name = scanner.nextLine();
		set_name(temp_name);
		
		out.print("주소를 입력하세요 : ");
		String temp_address = scanner.nextLine();
		set_address(temp_address);
	}
	
	
// address
	public abstract void set_id(String _id); 
	public abstract String get_id();
// address
	
	
}
