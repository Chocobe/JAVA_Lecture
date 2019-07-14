package excpeiont;

@SuppressWarnings("serial")
class MyException_1 extends Exception {
	public MyException_1() {
		super("사용자 정의 예외");
	}
}


public class Exception_test_1 {
	public static void main(String[] args) {
		try {
			method_1();
			
		} catch (MyException_1 e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public static void method_1() throws MyException_1 {
		// 성씨 판단 예외처리 -> 사용자가 예외라고 생각되는 부분에서 "사용자 정의 예외"를 발생 시키면 된다.
		throw new MyException_1();
	}
}
