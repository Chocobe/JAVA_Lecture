package before_starting_java;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---데이터 입력부---");
		
		System.out.print("성명 : ");
		String name = scanner.nextLine();
		
		System.out.print("국어 : ");
		int kor = scanner.nextInt();
		
		// 숫자입력부들 사이에 문자열입력이 있을 경우,
		// Enter값을 지워주는 (버퍼를 비우는) 작업이 필요하다.
		scanner.nextLine();
		
		System.out.print("비고 : ");
		
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		System.out.println("\n---입력된 데이터 출력부---");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		
		scanner.close();
	}
}
