package generic_collection.vector_1;

import java.util.Vector;

public class Vecter_ex {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(5);
		vector.add(100);
		vector.add(50);
		vector.add(2, 500);
		vector.add(5);
		vector.add(100);
		vector.add(50);
		vector.add(2, 500);
		vector.add(5);
		vector.add(100);
		vector.add(50);
		vector.add(2, 500);
		
		System.out.println("벡터 내의 개수 : " + vector.size());
		System.out.println("벡터 현재 용량 : " + vector.capacity());
		
		for(int i = 0; i < vector.size(); i++) {
			int n = vector.get(i);
			System.out.printf("%5d", n);
		}
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < vector.size(); i++) {
			int n = vector.get(i);
			sum += n;
		}
		System.out.println("총 합 : " + sum);

		for(int i = 0; i < vector.size(); i++) {
			int n = vector.elementAt(i);
			System.out.printf("%5d", n);
		}
	}
}







































