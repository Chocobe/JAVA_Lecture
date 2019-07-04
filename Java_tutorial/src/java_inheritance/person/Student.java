package java_inheritance.person;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99 <- private 한정자 접근 불가
		set_weight(99);
	}
	
	public void print_inform() {
		System.out.println("age : " + this.age);
		System.out.println("name : " + this.name);
		System.out.println("height : " + this.height);
		System.out.println("weight : " + get_weight());
	}
}
