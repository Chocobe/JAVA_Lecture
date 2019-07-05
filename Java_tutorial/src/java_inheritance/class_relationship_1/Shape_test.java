package java_inheritance.class_relationship_1;

public class Shape_test {
	public static void main(String[] args) {
		
		// 원 만들기
		System.out.println("원 만들기");
		Circle circle_1 = new Circle(new Point(100, 200), 50);
		circle_1.draw();
		
		print_line();
		
		// 삼각형 만들기
		System.out.println("삼각형 만들기");
		Point[] point = { new Point(100, 200), new Point(200, 300), new Point(300, 400) };
		Triangle triangle = new Triangle(point);
		triangle.draw();
		
		print_line();
	}
	
	
	public static void print_line() {
		System.out.println("----------------------------------------------------------------");
	}
}
