package before_starting_java;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// �ѱ��� �Է� --> �ƽ�Ű�ڵ� �� --> InputStreamŬ���� (�ѹ��� �Է�)
			// �ѱ��� 2byte�����̱� ������ InputStream���� ����ϸ� ������.
		
		int val = 0;
		char ch = 0;
		int num = 0;
		String name = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("�� ���� �Է� : ");
			val = System.in.read();
			System.in.read();	// Enter �Է°��� ������ ���� �κ�1
			System.in.read();	// Enter �Է°��� ������ ���� �κ�2
			ch = (char)val;
			
			System.out.println("�����Է� : ");
			// read()�� ��ȯ���� �ƽ�Ű�ڵ尪�̱� ������, ������������ ���� ������ �������� �ƴϴ�.
				// �׷��Ƿ�, read()�� ��ȯ���� -48(0�� �ƽ�Ű�ڵ尪)�� �� �ָ�, ���������� �ٲ� �� �ִ�.
			num = System.in.read() - 48;
			System.in.read();	// Enter �Է°��� ������ ���� �κ�1
			System.in.read();	// Enter �Է°��� ������ ���� �κ�2
			
			System.out.print("�̸� �Է� : ");
			name = scanner.nextLine();

			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("val : " + val);
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		System.out.println("name : " + name);
		
		// ���ڿ��� ���� �����͸� int������ ����ȯ �ϱ�
		System.out.print("���� : ");
		String str_age = scanner.nextLine();
		System.out.println("age : " + str_age);
		
		scanner.close();
	}
}
