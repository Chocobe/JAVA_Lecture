package java_inheritance.class_relationship;

// 좌표

public class Point {
	private int pos_x;
	private int pos_y;
	
	
	// 생성자
	public Point() {
		this(0, 0);
	}
	
	public Point(int _x, int _y) {
		this.pos_x = _x;
		this.pos_y = _y;
	}
	// 생성자
	
	
	// pos_x getter
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(int) x좌표값
	public int get_pos_x() {
		return this.pos_x;
	}
	
	
	// pos_x setter
	// @author	:	Chocobe
	// @param	:	int _x : x좌표값
	// @return	:	N/A
	public void set_pos_x(int _x) {
		this.pos_x = _x;
	}
	
	
	// pos_y getter
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(int) y좌표값
	public int get_pos_y() {
		return this.pos_y;
	}
	
	
	// pos_x setter
	// @author	:	Chocobe
	// @param	:	int _y : y좌표값
	// @return	:	N/A
	public void set_pos_y(int _y) {
		this.pos_y = _y;
	}
	
	
	// x, y 한번에 얻기 (Sting 형)
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(String) (x값,y값)
	public String get_pos_x_y() {
		return "(" + this.pos_x + "," + this.pos_y + ")";
	}
}
