package before_starting_java;

import java.util.Scanner;

public class Array_Ex_MultiArrEx1 {
	public static void main(String[] args) {
		final int SIZE = 10;
		
		Scanner scanner = new Scanner(System.in);		
		
		int x = 0;
		int y = 0;
		
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = {
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{1, 1, 1, 1, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{1, 1, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 0, 0, 1, 0, 0},
				{0, 0, 0, 0, 0, 1, 1, 1, 0} };
		
		for(int i = 1; i < SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i + '0');
		}
		
		while(true) {
			System.out.print("좌표 입력 (종료는 00) : ");		
			String input = scanner.nextLine();
					
			if(input.length() == 2) {
				x = input.charAt(0) - '0';
				y = input.charAt(1) - '0';
				
				if(x == 0 && y == 0) {
					break;
				}
			}
			
			if(input.length() != 2 || x <= 0 || x > SIZE || y <= 0 || y > SIZE) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			board[y][x] = shipBoard[y - 1][x - 1] == 1 ? 'O' : 'X';
			
//			for(int i = 0; i < SIZE; i++) {
//				for(int j = 0; j < SIZE; j++) {
//					System.out.print(board[i][j]);
//				}
//				System.out.println();
//			}

			// 1차원 char배열은 println 메서드에 주소값을 넣을 경우, 각 요소값을 모두 출력해 준다.
			for(int i = 0; i < SIZE; i++) {
				System.out.println(board[i]);
			}
		}
		
		scanner.close();
	}
}
