package before_starting_java;

import java.io.IOException;
import java.util.Scanner;

public class Switch_Ex_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int lhs = 0;
		int rhs = 0;
		char operator = ' ';
		int result_val = 0;
		
		System.out.print("ù ��° ������ �Է��ϼ��� : ");
		lhs = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		
		// �ƽ�Ű �ڵ尪���� �о�� -> �ƽ�Ű�ڵ尪�� ���ڷ� ����ȯ
		try {
			operator = (char)System.in.read();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.print("�� ��° ������ �Է��ϼ��� : ");
		rhs = scanner.nextInt();
		
		switch(operator) {
		case '+' :
			result_val = lhs + rhs;
			break;
			
		case '-' :
			result_val = lhs - rhs;
			break;
			
		case '*' :
			result_val = lhs * rhs;
			break;
			
		case '/' :
			if(rhs == 0) {
				System.out.println("--------------------------------");
				System.out.println("������ 0�� �������� �߻� !");
				result_val = -100000;
				
				scanner.close();
				return;
			}
			result_val = lhs / rhs;
			break;
			
		default :
			result_val = 0;
			operator = 'N';
		}
		
		System.out.println("--------------------------------");
		System.out.println("������ : " + lhs + ", ������ : " + rhs + ", ������ : " + operator);
		System.out.println("����� : " + result_val);
		
		scanner.close();
		
	}
}
