package java_Lambda.lambda_tester_1;

public class Tester {
	public static void main(String[] args) {
		MyFunction func = new MyFunction() {
			
			@Override
			public int max(int a, int b) {
				return (a > b) ? a : b;
			}
		};
		
		int bigger = func.max(1, 2);
		System.out.println(bigger);
		
		MyFunction func_1 = (int a, int b) -> a > b ? a : b;
		int bigger_1 = func_1.max(1, 2);
		System.out.println(bigger_1);
		
		
	}
}
