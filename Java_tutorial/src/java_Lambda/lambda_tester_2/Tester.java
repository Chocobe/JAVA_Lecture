package java_Lambda.lambda_tester_2;

public class Tester {	
	public static void main(String[] args) {
		MyFunction f = 
				() -> { System.out.println("MyFunction.myMethod() 호출!"); };
		f.myMethod();
	}
}
