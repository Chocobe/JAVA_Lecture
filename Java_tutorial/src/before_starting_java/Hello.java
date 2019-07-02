package before_starting_java;

import java.util.Date;

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
		
		System.out.println("\n---exchange practice---");
		int x = 1000;
		int y = 5000;
		System.out.println("before)\t x : " + x + ", y : " + y);
		
		int temp_val = x;
		x = y;
		y = temp_val;
		System.out.println("after)\t x : " + x + ", y : " + y);
		
		System.out.println();
		Hello hello = new Hello();
		System.out.println("Hello : " + hello);
		
		System.out.println();
		Date d = new Date();
		System.out.println("날짜 : " + d);
		
		float f = 123.456F;
		System.out.println("f = " + f);
		System.out.printf("f = %-5.2f", f);
		System.out.println("\n");
		
		final int WIDTH = 100;
		final int HEIGHT = 200;
		int area = WIDTH * HEIGHT;
		System.out.printf("area = %d\n", area);
		System.out.printf("area = %10d\n", area);
		System.out.println("\n");
		
		String city = "Busan";
		System.out.printf("city = %s\n",  city);
		System.out.printf("city = %10s\n", city);
		System.out.printf("city = %-10s\n", city);
		System.out.printf("%-10s%6.2f\n", city, f);		
		System.out.printf("%s%6.2f\n\n", city, f);
		
		char ch = 'A';
		System.out.printf("문자 : %c, %d, %c, %d\n", ch, (int)ch, ch + 1, (int)ch + 1);
		
		char ch2 = 'a';
		System.out.printf("문자2 : %c, %d\n", ch2 - 32, (int)ch2);
	}
}