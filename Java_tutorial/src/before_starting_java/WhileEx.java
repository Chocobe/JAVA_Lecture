package before_starting_java;

import java.util.Scanner;

public class WhileEx {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		int total_sum = 0;			// ���� �� ��
		int curr_val = 0;			// ���� ����
		int data_cnt = 0;			// ���� ��� ����
		
		double avg_score = 0F;		// ��� ����
		int max_score = -10000;		// �ִ� ����
		int min_score = 10000;		// ���� ����
		
		while(true) {
			System.out.print("������ �Է��ϼ���(���� : -99) : ");
			curr_val = scanner.nextInt();
			
			// ���� ���� �˻�
			if(curr_val == -99)
				break;
			
			// �ְ� ���� ����
			if(max_score < curr_val)
				max_score = curr_val;
			
			// ���� ���� ����
			if(min_score > curr_val)
				min_score = curr_val;
			
			total_sum += curr_val;
			data_cnt++;
		}
		System.out.println();
		
		avg_score = total_sum / data_cnt;
		System.out.println("�ְ� ���� : " + max_score);
		System.out.println("���� ���� : " + min_score);
		System.out.println("��� ���� : " + avg_score);
		System.out.println("-------------------------------");
			
		scanner.close();
	}
}
