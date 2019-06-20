package before_starting_java;

/*
 * 주석
 */
public class Hello {
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		System.out.println("자바 응용 프로그램\n제작자 : 김영우");
		System.out.println("번호\t이름\t전화번호\t");
		System.out.println();
		System.out.print("번호");
		System.out.print("이름");
		System.out.print("전화번호");
		System.out.printf("%d%s", 1000, "korea\n");
		
		int num = 1;
		int num2 = 100;
		int res = num + num2;
		System.out.println("res : " + res);
		
		res = num + num2 + 1;
		System.out.println("res : " + res);
	}
}