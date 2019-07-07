package java_inheritance.super_test;

public class Child extends Parent {
	int x;
	
	// 생성자
	public Child() {
		this.x = 10;
	}
	
	
	// 출력
	public void print_inform() {
		System.out.println("x : " + x);
		System.out.println("this.x : " + this.x);
		System.out.println("super.x : " + super.x);
	}
}
