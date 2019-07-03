package java_class.constructor;

public class Circle {
	private int radius;
	private String name;
	
	public Circle() {}
	
	public Circle(String _name, int _radius) {
		this.set_name(_name);
		this.set_radius(_radius);		
	}
	
	public void set_radius(int _radius) {
		this.radius = _radius;
	}
	
	public int get_radius() {
		return radius;
	}
	
	public void set_name(String _name) {
		this.name = _name;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public double get_area() {
		return this.radius * this.radius * 3.14;
	}
	
	public void print_inform() {
		double area = this.radius * this.radius * 3.14F;
		System.out.println(this.name + "의 면적 : " + area);
	}
}
