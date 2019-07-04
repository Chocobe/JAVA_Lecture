package java_class.getter_setter_ex_2;

import java.util.Scanner;

public class Population_test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Population population = new Population();
		
		do {
			population.input_sequence(scanner);
			print_line();
			
			System.out.println(population.toString());
			print_line();
		} while(is_continue(scanner));
		
		scanner.close();
	} //main
	
	
	// 라인 출력
	// @ahotur	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("------------------");
	}
	
	
	// 진행 여부 질문
	// @author	:	Chocobe
	// @param	:	Scanner _sc : Scanner 객체
	// @return	:	true	: 계속
	//			:	false	: 종료
	public static boolean is_continue(Scanner _sc) {
		boolean answer = false;
		System.out.print("계속하기를 원하세요? (true, false) : ");
		_sc.nextLine();	// 버퍼 비우기
		answer = _sc.nextBoolean();
		_sc.nextLine();	// 버퍼 비우기
		
		return answer;
	}
}
