package basic_ex;

import java.util.Scanner;

// 6. ������ ������ �Է��Ͽ� �ִ� ������ �ּ� ������ ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է� ���� ����� -999 �� �Է��ϸ� ���� ��.

public class Quiz {
	public static void main(String[] args) {
		System.out.println("����6] ���������� �Է¹޾�, �ִ�, ����, ��� ���ϱ�");
		
		Scanner scanner = new Scanner(System.in);
		
		int curr_score = 0;
		int max_score = -10000;
		int min_score = 10000;
		
		int total_score = 0;
		int total_cnt = 0;
		
		double avg_score = 0F;
		
		Main_loop : while(true) {
			System.out.println("-------------------------");
			System.out.print("������ �Է��ϼ���(���� : -99) : ");
			curr_score = scanner.nextInt();
			
			if(curr_score == -99) {
				break Main_loop;
			}
			
			total_score += curr_score;
			total_cnt++;
			
			if(curr_score > max_score)	max_score = curr_score;
			if(curr_score < min_score)	min_score = curr_score;
			
			scanner.nextLine();
			
			
		} // Main_loop
		
		avg_score = (double)total_score / total_cnt;
		
		System.out.println("-------------------------");
		System.out.println("�� �Է¼� : " + total_cnt);
		System.out.println("�ִ� ���� : " + max_score);
		System.out.println("���� ���� : " + min_score);
		System.out.printf("��� ���� : %.2f\n", avg_score);
		System.out.println("-------------------------");
		
		scanner.close();
	} // main
}
