package before_starting_java;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---������ �Էº�---");
		
		System.out.print("���� : ");
		String name = scanner.nextLine();
		
		System.out.print("���� : ");
		int kor = scanner.nextInt();
		
		// �����Էºε� ���̿� ���ڿ��Է��� ���� ���,
		// Enter���� �����ִ� (���۸� ����) �۾��� �ʿ��ϴ�.
		scanner.nextLine();
		
		System.out.print("��� : ");
		
		System.out.print("���� : ");
		int math = scanner.nextInt();
		
		System.out.println("\n---�Էµ� ������ ��º�---");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		
		scanner.close();
	}
}
