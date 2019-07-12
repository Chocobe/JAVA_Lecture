package excpeiont;

public class Finally {
	public static void main(String[] args) {
		method_1();
		System.out.println("method_1()을 마치고 main()으로 돌아왔습니다.");
	}
	
	
	public static void method_1() {
		try {
			System.out.println("method_1()이 호출되었습니다.");
			return;
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("method_1()의 finally 블록이 실행 되었습니다.");
		}
	}
}
