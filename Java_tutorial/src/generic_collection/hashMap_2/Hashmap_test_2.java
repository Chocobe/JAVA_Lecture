package generic_collection.hashMap_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap_test_2 {
	public static void main(String[] args) {
		HashMap<String, Integer> java_score = new HashMap<String, Integer>();
		
		java_score.put("김성동", 97);
		java_score.put("황기태", 88);
		java_score.put("김남윤", 98);
		java_score.put("이재문", 70);
		java_score.put("한원선", 99);
		
		System.out.println("요소 수 : " + java_score.size());
		
		// 전체 출력
		// 키 문자열을 가진 Set 컬랙션 리턴
		Set<String> keys = java_score.keySet();
		
		// keys의 요소를 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			int score = java_score.get(name);
			
			System.out.println("이름 : " + name + ", score : " + score);
		}
	}
}
