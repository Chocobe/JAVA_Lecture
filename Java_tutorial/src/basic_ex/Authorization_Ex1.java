package basic_ex;

import java.util.Scanner;

// 1. ����ڷ� ���� ��ȣ�� �Է¹޾� ��ȣ�� ������ "ȯ���մϴ�" ��� �޼����� ����Ͽ� �����ϰ� ��ȣ�� Ʋ���� "��ȣ�� Ʋ��
// �Դϴ�" �޼����� ����Ѵ�.��ȣ��  3�� �߸� �Է��ϸ� ������ "�ź��մϴ�" ����ϰ� �����Ѵ�. ��ȣ�� koreajava�� �Ѵ�

public class Authorization_Ex1 {
	public static void main(String[] args) {
		
		System.out.println("����1] ���� ���α׷�");
		
		Scanner scanner = new Scanner(System.in);
		
		String password = "koreajava";
		String input_pass = "";
		int try_cnt = 0;
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.print("��й�ȣ�� �Է��ϼ��� (Ʋ��Ƚ�� : " + try_cnt + ") : ");
			
			input_pass = scanner.nextLine();
			
			if(input_pass.equals(password)) {
				System.out.println("ȯ���մϴ�.");
				System.out.println("-----------------------------------");
				break;
				
			} else {
				try_cnt++;
				
				if(try_cnt < 3) {
					System.out.println("���] " + try_cnt + "ȸ ���� ����");
				
				} else {
					System.out.println("\nƲ��Ƚ�� : " + try_cnt);
					System.out.println("�ź��մϴ�.");
					System.out.println("-----------------------------------");
					break;
				}
			}
		} // while(true)
		
		scanner.close();
	} // main
}
