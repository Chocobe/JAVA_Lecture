package java_swing.layout.card_layout_ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	private int size_x;					// 윈도우 넓이
	private int size_y;					// 윈도우 높이
	
	private Dimension dim_screen;		// 스크린 사이즈
	private Dimension dim_window;		// 윈도우 사이즈
	
	private int pos_x;					// 윈도우 가로 위치 좌표값
	private int pos_y;					// 윈도우 세로 위치 좌표값
	
	private JButton button_next;		// "다음" 버튼
	private JButton button_previous;	// "이전" 버튼
	
	private Card_page page;				// 단계별 페이지 페널
	private int cur_page_num;			// 현재 페이지 번호
	
	
// 생성자
	public MyFrame() {
		super();
		this.init();
		this.create_page();
		this.create_menu();
		
		System.out.println(this.cur_page_num);
		
		this.setVisible(true);
	}
	
	
// 레이지 초기화
	private void init() {
		this.size_x = 900;
		this.size_y = 450;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.pos_x, this.pos_y);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
	}
	
	
// 페이지 생성
	private void create_page() {
		this.cur_page_num = 1;
		this.page = new Card_page();
		this.add(this.page, BorderLayout.CENTER);
	}
	
	
// 메뉴 생성
	private void create_menu() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
		panel.setBackground(Color.LIGHT_GRAY);
		
		this.button_previous = new JButton("이전");
		button_previous.addActionListener(this);
		panel.add(button_previous);
		
		this.button_next = new JButton("다음");
		button_next.addActionListener(this);
		panel.add(this.button_next);
		
		this.add(panel, BorderLayout.SOUTH);
	}
	
	
// actionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		String current_command = e.getActionCommand();
		
		switch(current_command) {
		case "다음":
			this.cur_page_num++;
			this.page.get_layout().next(this.page);
			
			if(cur_page_num >= Card_page.TOTAL_PAGE_NUM) {
				this.button_next.setText("종료");
			}
			
			break;
			
		case "이전":
			this.cur_page_num--;
			
			if(this.cur_page_num < 1) {
				this.cur_page_num = 1;
				break;
			}
			
			if(this.cur_page_num < Card_page.TOTAL_PAGE_NUM) {
				this.button_next.setText("다음");
			}
			
			this.page.get_layout().previous(this.page);
			
			break;
			
		case "종료":
			System.exit(0);

		}// switch
	}
}
