package before_starting_java;

import java.util.Scanner;

public class While_test {
	public static void main(String[] args) {
		int i = 11;
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");
		
		while(i-- != 0) {
			System.out.println(i);
			
			for(int j = 0; j < 2_000_000_000; j++) {}
		}
		System.out.println("GAME OVER");
		System.out.println("------------------------------");
		
		
		// �Է¹��� ���� �� ���ڵ��� �� ���ϱ�
		//
		Scanner scanner = new Scanner(System.in);
		String str_origin = "";
		int sum = 0;
		int quotient = 0;
		int remain = 0;
		int before_num = 0;
		
		System.out.print("������ �Է��ϼ���(�� : 12345) : ");
		str_origin = scanner.nextLine();
		quotient = Integer.parseInt(str_origin);
		
		while(quotient != 0) {
			before_num = quotient;
			
			remain = quotient % 10;
			quotient = quotient / 10;
			sum += remain;
			
			System.out.printf("sum : %3d, num : %d\n", sum, before_num);
		}
		System.out.println("�Է� ������ : " + str_origin + ", �� �� : " + sum);
		System.out.println("------------------------------");
		
		
		int input_num = 0;
		int cur_sum = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print("�հ踦 ���� ����(0�� ����) : ");
			input_num = scanner.nextInt();
			cur_sum += input_num;
			if(input_num == 0) {
				flag = false;
			}
		}
		System.out.println("�� �� : " + cur_sum);
		System.out.println("------------------------------");
		
		
		scanner.close();
	}
}
