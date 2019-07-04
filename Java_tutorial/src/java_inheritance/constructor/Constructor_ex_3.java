package java_inheritance.constructor;

class A {
	public A() {
		System.out.println("생성자 A");
	}
	
	public A(int _x) {
		System.out.println("매개변수 생성자 A");
	}
}

class B extends A {
	public B() {
		System.out.println("생성자 B");
	}
	
	// super로 부모의 생성자를 명시 하지 않으면, 부모 클래스의 기본 생성자(매개변수가 없는)가 호출 된다.
//	public B(int _x) {
//		System.out.println("매개변수 생성자 B");
//	}
	
	// super(_x)를 사용하여, 부모 클래스의 A(int _x) 생성자를 호출한다.
	public B(int _x) {
		super(_x);
		System.out.println("매개변수 생성자 B (super사용)");
	}
}

public class Constructor_ex_3 {
	public static void main(String[] args) {
		B b = new B(5);
		
		b.toString(); // <- 경고 지우기 위한 것 (없다고 생각하자)
	}
}
