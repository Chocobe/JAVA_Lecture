package basic_ex;

import java.util.Scanner;

//	8. �ý� �����簡 "�ڹ�"��� �մ��� �¿�� ���������� ������ �ָ�  ������ �ߴ��ϰ� �� �� ������ ����ϴ� ���α׷��� �ۼ� 
//	�Ͻÿ�. �� �մ��� �̸��� ����� �о� �մԵ��� ����� �� �����  ���� ���Ѵ�
//	���
//	�մ��� �̸��� �Է� : QQQQ
//	��� :  7000
//	�մ��� �̸��� �Է� : WWWW
//	��� :  5000
//	�մ��� �̸��� �Է� : �ڹ�
//	��� : 10000
//	
//	������ 22000���̴�

public class Texi_2 {
	public static void main(String[] args) {
		System.out.println("����8] \"�ڹ�\"��� �մ��� �¿ﶧ ���� �����Ͽ�, �� ���ͱ� ����ϱ�");
		
		Scanner scanner = new Scanner(System.in);
		
		String curr_name = "";
		int curr_charge = 0;
		
		int total_profit = 0;
		int total_cnt = 0;
		
		Main_loop : while(true) {
			System.out.println("----------------------------------");
			
			System.out.print("�մ��̸� : ");
			curr_name = scanner.nextLine();
			
			System.out.print("��� : " );
			curr_charge = scanner.nextInt();
			scanner.nextLine();
			
			total_profit += curr_charge;
			total_cnt++;
			
			if(curr_name.equals("�ڹ�")) {
				break Main_loop;
			}
		} // Main_loop
		
		System.out.println("----------------------------------");
		System.out.println("�� ���ͱ� (�� " + total_cnt + "��) : " + total_profit);
		
		scanner.close();		
	} // main
}
