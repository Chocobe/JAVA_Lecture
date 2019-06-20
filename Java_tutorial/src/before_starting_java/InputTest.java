package before_starting_java;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		// 한글자 입력 --> 아스키코드 값 --> InputStream클래스 (한문자 입력)
			// 한글은 2byte문자이기 때문에 InputStream으로 사용하면 깨진다.
		
		int val = 0;
		char ch = 0;
		int num = 0;
		String name = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("한 글자 입력 : ");
			val = System.in.read();
			System.in.read();	// Enter 입력값을 버리기 위한 부분1
			System.in.read();	// Enter 입력값을 버리기 위한 부분2
			ch = (char)val;
			
			System.out.println("숫자입력 : ");
			// read()의 반환값은 아스키코드값이기 때문에, 정수형이지만 값은 정수의 원래값이 아니다.
				// 그러므로, read()의 반환값에 -48(0의 아스키코드값)을 해 주면, 정수값으로 바꿀 수 있다.
			num = System.in.read() - 48;
			System.in.read();	// Enter 입력값을 버리기 위한 부분1
			System.in.read();	// Enter 입력값을 버리기 위한 부분2
			
			System.out.print("이름 입력 : ");
			name = scanner.nextLine();

			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("val : " + val);
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		System.out.println("name : " + name);
		
		// 문자열로 받은 데이터를 int형으로 형변환 하기
		System.out.print("나이 : ");
		String str_age = scanner.nextLine();
		System.out.println("age : " + str_age);
		
		scanner.close();
	}
}
