package basic_ex;

import java.util.Random;
import java.util.Scanner;

//	9. ������ �̿��Ͽ� 1���� 10 ������ ���ڸ� �����Ͽ� ���ڸ� ���ߴ� ���α׷��� �ۼ��Ͻÿ�
//	���� ���ڸ� �Է� : 5
//	������ ���ڰ� Ʋ�Ƚ��ϴ�
//	������ ���ڰ� �ʹ� Ů�ϴ�
//	���� ���ڸ� �Է� : 3
//	������ ���ڰ� Ʋ�Ƚ��ϴ�
//	������ ���ڰ� �ʹ� �۽��ϴ�
//	���� ���ڸ� �Է� : 4
//	������ ���ڰ� �½��ϴ�

public class Pick_random_num_1 {
	public static void main(String[] args) {
		System.out.println("����9] 1���� 10������ ���� ���߱�");
		System.out.println("-----------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		Random random_obj = new Random(System.currentTimeMillis());
		
		int input_num = 0;
		int random_num = 0;
		int try_cnt = 0;
		
		Main_loop : while(true) {
			System.out.println("-----------------------------------");
			
			try_cnt++;
			System.out.print("1~10 ������ ������ �Է��ϼ��� (�õ�ȸ�� : " + try_cnt + ") : ");
			input_num = scanner.nextInt();
			random_num = random_obj.nextInt(10) + 1;
			
			if(input_num > random_num) {
				System.out.println("������ Ʋ�Ƚ��ϴ� - �Է°��� Ů�ϴ�.");
				
			} else if(input_num < random_num) {
				System.out.println("������ Ʋ�Ƚ��ϴ�. - �Է°��� Ů�ϴ�.");
				
			} else {
				System.out.println("�����Դϴ�.");
				System.out.println("�� �õ� Ƚ�� : " + try_cnt);
				
				break Main_loop;
			}
						
		} // Main_loop
		
		
		scanner.close();
	}
}
