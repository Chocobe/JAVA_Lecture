package before_starting_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num_1 = 0;
		int num_2 = 0;
		int div = 0;
		
		System.out.print("num_1 : ");
		num_1 = scanner.nextInt();
		
		System.out.print("num_2 : ");
		num_2 = scanner.nextInt();
		
		try {
			div = num_1 / num_2;
			
		} catch(InputMismatchException e) {
			System.out.println("�Է°��� �������Դϴ�." + e.getMessage());
			
		} catch(ArithmeticException e) {
			System.out.println("�и� 0�� �� �� �����ϴ�.");
			
		} catch(Exception e) {
			System.out.println("�� �� ���� �����Դϴ�.");
		}
		
		System.out.printf("��� : %.2f", div);
		
		scanner.close();
	}
}
