package before_starting_java;

import java.util.Date;

/*
 * �ּ�
 */
public class Hello {
	public static void main(String[] args) {
		
		System.out.println("Hello Java!");
		System.out.println("�ڹ� ���� ���α׷�\n������ : �迵��");
		System.out.println("��ȣ\t�̸�\t��ȭ��ȣ\t");
		System.out.println();
		System.out.print("��ȣ");
		System.out.print("�̸�");
		System.out.print("��ȭ��ȣ");
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
		System.out.println("��¥ : " + d);
		
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
		System.out.printf("���� : %c, %d, %c, %d\n", ch, (int)ch, ch + 1, (int)ch + 1);
		
		char ch2 = 'a';
		System.out.printf("����2 : %c, %d\n", ch2 - 32, (int)ch2);
	}
}