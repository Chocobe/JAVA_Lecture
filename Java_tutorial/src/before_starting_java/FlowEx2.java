package before_starting_java;

import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		System.out.print("������ �Է��ϼ��� : ");
		input = Integer.parseInt(scanner.nextLine());
		
		// if�� �ΰ��� ���
		if(input == 0)
			System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
		
		if(input != 0) {
			System.out.print("�Է��� ���ڴ� 0�� �ƴϰ�, ");
			System.out.println(input + "�Դϴ�.");
		}
		
		System.out.println("---------------------------");
		
		// if ~ else�� ���
		if(input == 0) {
			System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
			
		} else {
			System.out.print("�Է��� ���ڴ� 0�� �ƴϰ�, ");
			System.out.println(input + "�Դϴ�.");
		}
		
		scanner.close();
	}
}
