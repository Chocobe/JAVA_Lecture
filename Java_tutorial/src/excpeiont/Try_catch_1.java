package excpeiont;

public class Try_catch_1 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println("result : " + result);
				
			} catch(ArithmeticException e) {
				System.out.println("에러 발생] : 0");
			}
		}
		
		System.out.println("정상 종료");
	}
}
