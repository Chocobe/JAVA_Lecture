package before_starting_java;

import java.util.Scanner;

// �������� ���� �Ҵ��� �����ϴ�.

public class Array_DynamicArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] x = null;
		int num = 0;
		String str = "";
		
		System.out.print("���ڿ� �Է� : ");
		str = scanner.nextLine();
		
		System.out.print("�迭 ũ�� : ");
		num = scanner.nextInt();
		
		x = new int[num];
		
		System.out.println(str);
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "] : " + x[i]);
		}
		
		scanner.close();
	}
}
