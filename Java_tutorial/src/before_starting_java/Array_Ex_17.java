package before_starting_java;

public class Array_Ex_17 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		char op = ' ';
		int result = 0;
		
		// �Ű����� ���Ŀ� �´��� �˻�
		if(args.length != 3) {
			System.out.println("Usage(����) : java Array_Ex_17 num1 op num2");
			// ���α׷� ����
			System.exit(0);
		}
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[2]);
		op = args[1].charAt(0);
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
			
		case '-':
			result = num1 - num2;
			break;
			
		case '*':
			result = num1 * num2;
			break;
			
		case '/':
			if(num2 == 0) {
				System.out.println("Error] ������ 0�Դϴ�.");
				System.exit(0);
				
			} else {
				result = num1 / num2;
				break;
			}
		}
		
		System.out.println("��� : " + result);
	}
}
