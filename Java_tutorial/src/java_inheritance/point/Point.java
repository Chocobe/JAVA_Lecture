package java_inheritance.point;

public class Point {
	private int x;
	private int y;
	
	// 생성자
	public Point() {
		this(0, 0);
	}
	
	public Point(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}
	// 생성자
	
	
	public void set_point_x(int _x) {
		this.x = _x;
	}
	
	public int get_point_x() {
		return this.x;
	}
	
	
	public void set_point_y(int _y) {
		this.y = _y;
	}
	
	public int get_point_y() {
		return this.y;
	}
	
	public void show_point() {
		System.out.println("x : " + x + ", y : " + y);
	}
}
