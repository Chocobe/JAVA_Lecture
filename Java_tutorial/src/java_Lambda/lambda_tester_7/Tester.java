package java_Lambda.lambda_tester_7;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Tester {
	public static void main(String[] args) {
		// 매개변수가 2개인 함수형 인터페이스들
		// (Supplier는 매개변수가 없는 함수형 인터페이스였으므로, 여기에는 존재하지 않는다)
		// 매개변수가 2개인 함수형 인터페이스는 접두사로 Bi가 붙는다.
		
		// 함수형 인터페이스 : BiConsumer
		// 매개변수 : 2개, 반환값 : x
		BiConsumer<String, Integer> biConsumerTester =
						(str, i) -> System.out.println(str + " 이(가) " + i + "개 있다");
		biConsumerTester.accept("책", 3);
		
		// 함수형 인터페이스 : BiFunction
		// 매개변수 : 2개, 반환값 : o
		BiFunction<Integer, Integer, Integer> biFunctionTester =
						(i, j) -> i + j;
		int val_1 = 1;
		int val_2 = 2;
		System.out.println(val_1 + " 와(과) " + val_2 + "의 합 : " + biFunctionTester.apply(val_1, val_2));
		
		// 함수형 인터페이스 : BiPredicate
		// 매개변수 : 2개, 반환값 : boolean
		BiPredicate<Integer, Integer> biPredicateTester =
						(i, j) -> i > j;
		System.out.println(val_1 + " 은(는) " + val_2 + " 보다 크다? : " + biPredicateTester.test(val_1, val_2));
	}
}
