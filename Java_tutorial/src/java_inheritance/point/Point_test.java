package java_inheritance.point;

public class Point_test {
	public static void main(String[] args) {
		Point point = new Point();
		point.set_point_x(100);
		point.set_point_y(100);
		
		point.show_point();
		
		print_line();
		
		Color_point color_point = new Color_point(90, 90, "Cyon");
//		color_point.set_point_x(500);
//		color_point.set_point_y(500);
//		color_point.set_color("Magenta");
		
		color_point.show_color_point();
	}
	
	public static void print_line() {
		System.out.println("----------------");
	}
}
