package generic_collection.vector_3;

import java.util.Vector;

public class Vector_tester {
	public static void main(String[] args) {
		Vector<Point> vector = new Vector<Point>();
		vector.add(new Point(1, 2));
		vector.add(new Point(2, 3));
		vector.add(new Point(3, 1));
		vector.add(new Point(5, 5));
		
		print_vector(vector);
	}
	
	
	public static void print_vector(Vector<Point> _vector) {
		int len = _vector.size();
		
		for(int i = 0; i < len; i++) {
			Point temp = _vector.elementAt(i);
			System.out.println("(" + temp.get_x() + ", " + temp.get_y() + ")");
		}
	}
}
