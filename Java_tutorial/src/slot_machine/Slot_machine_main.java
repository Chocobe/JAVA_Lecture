package slot_machine;

import java.util.Scanner;

// stop_slot �޼��� �����ϱ�
// �Ű����� - ���� ��ġ��_ROW, ���� ��ġ��_COL -> 1�� �ɺ�, 2�� �ɺ�, 3�� �ɺ�

public class Slot_machine_main {
	
	public static int g_my_money;
	public static int g_betting_money;
	public static int g_system_state;
	
	public final static String SLOT_LINE_1 	= "��������Chocobe��Machine��������";
	public final static String SLOT_LINE_2 	= "��*** ������  ������  ������ ***��";
	public final static String SLOT_LINE_3 	= "��*   �� ��  �� ��  �� ��   *��";
	public final static String SLOT_LINE_4 	= "��*** ������  ������  ������ ***��";
	public final static String SLOT_LINE_5	= "����������������������������������������������";
	public final static String INIT_COMMENT = "���� : Enter             ";
	
	public final static int SLOT_ROW = 7;
	public final static int SLOT_COL = 23;

	public final static int COMMENT_NOTHING = 4;
	public final static int COMMENT_LINE_1  = 5;
	public final static int COMMENT_LINE_2  = 6;
	
	public final static int COMMENT_ROW = 1;
	public final static int COMMENT_COL = SLOT_COL;
	public static char[][] g_full_image;
	
	public final static int RENDER_COMMAND_NOTHING = 1002;
	public final static int RENDER_COMMAND_LINE_1 = 1000;
	public final static int RENDER_COMMAND_LINE_2 = 1001;
	
	public final static int EXIT_PROGRAM = -1;
	
	public final static char TARGET_IMAGE_1 = '*';
	public final static char TARGET_IMAGE_2 = '!';
	public final static char TARGET_IMAGE_3 = '@';
	
	public final static char TARGET_POSITION_ROW = 2;
	public final static char TARGET_POSITION_COL_1 = 6;
	public final static char TARGET_POSITION_COL_2 = 11;
	public final static char TARGET_POSITION_COL_3 = 16;
	
	public final static int TARGET_PERCENT_1 = 1;
	public final static int TARGET_PERCENT_2 = 3;
	
	public static char g_cur_target_1;
	public static char g_cur_target_2;
	public static char g_cur_target_3;
	
	
	public static void main(String[] args) {
		
		game_engine();
		
	} //main
	
	
	// ���� ����
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void game_engine() {
		Scanner scanner = new Scanner(System.in);
		
		init_data();

		render_screen(RENDER_COMMAND_LINE_2);
		scanner.nextLine();
		
		while(g_system_state != EXIT_PROGRAM) {
			setup_my_money_to_screen_image();
			clear_slot();
			render_screen(RENDER_COMMAND_LINE_1);
			
			
			if(is_all_in()) { break; }
			
			setup_my_money_to_screen_image();
			
			input_betting(scanner);
			
			if(g_betting_money != 0) {
				stop_slot(scanner);
				
				update_slot_result(scanner);
			}
		}
		
		scanner.close();
	}
	
	
	// ��ü ������ �ʱ�ȭ
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void init_data() {
		g_full_image = new char[SLOT_ROW][SLOT_COL];
		init_game_image();
		
		g_my_money = 1000;
		g_system_state = 0;
	}
	
	
	// ���� �̹��� �ʱ�ȭ
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void init_game_image() {
		for(int i = 0; i < SLOT_ROW; i++) {
			switch(i) {
			case 0:
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = SLOT_LINE_1.charAt(j);
				}
				break;
				
			case 1:
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = SLOT_LINE_2.charAt(j);
				}
				break;
				
			case 2:
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = SLOT_LINE_3.charAt(j);
				}
				break;
				
			case 3:
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = SLOT_LINE_4.charAt(j);
				}
				break;
				
			case 4:
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = SLOT_LINE_5.charAt(j);
				}
				break;
				
			case 5: 
				for(int j = 0; j < SLOT_COL; j++) {
					g_full_image[i][j] = INIT_COMMENT.charAt(j);
				}
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Error] ��ũ�� ������ ���� : ���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
	}
	
	
	// ȭ�� ���
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void render_screen(int _render_command) {
		for(int i = 0; i <= COMMENT_NOTHING; i++) {
			for(int j = 0; j < SLOT_COL; j++) {
				System.out.print(g_full_image[i][j]);
			}
			
			System.out.println();
		}
		
		if(_render_command == RENDER_COMMAND_LINE_1 ||
				_render_command == RENDER_COMMAND_LINE_2) {
			for(int i = 0; i < SLOT_COL; i++) {
				System.out.print(g_full_image[COMMENT_LINE_1][i]);
			}
			System.out.println();
		}
		
		if(_render_command == RENDER_COMMAND_LINE_2) {
			for(int i = 0; i < SLOT_COL; i++) {
				System.out.print(g_full_image[COMMENT_LINE_2][i]);
			}
		}
	}
	
	
	// ȭ�� Ŭ����
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void clear_screen() {
		for(int i = 0; i < 10; i++) {
			System.out.println();
		}
	}
	
	
	// �����ݾ� ������
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void setup_my_money_to_screen_image() {
		String comment = "������ : " + g_my_money;
		setup_message(comment, COMMENT_LINE_1);
	}
	
	
	// ��� �޽��� ����
	// @author	:	Chocobe
	// @param	:	String _message	: ����� �޽���
	//			:	int _line_num	: ����� ����
	public static void setup_message(String _message, int _line_num) {
		for(int i = 0; i < SLOT_COL; i++) {
			if(i < _message.length()) {
				g_full_image[_line_num][i] = _message.charAt(i);
				
			} else {
				g_full_image[_line_num][i] = ' ';
			}
		}
	}
	
	
	// ���� �˻�
	public static boolean is_all_in() {
		boolean all_in = false;
		
		if(g_my_money == 0) {
			g_system_state = EXIT_PROGRAM;
			
			render_screen(RENDER_COMMAND_NOTHING);
			System.out.println("�����Դϴ�.");
			System.out.print("GAME OVER");
			 all_in = true;
		}
		
		return all_in;
	}
	
	
	// ����
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner ��ü
	// @return	:	N/A
	public static void input_betting(Scanner _sc) {
		while(true) {
			clear_screen();
			render_screen(RENDER_COMMAND_LINE_1);
			
			System.out.print("���� �ϼ���(���� : 0) : ");
			g_betting_money = _sc.nextInt();
			_sc.nextLine();	// ���� ����
			
			clear_screen();
			
			if(g_betting_money > g_my_money) {
				render_screen(RENDER_COMMAND_LINE_1);
				System.out.print("�������� �����մϴ�. Enter");
				
				_sc.nextLine();
				
				continue;
				
			} else if(g_betting_money == 0) {
				String maximum_money_message = "���� ������ : " + g_my_money;
				setup_message(maximum_money_message, COMMENT_LINE_1);
				
				render_screen(RENDER_COMMAND_LINE_1);
				System.out.print("���α׷��� �����մϴ�.");
				
				g_system_state = EXIT_PROGRAM;
				
				break;
			} else {
				g_my_money -= g_betting_money;
				setup_my_money_to_screen_image();
				
				clear_screen();
				render_screen(RENDER_COMMAND_LINE_1);

				break;
			}			
		}
	}
	
	
	// ���� ����
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static char return_random_target() {
		int random_num = (int)(Math.random() * 10) + 1;
		
		if(random_num <= TARGET_PERCENT_1) {
			return TARGET_IMAGE_1;
			
		} else if(random_num <= (TARGET_PERCENT_1 + TARGET_PERCENT_2)) {
			return TARGET_IMAGE_2;
			
		} else {
			return TARGET_IMAGE_3;
		}
	}
	
	
	// ���� �ϳ� ����
	// @author	:	Chocobe
	// @param	:	Scanner _sc	: Scanner ��ü
	// @return	:	N/A
	public static void stop_slot(Scanner _sc) {
		char selected_target = ' ';
		
		render_screen(RENDER_COMMAND_LINE_1);
		_sc.nextLine();
		
		selected_target = return_random_target();
		g_full_image[2][6] = selected_target;
		render_screen(RENDER_COMMAND_LINE_1);
		g_cur_target_1 = selected_target;
		_sc.nextLine();
		
		selected_target = return_random_target();
		g_full_image[2][11] = selected_target;
		render_screen(RENDER_COMMAND_LINE_1);
		g_cur_target_2 = selected_target;
		_sc.nextLine();
		
		selected_target = return_random_target();
		g_full_image[2][16] = selected_target;
		g_cur_target_3 = selected_target;
		render_screen(RENDER_COMMAND_LINE_1);
		_sc.nextLine();
	}
	
	
	// ���� �����
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void clear_slot() {
		g_full_image[2][6] = ' ';
		g_full_image[2][11] = ' ';
		g_full_image[2][16] = ' ';
	}
	
	
	// ���� ��� ����
	public static void update_slot_result(Scanner _sc) {
		String inform_message = "";
		int success_money = 0;
		
		if(g_cur_target_1 == g_cur_target_2 &&
				g_cur_target_1 == g_cur_target_3) { 
			
			setup_message("����! : Enter", COMMENT_LINE_2);
			
			switch(g_cur_target_1) {
			case TARGET_IMAGE_1:
				success_money = g_betting_money * 4;
				break;
				
			case TARGET_IMAGE_2:
				success_money = g_betting_money * 3;
				break;
				
			case TARGET_IMAGE_3:
				success_money = g_betting_money * 2;
				break;
			}
			
			g_my_money += success_money;
			inform_message = "����(+" + success_money +") : Enter";
			
			setup_my_money_to_screen_image();
			setup_message(inform_message, COMMENT_LINE_2);
			
		} else {
			setup_message("���� : Enter", COMMENT_LINE_2);
		}
		
		render_screen(RENDER_COMMAND_LINE_2);
		_sc.nextLine();
	}
}