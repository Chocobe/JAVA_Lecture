package before_starting_java;

import java.util.Scanner;

// �Է� :
//		����
//		(�Է��� ���� ������ �л����� �ȴ�)
//
//		�հ� - 60�� �̻�
//		���� - 60�� �̸�
//
// ��� :
//		�л���
//		��� �л���
//		���� �л���

public class WhileEx3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int student_cnt = 0;				// �л���
		int pass_cnt = 0;					// ��� �л���
		int fail_cnt = 0;					// ���� �л���
		int student_score = 0;				// ����
		
		String continuity = "";			
		
		Main_loop : while(true) {
			System.out.print("������ �Է��ϼ��� : ");
			student_score = scanner.nextInt();
			student_cnt++;
			
			if(student_score < 60) 
				fail_cnt++;
			
			else
				pass_cnt++;
			
			while(true) {
				System.out.print("�����Ͻðڽ��ϱ�?(Y/N) : ");
				
				scanner.nextLine();
				continuity = scanner.nextLine();
				
				if(continuity.equals("y")) {
					break Main_loop;
					
				} else if(continuity.equals("n")) {
					System.out.println();
					break;
					
				} else {
					System.out.println("Error] �߸� �Է��߽��ϴ�.");
				}
			}
		}
		
		System.out.println("----------------------");
		System.out.println("�� �л��� : " + student_cnt);
		System.out.println("��� �л��� : " + pass_cnt);
		System.out.println("���� �л��� : " + fail_cnt);
		System.out.println("----------------------");
		
		scanner.close();
	}
}
