package before_starting_java;

import java.util.Scanner;

public class Test_if_1 {
	public static void main(String[] args) {
		// ����� 70�̰�, ������ "��"�̰ų�, �ڰ����� ������ "�ؿܱٹ�"
		
		Scanner scanner = new Scanner(System.in);
		
		int avg = 0;
		String sex = "";
		boolean isCertificate = false;
		
		System.out.print("������� : ");
		avg = scanner.nextInt();
		
		scanner.nextLine();		// ���� ����(Enter��)
		
		System.out.print("���� : ");
		sex = scanner.nextLine();
		
		System.out.print("�ڰ���(true/false) : ");
		isCertificate = scanner.nextBoolean();
		
		if(avg >= 70 && (sex.equals("��") || isCertificate)) {
			System.out.println("�ؿܱٹ�");
		}
		System.out.println("-------------------------------");
		
		
		// ���� �� �Է� :
		//			3, 4, 5 : ��
		//			6, 7, 8 : ����
		//			9, 10, 11 : ����
		//			12, 1, 2 : �ܿ�
		String season = "";
		int month = 0;
		
		System.out.print("���� �� : ");
		month = scanner.nextInt();
		
		if(3 <= month && month <= 5)
			season = "��";
		
		else if(6 <= month && month <= 8)
			season = "����";
		
		else if(9 <= month && month <= 11)
			season = "����";
		
		else
			season = "�ܿ�";
		
		System.out.println("���� ������ " + season + "�Դϴ�.");
		System.out.println("-------------------------------");
		
		
		scanner.close();
	}
}
