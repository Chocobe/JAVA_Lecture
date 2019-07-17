package java_swing.actionEvent.impl_ActionListener_itself;

import java.awt.BorderLayout;
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
	private int cur_page_num;
	CardPage page;
	
	JButton button_next;
	JButton button_previous;
	
	private int size_x;
	private int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;
	
	
// 생성자
	public MyFrame() {
		super();
		this.init();
		this.create_button();
		
		this.setVisible(true);
	}
	
	
// 레이지 초기화
	public void init() {
		this.cur_page_num = 1;
		this.page = new CardPage();
		this.add(page, BorderLayout.CENTER);
		
		this.setTitle("imple_ActionListener_itself");
		
		this.size_x = 900;
		this.size_y = 450;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.location_x = 
				(int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.location_y = 
				(int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.location_x, this.location_y);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void create_button() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
		
		this.button_previous = new JButton("이전");
		this.button_previous.addActionListener(this);
		
		this.button_next = new JButton("다음");
		this.button_next.addActionListener(this);
		
		panel.add(button_previous);
		panel.add(button_next);
		
		this.add(panel, BorderLayout.SOUTH);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cur_command = e.getActionCommand();
		
		switch(cur_command) {
		case "다음":
			this.cur_page_num++;
			
			if(this.cur_page_num > CardPage.TOTAL_PAGE_NUM) {
				this.cur_page_num = CardPage.TOTAL_PAGE_NUM;
				
			} else {
				this.page.get_layout().next(this.page);
				
				if(this.cur_page_num == CardPage.TOTAL_PAGE_NUM) {
					this.button_next.setText("종료");
					this.button_previous.setEnabled(false);
				}
			}
			break;
		// end case "다음":
			
		case "이전":
			this.cur_page_num--;
			
			if(this.cur_page_num < 1) {
				this.cur_page_num = 1;
				
			} else {
				this.page.get_layout().previous(this.page);
			
			}
			break;
		// end case "이전":
		
		case "종료":
			System.exit(0);
		}
	}
}
