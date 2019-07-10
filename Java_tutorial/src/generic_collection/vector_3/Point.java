package generic_collection.vector_3;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this(0, 0);
	}
	
	public Point(int _x, int _y) {
		this.x = _x;
		this.y = _y;
	}
	
	public int get_x() {
		return this.x;
	}
	
	public void set_x(int _x) {
		this.x = _x;
	}
	
	public int get_y() {
		return this.y;
	}
	
	public void set_y(int _y) {
		this.y = _y;
	}
}
