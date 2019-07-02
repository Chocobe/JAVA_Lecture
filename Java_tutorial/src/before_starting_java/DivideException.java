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
			System.out.println("입력값은 정수형입니다." + e.getMessage());
			
		} catch(ArithmeticException e) {
			System.out.println("분모가 0이 될 수 없습니다.");
			
		} catch(Exception e) {
			System.out.println("알 수 없는 에러입니다.");
		}
		
		System.out.printf("결과 : %.2f", div);
		
		scanner.close();
	}
}
