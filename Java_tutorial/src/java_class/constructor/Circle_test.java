package java_class.constructor;

public class Circle_test {
	public static void main(String[] args) {
		Circle circle_1 = new Circle();
		
		circle_1.set_name("5를 가진 원");
		circle_1.set_radius(20);
		
		double area_1 = circle_1.get_area();
		
		System.out.println(circle_1.get_name() + "의 면적 : " + area_1);
		
		// 매개변수가 있는 생성자 메소드로 작성하여 면적 출력
		
		Circle circle_2 = new Circle("자바피자", 3);
		double area_2 = circle_2.get_area();
		System.out.println(circle_2.get_name() + "의 면적 : " + area_2);
		
		circle_2.set_radius(30);
		circle_2.set_name("자바호떡");
		double area_3 = circle_2.get_area();
		System.out.println(circle_2.get_name() + "의 면적 : " + area_3);
		circle_2.print_inform();
	}
}
