package generic_collection.iterator;

import java.util.Iterator;
import java.util.Vector;

public class Iterator_ex {
	public static void main(String[] args) {
		// 정수값만 다루는 제네릭 벡터 생성
		Vector<Integer> vector = new Vector<Integer>();
		
		for(int i = 0; i < 5; i++) {
			vector.add(i + 1);
		}
		
		Iterator<Integer> iterator = vector.iterator();
		
		// 모든 요소 출력
		while(iterator.hasNext()) {
			int cur_num = iterator.next();
			System.out.println(cur_num + " ");
		}
		
		// 모든 요소 합
		int sum = 0;
		iterator = vector.iterator();
		
		while(iterator.hasNext()) {
			sum += iterator.next();
		}
		System.out.println("총 합 : " + sum);
	}
}
