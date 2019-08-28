package java_Lambda.lambda_tester_6;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester {
	public static void main(String[] args) {
		// 함수형 인터페이스 : Consumer
		// 매개변수 : 1개, 반환값 : x
		Consumer<String> consumerTester = 
						(String str) -> System.out.println("ConsumerTester<String> 입력값 : " + str);
		consumerTester.accept("I'm TESTer");
		
		// 함수형 인터페이스 : Supplier
		// 매개변수 : x, 반환값 : 1개
		Supplier<String> supplierTester = () -> "Hello Java";
		System.out.println("SupplierTester<String> 반환값 : " + supplierTester.get());
		
		// 함수형 인터페이스 : Function
		// 매개변수 : 1개, 반환값 : o
		Function<String, Integer> functionTester = (str) -> str.length();
		System.out.println("FunctionTester<String, Integer> 반환값 : " + functionTester.apply("Hello"));
		
		// 함수형 인터페이스 : Predicate
		// 매개변수 : 1개, 반환값 : boolean
		Predicate<String> predicateTester = (str) -> str.equals("Java");
		System.out.println("predicateTester<String>의 입력값은 \"Java\" 이다? : " + predicateTester.test("Java"));
	}
}
