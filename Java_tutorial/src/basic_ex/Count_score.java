package basic_ex;

import java.util.Scanner;

// 5. �ڹ� ������ �о� 60�̻� ���� �л����� ���� 60�� �̸��� ���� �л����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Count_score {
	public static void main(String[] args) {
		System.out.println("����5] 60�� �̻� �л�, 60�� �̸� �л��� ���� ����ϱ�");
		
		Scanner scanner = new Scanner(System.in);
		
		int total_num = 0;		// �� �л���
		int pass_num = 0;		// 60�� �̻� �л���
		int fail_num = 0;		// 60�� �̸� �л���
		int curr_score = 0;		// ���� �л� ����
		
		String continuity = "";	// ��� ���� ����
		
		Main_loop : while(true) {
			System.out.println("-----------------------------");
			System.out.print("������ �Է��ϼ��� : " );
			curr_score = scanner.nextInt();
			total_num++;
			
			if(curr_score < 60) {
				fail_num++;
				
			} else {
				pass_num++;
			}
			
			scanner.nextLine();
			
			while(true) {
				System.out.print("�߰� �Է� �Ͻðڽ��ϱ�? (y/n) : ");
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break;
					
				} else if(continuity.equals("n")) {
					break Main_loop;
					
				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
				}
			} // while(true) - EXIT
		} // Main_loop - EXIT
		
		System.out.println("-----------------------------");
		System.out.println("�� �л��� : " + total_num);
		System.out.println("60�� �̻� �л��� : " + pass_num);
		System.out.println("60�� �̸� �л��� : " + fail_num);
		System.out.println("-----------------------------");
		
		scanner.close();
	} // main - EXIT 
}
