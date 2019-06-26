package basic_ex;

import java.util.Random;
import java.util.Scanner;

//	10.  ���� 1���� 100 ���� ������ �����Ѵ�. 1�� 100�� ���õ� ��  �ִ�. ������ ���ڸ� ���⶧���� ����ϰ�, ���� ������ 
//	Ƚ���� ����, �°� �� �� Ƚ���� ����Ͻÿ�. ������ ���� �Ŀ� ���߱� ������ ����ϱ⸦ ���ϴ��� �˾ƺ���.

public class Pick_random_num_2 {
	public static void main(String[] args) {
		System.out.println("����10] 1���� 100������ ���� ���� ���߱�");
		
		Scanner scanner = new Scanner(System.in);
		Random random_obj = new Random(System.currentTimeMillis());
		
		final int MIN_NUM = 1;
		final int MAX_NUM = 100;
		
		int input_num = 0;
		int random_num = 0;
		int try_cnt = 0;
		
		String continue_answer = "";
		
		Main_loop : while(true) {
			System.out.println("----------------------------------");
			try_cnt++;
			
			System.out.print("������ �Է��ϼ��� (�õ�ȸ�� : " + try_cnt + ") : ");
			input_num = scanner.nextInt();
			random_num = random_obj.nextInt(MAX_NUM) + MIN_NUM;
			
			if(input_num > random_num) {
				System.out.println("Ʋ�Ƚ��ϴ�. �Է°��� Ů�ϴ�.");
				continue;
				
			} else if(input_num < random_num) {
				System.out.println("Ʋ�Ƚ��ϴ�. �۽��ϴ�.");
				continue;
				
			} else {
				System.out.println("�����Դϴ�. (�õ�Ƚ�� : " + try_cnt + ")");
			}
			
			scanner.nextLine();
			System.out.println();
			
			while(true) {
				System.out.print("�� �Ͻðڽ��ϱ�? (y/n) : ");
				continue_answer = scanner.nextLine();
				
				if(continue_answer.equals("y")) {
					break;
					
				} else if(continue_answer.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}				
			} // while(true)			
		} // Main_loop
		
		scanner.close();
	} // main
}
