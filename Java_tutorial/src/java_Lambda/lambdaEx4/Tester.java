package java_Lambda.lambdaEx4;

import java.util.function.Predicate;

public class Tester {
	public static void main(String[] args) {
		Predicate<String> predicate = (String str) -> str.length() == 0;
		
		String str = "";
		
		if(predicate.test(str)) {
			System.out.println("str의 문자열 길이 : " + 0);
			
		} else {
			System.out.println("str의 문자열 길이는 0이 아니다");
		}
	}
}
