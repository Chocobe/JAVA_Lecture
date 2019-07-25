package project_nonogram;

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
	
	private static final int BASIC_OPPORTUNITY = 2;

	private int game_over_cnt;
	private int fault_answer_cnt;
	private int correct_answer_cnt;
	
	// 초기화
	public Player(Scanner _scanner, Stage _stage) {
		this.scanner = _scanner;
		this.limit_position_x = _stage.get_stage_col();
		this.limit_position_y = _stage.get_stage_row();
		
		this.player_answer = Answer_type.NONE;
		this.pos_x = 0;
		this.pos_y = 0;
		
		fault_answer_cnt = 0;
		this.game_over_cnt = BASIC_OPPORTUNITY + _stage.get_stage_row() / 5;
		
		this.correct_answer_cnt = 0;
	}
	// 초기화
	
	
	// 입력부
	// @author	:	Chocobe
	// @param	:	Stage _stage : Stage 객체
	// @return	:	N/A
	public void input_sequence(Stage _stage) {
		String cur_answer = "";
		int x = 0;
		int y = 0;
		
		boolean is_valid_position = false;
		boolean is_valid_mark = false;
		
		this.print_correct_answer_state();
		this.print_fault_answer_state();
		
		while(true) {
			try {				
				System.out.print("x축 좌표값(1 ~ " + this.limit_position_x + ") 입력 : ");
				x = this.scanner.nextInt();
				
				System.out.print("y축 좌표값(1 ~ " + this.limit_position_y + ") 입력 : ");
				y = this.scanner.nextInt();
				this.scanner.nextLine();
				
				System.out.print("마크(o, x), 종료(exit) 입력 : ");
				cur_answer = this.scanner.nextLine();
				
				if(cur_answer.equals(Answer_type.exit.toString())) {
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
				System.out.println("Error] 정수만 입력 가능합니다.");
				scanner.nextLine();
			}
		} //while(true)
	}
	
	
	// (유효검사 완료된) 플레이어 입력 마크값 반환부
	public Answer_type get_player_answer() {
		return this.player_answer;
	}
	
	// (유효검사 완료된) 플레이어 입력 X 좌표값 반환부
	public int get_position_x() {
		return this.pos_x;
	}
	
	// (유효검사 완료된) 플레이어 입력 Y 좌표값 반환부
	public int get_position_y() {
		return this.pos_y;
	}
	
	// 플레이어 오답 횟수 증가
	public void add_fault_answer_cnt() {
		this.fault_answer_cnt++;
	}
	
	// 플레이어 정답 횟수 증가
	public void add_correct_answer_cnt() {
		this.correct_answer_cnt++;
	}
	
	// 플레이어 정답 횟수 반환
	public int get_correct_answer_cnt() {
		return this.correct_answer_cnt;
	}
	
	// 플레이어 오답 횟수 출력
	public void print_fault_answer_state() {
		System.out.println("현재 틀린 개수(" + this.fault_answer_cnt + " / " + this.game_over_cnt + ") ");
	}
	
	// 플레이어 정답 횟수 출력
	public void print_correct_answer_state() {
		System.out.println("정답 개수 : " + this.correct_answer_cnt);
	}


	// 마크 입력값 유효검사 & 확정
	// @author	:	Chocobe
	// @param	:	String _answer	: 입력한 마크값
	//			:	Stage _stage	: Stage 객체
	// @return	:	(boolean) true	: 유효한 입력값
	//			:	(boolean) false	: 불가한 입력값
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
	
	
	// 좌표 입력값 유효검사 & 확정
	// @author	:	Chocobe
	// @param	:	int _x : 좌표 x값
	//			:	int _y : 좌표 y값
	// @return	:	(boolean) true	:	유효한 좌표값
	//			:	(boolean) false	:	불가한 좌표값
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
	
	
	// 게임오버 조건 검사
	public boolean is_game_over() {
		boolean is_game_over = false;
		
		if(this.fault_answer_cnt == game_over_cnt) {
			is_game_over = true;
		}
		
		return is_game_over;
	}
}
