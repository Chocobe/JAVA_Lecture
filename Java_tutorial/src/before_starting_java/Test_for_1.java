package before_starting_java;

import java.util.Random;
import java.util.Scanner;

public class Test_for_1 {
	public static void main(String[] args) {
		// 1���� 3���� ���
		//
		for(int i = 1; i <= 3; i++) {
			System.out.println("Hello Java");
		}
		System.out.println("-----------------------------");

		
		// 1���� 100������ ���� ��, 5�� ������ �������� �� ���, ���� ���Ͻÿ�
		//
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("5�� ����� �� �� : " + sum);		
		System.out.println("-----------------------------");
		
		
		// *�� �̿��� �����ﰢ�� ���
		//
		Scanner scanner = new Scanner(System.in);
		int height = 0;
		
		System.out.print("����� ���̸� �Է��ϼ��� : ");
		height = scanner.nextInt();
		
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		
		
		// �Է� :
		//		ù��° ��
		//		�ι�° ��
		//		���
		// ��� :
		//		ù��° ������ �ι�° �� ���� ������ ����� ��
		//
		int num_1 = 0;
		int num_2 = 0;
		int multiple = 0;
		int multiple_sum = 0;
		
		System.out.print("ù��° �� : ");
		num_1 = scanner.nextInt();
		
		System.out.print("�ι�° �� : ");
		num_2 = scanner.nextInt();
		
		System.out.print("��� : ");
		multiple = scanner.nextInt();
		
		if(num_1 > num_2) {
			int temp = num_1;
			num_1 = num_2;
			num_2 = temp;
		}
		
		for(int i = num_1; i <= num_2; i++) {
			if(i % multiple == 0) 				
				multiple_sum += i;
		}
		System.out.println();
		System.out.println("num_1 : " + num_1 + ", num_2 : " + num_2);
		System.out.println(multiple + "����� �� �� : " + multiple_sum);
		System.out.println("-----------------------------");
		
		
		
		scanner.close();
	}
}






























