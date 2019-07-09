package generic_collection.vector_2;

import java.util.Vector;

public class Point_tester {
	public static void main(String[] args) {
		Vector<Point> vector = new Vector<Point>();
		
		// 3개의 Point 객체 삽입
		vector.add(new Point(2, 3));
		vector.add(new Point(-5, 20));
		vector.add(new Point(30, -8));
		
		// 1번 인덱스 객체 제거
		vector.remove(1);
		
		// 전체 출력
		for(int i = 0; i < vector.size(); i++) {
			Point p = vector.elementAt(i);
			
			System.out.println("(" + p.get_x() + ", " + p.get_y() + ")");
		}
	}
}
