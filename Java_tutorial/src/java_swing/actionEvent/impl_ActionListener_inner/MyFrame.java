package java_swing.actionEvent.impl_ActionListener_inner;

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
public class MyFrame extends JFrame {
	private int cur_page_num;
	
	private CardPage page;
	private JButton button_next;
	private JButton button_previous;
	
	private ActionListener action_listener;
	
	private int size_x;
	private int size_y;
	
	private int location_x;
	private int location_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	
	public MyFrame() {
		super();
		init();
		create_button();
		
		this.setVisible(true);
	}
	
	
	private void init() {
		this.setTitle("impl_ActionListener_inner");
		
		this.cur_page_num = 1;
		this.page = new CardPage();
		this.add(page, BorderLayout.CENTER);
		
		this.action_listener = new MyActionListener();
		
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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void create_button() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
		
		this.button_next = new JButton("다음");
		this.button_next.addActionListener(this.action_listener);
		
		this.button_previous = new JButton("이전");
		this.button_previous.addActionListener(this.action_listener);
		
		panel.add(this.button_previous);
		panel.add(this.button_next);
		
		this.add(panel, BorderLayout.SOUTH);
	}
	
	
	class MyActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String cur_command = e.getActionCommand();

			switch(cur_command) {
			case "다음":
				cur_page_num++;
				
				if(cur_page_num > CardPage.TOTAL_PAGE_NUM) {
					cur_page_num = CardPage.TOTAL_PAGE_NUM;
					
				} else {
					page.get_layout().next(page);
					
					if(cur_page_num == CardPage.TOTAL_PAGE_NUM) {
						button_next.setText("종료");
						button_previous.setEnabled(false);
					}
				}
				break;
			// end case "다음":
				
			case "이전":
				cur_page_num--;
				
				if(cur_page_num < 1) {
					cur_page_num = 1;
					
				} else {
					page.get_layout().previous(page);
				}// end if~else
				break;
			// end case "이전":
				
			case "종료":
				System.exit(0);
			}// end switch()
		}// end actionPerformed()
	}// end class MyActionListener
}
