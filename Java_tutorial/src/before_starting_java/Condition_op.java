package before_starting_java;

import java.util.Scanner;

public class Condition_op {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gender = -1;
		String res = "";
		
		System.out.println("������ �Է��ϼ��� :");
		System.out.println("���� : 1, ���� : 2");
		
		gender = scanner.nextInt();
		
		res = (gender == 1) ? "�����Դϴ�." : "�����Դϴ�.";
		System.out.println(res);
		
		scanner.close();
	}
}
