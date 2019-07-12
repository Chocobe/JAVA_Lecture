package excpeiont;

public class Throw {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("의도적인 예외");
			throw e;
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료");
	}
}
