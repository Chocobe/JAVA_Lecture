package nonogram;

import java.util.InputMismatchException;
import java.util.Scanner;

// 플레이어 입력부

public class Player {
	private Scanner scanner;
	
	private int limit_position_x;
	private int limit_position_y;
	
	private Answer_type player_answer;
	private int pos_x;
	private int pos_y;
	
	public Player(Scanner _scanner, Stage _stage) {
		this.scanner = _scanner;
		this.limit_position_x = _stage.get_stage_col();
		this.limit_position_y = _stage.get_stage_row();
		
		this.player_answer = Answer_type.NONE;
		this.pos_x = 0;
		this.pos_y = 0;
	}
	
	public void input_sequence(Stage _stage) {
		String cur_answer = "";
		int x = 0;
		int y = 0;
		
		boolean is_valid_position = false;
		boolean is_valid_mark = false;
		
		while(true) {
			try {				
				System.out.print("x축 좌표값(1 ~ " + this.limit_position_x + ") 입력 : ");
				x = this.scanner.nextInt();
				
				System.out.print("y축 좌표값(1 ~ " + this.limit_position_y + ") 입력 : ");
				y = this.scanner.nextInt();
				this.scanner.nextLine();
				
				System.out.print("마크(o, x), 종료(-1) 입력 : ");
				cur_answer = this.scanner.nextLine();
				
				if(cur_answer.equals("-1")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				
				is_valid_position = is_valid_position(x, y);
				is_valid_mark = is_valid_mark(cur_answer, _stage);
				
				if(is_valid_position && is_valid_mark) {
					break;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력 가능합니다.");
				scanner = scanner.reset();
			}
		} //while(true)
	}
	
	
	public Answer_type get_player_answer() {
		return this.player_answer;
	}
	
	public int get_position_x() {
		return this.pos_x;
	}
	
	public int get_position_y() {
		return this.pos_y;
	}

	
	private boolean is_valid_mark(String _answer, Stage _stage) {
		boolean valid_answer = true;
		
		if(Answer_type.o.toString().equals(_answer)) {
			this.player_answer = Answer_type.o;
			
		} else if(Answer_type.x.toString().equals(_answer)) {
			this.player_answer = Answer_type.x;
			
		} else if(_answer.equals("back door code Chocobe")) {
			System.out.println("후훗");
			Block.chocobe(_stage);
		
		} else {
			System.out.println("마크값이 유효하지 않습니다.");
			valid_answer = false;
		}
		
		return valid_answer;
	}
	
	
	private boolean is_valid_position(int _x, int _y) {
		boolean valid_position = true;
		
		if(_x < 1 || _x > this.limit_position_x) {
			System.out.println("X축 좌표값이 유효하지 않습니다.");
			valid_position = false;
		}
		
		if(_y < 1 || _y > this.limit_position_y) {
			System.out.println("Y축 좌표값이 유효하지 않습니다.");
			valid_position = false;
		}
		
		if(valid_position) {
			this.pos_x = _x - 1;
			this.pos_y = _y - 1;
			
		}
		
		return valid_position;
	}
}
