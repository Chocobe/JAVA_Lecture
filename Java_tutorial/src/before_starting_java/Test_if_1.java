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
		
		scanner.nextLine();
		
		System.out.print("���� : ");
		sex = scanner.nextLine();
		
		System.out.print("�ڰ��� : ");
		isCertificate = scanner.nextBoolean();
		
		if(avg >= 70 && (sex.equals("��") || isCertificate)) {
			System.out.println("�ؿܱٹ�");
		}
		
		scanner.close();
	}
}
