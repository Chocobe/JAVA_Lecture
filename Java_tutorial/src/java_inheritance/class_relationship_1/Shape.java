package java_inheritance.class_relationship_1;

// 도형을 표현하는 클래스

public class Shape {
	private String color = "Magenta";
	
	public void draw() {
		System.out.printf("Color : %s", this.color);
	}
	
	
	public String get_color() {
		return this.color;
	}
	
	public void set_color(String _color) {
		this.color = _color;
	}
}
