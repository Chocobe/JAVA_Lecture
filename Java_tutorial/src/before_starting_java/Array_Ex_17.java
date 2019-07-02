package before_starting_java;

public class Array_Ex_17 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		char op = ' ';
		int result = 0;
		
		// 매개변수 형식에 맞는지 검사
		if(args.length != 3) {
			System.out.println("Usage(사용법) : java Array_Ex_17 num1 op num2");
			// 프로그램 종료
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
				System.out.println("Error] 제수가 0입니다.");
				System.exit(0);
				
			} else {
				result = num1 / num2;
				break;
			}
		}
		
		System.out.println("결과 : " + result);
	}
}
