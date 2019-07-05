package java_inheritance.class_relationship_1;

// 삼각형은 도형이다.

public class Triangle extends Shape {
	private Point[] point = new Point[3];
	
	// 생성자
	public Triangle(Point[] _point) {
		this.point =  _point;
	}
	// 생성자
	
	
	// draw() 메소드 재정의(override)
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	@Override
	public void draw() {
		System.out.printf("[point_1 : %s, point_2 : %s, point_3 : %s]\n",
				this.point[0].get_pos_x_y(), this.point[1].get_pos_x_y(), this.point[2].get_pos_x_y());
	}
}
