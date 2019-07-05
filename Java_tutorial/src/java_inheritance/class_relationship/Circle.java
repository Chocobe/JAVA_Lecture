package java_inheritance.class_relationship;

public class Circle extends Shape {
	Point center;
	int radius;
	
	// 생성자
	public Circle() {
		this(new Point(0, 0), 100);
	}
	
	public Circle(Point _center, int _radius) {
		this.center = _center;
		this.radius = _radius;
	}
	// 생성자
	
	
	// draw() 메소드 재정의(override)
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	@Override
	public void draw() {
		System.out.printf("[center : (%d, %d), radiuse : %d, Colocr : %s]\n",
				this.center.get_pos_x(), this.center.get_pos_y(), this.radius, this.get_color());
	}
}
