package java_Lambda.lambda_tester_3;

@FunctionalInterface
interface MyFunction {
	void run();
}

public class LambdaEx1 {
	static void execute(MyFunction f) {
		f.run();
	}
	
	
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	
	public static void main(String[] args) {
		// 람다를 이용한 MyFunction 구현 및 객체생성
		MyFunction f1 = (MyFunction)(() -> System.out.println("f1.run()"));
		
		// 익명 클래스를 이용한 MyFunction 구현 및 객체생성
		MyFunction f2 = new MyFunction() {
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		// 람다를 이용하여 MyFunction을 구현 및 객체생성하는 매소드 호출
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
	}
}
