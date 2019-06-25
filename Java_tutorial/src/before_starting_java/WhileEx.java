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
		
		
		int mode = 0;
		do {
			System.out.println("[1.square], [2.square root], [3.log], [0.EXIT]");
			System.out.print("��� ��ȣ�� �Է��ϼ��� : ");
			
			mode = scanner.nextInt();
			
			switch(mode) {
			case 0 : System.out.println("---���α׷��� �����մϴ�.---");	break;
			case 1 : System.out.println("---square ���---");			break;
			case 2 : System.out.println("---square root ���---");		break;
			case 3 : System.out.println("---log ���---");				break;
			default: System.out.println("---�߸��� �޴��Դϴ�.---");
			}
			
			System.out.println("-------------------------------");
		} while(mode != 0);
		
		
		scanner.close();
	}
}
