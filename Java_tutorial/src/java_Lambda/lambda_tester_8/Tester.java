package java_Lambda.lambda_tester_8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tester {
	public static void main(String[] args) {
		// Collection을 람다와 함수형 인터페이스로 활용하기
		
		// List의 요소 전체 출력하기
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}

		list.forEach(i -> System.out.print("요소 : " + i + "\t"));
		
		System.out.println("\n");
		
		
		// List의 요소 중, 2와 3의 배수 지우기
		list.removeIf(i -> i != 0 && (i % 2 == 0 || i % 3 == 0));
		list.forEach(i -> System.out.print("요소 : " + i + "\t"));
		
		System.out.println("\n");
		
		
		// List의 요소에 10씩 곱하기
		list.replaceAll(i -> i * 10);
		list.forEach(i -> System.out.print("요소 : " + i + "\t"));
		
		System.out.println("\n");
		
		// HashMap의 모든 요소 출력하기
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Hello");
		map.put(2, "Java");
		map.put(3, "Hallu");
		map.put(4, "World");
		
		map.forEach((i, str) -> System.out.print(i + "번 : " + str + "\t"));
	}
}
