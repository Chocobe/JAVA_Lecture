package basic_ex;

import java.util.Scanner;

//	7. �ý� �����簡 10���� �¿�� �� �� ������ �ߴ��ϰ� �׳��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	������ �մ��� �� ����� �о� �鿩 ���� ���Ѵ�.

public class Texi_1 {
	public static void main(String[] args) {
		System.out.println("����7] �ý� �մ� 10�� ���� ���� ����ϱ�");
		Scanner scanner = new Scanner(System.in);
		
		int MAX_NUM = 10;

		int curr_charge = 0;
		int total_profit = 0;
		
		for(int i = 0; i < MAX_NUM; i++) {
			System.out.println("----------------------------");
			System.out.print("����� �Է��ϼ���(����Ǽ� : " + i + ") : ");
			curr_charge = scanner.nextInt();
			
			total_profit += curr_charge;
		}
		
		System.out.println("----------------------------");
		System.out.println("�� ���ͱ� : " + total_profit);
		
		scanner.close();
	} // main
}
