package java_inheritance.point;

public class Color_point extends Point {
	private String color;
	
	// 생성자
	public Color_point() {
		this(0, 0, "White");
	}
	
	public Color_point(int _x, int _y, String _color) {
		super(_x, _y);
		this.color = _color;
	}
	// 생성자
	
	
	public String get_color() {
		return this.color;
	}
	
	public void set_color(String _color) {
		this.color = _color;
	}
	
	
	public void show_color_point() {
		System.out.print("color : " + this.color + ", ");
		show_point();
	}
}
