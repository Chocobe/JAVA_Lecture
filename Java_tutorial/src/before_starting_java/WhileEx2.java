package before_starting_java;

import java.util.Scanner;

// (�⼮ * 0.1) + (���� * 0.4) + (���� * 0.1) + (�߰� * 0.2) + (�⸻ * 0.2);
//	90 �̻� - A
//	80
//	70
//	60
//	60 �̸� - F
// 	��� ���

public class WhileEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String sub_name = "";		// �����
		
		double attend = 0;			// �⼮����
		double homeWork = 0;		// ����
		double pre_score = 0;		// ����
		double mid_score = 0;		// �߰�
		double final_score = 0;		// �⸻
		int avg = 0;				// ���
		
		double total_score = 0;
		char grade = ' ';			// ���

		boolean begin = true;		// ���α׷��� ù ���� �˻�
		
		System.out.println("-------------------");
		System.out.println("---���� ���� ���α׷�---");
		System.out.println("  ���� : 1, ���� : 0");
		System.out.println("-------------------");
		
		Loop_title : while(true) {
			
			if(!begin) {
				scanner.nextLine();
				System.out.print("(���� ���� : y, ���� : n) : ");
				
				if(scanner.nextLine().equals("n")) {
					break Loop_title;
				}
			}
			
			System.out.print("������� �Է��ϼ��� : ");
			sub_name = scanner.nextLine();
			
			System.out.print("�⼮������ �Է��ϼ��� : ");
			attend = scanner.nextInt();
			
			System.out.print("���� ������ �Է��ϼ��� : ");
			homeWork = scanner.nextInt();
			
			System.out.print("���� ������ �Է��ϼ��� : ");
			pre_score = scanner.nextInt();
			
			System.out.print("�߰� ������ �Է��ϼ��� : ");
			mid_score = scanner.nextInt();
			
			System.out.print("�⸻ ������ �Է��ϼ��� : ");
			final_score = scanner.nextInt();
			
			avg = (int)((attend + homeWork + pre_score + mid_score + final_score) / 5);
			
			attend *= 0.1;
			homeWork *= 0.4;
			pre_score *= 0.1;
			mid_score *= 0.2;
			final_score *= 0.2;
			
			total_score = attend + homeWork + pre_score + mid_score + final_score;
			
			if(total_score >= 90) 		grade = 'A';
			else if(total_score >= 80)	grade = 'B';
			else if(total_score >= 70)	grade = 'C';
			else if(total_score >= 60)	grade = 'D';
			
			System.out.println("-------------------------");
			System.out.println("����� : " + sub_name);
			System.out.println("���� : " + total_score);
			System.out.println("��� : " + grade);
			System.out.println("��� : " + avg);
			System.out.println("-------------------------");
			
			begin = false;
		}
		
		scanner.close();
	}
}