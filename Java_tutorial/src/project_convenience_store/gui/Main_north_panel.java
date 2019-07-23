package project_convenience_store.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Main_north_panel extends JPanel {
	
	private JButton button_main;
	private JButton button_manage;
	private JLabel store_name;
	
	private ActionListener action_listener;
	
	private Font font_menu;
	
// 생성자
	public Main_north_panel(Font _font_menu) {
		super();

		this.font_menu = _font_menu;
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		
		this.init_action_listener();
		
		this.init_buttons();
		
		this.setVisible(true);
	}
	
	
// 버튼 초기화
	private void init_buttons() {
		this.button_main = new JButton("Main");		
		this.button_main.setFont(this.font_menu);
		this.button_main.addActionListener(this.action_listener);
		this.button_main.setEnabled(false);
		
		this.button_manage = new JButton("Manage");
		this.button_manage.setFont(this.font_menu);
		this.button_manage.addActionListener(this.action_listener);
		
		
		this.store_name = new JLabel("ZS25 서면점");
		this.store_name.setFont(this.font_menu);
		
		this.add(this.button_main);
		this.add(this.button_manage);
		this.add(this.store_name);
	}
	
	
// 메인버튼 활성화
	private void button_main_enable() {
		this.button_main.setEnabled(true);
		this.button_manage.setEnabled(false);
	}
	
	
// 메니저버튼 활성화
	private void button_manage_enable() {
		this.button_manage.setEnabled(true);
		this.button_main.setEnabled(false);
	}
	
	
// action_listener 초기화
	private void init_action_listener() {
		this.action_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				
				switch(command) {
				case "Main":
					System.out.println("Main 누름");
					button_manage_enable();
					Main_frame.get_main_frame().east_panel.visible_main_panel();
					Main_frame.get_main_frame().center_panel.visible_main_panel();
					
					break;
					
				case "Manage":
					System.out.println("Manage 누름");
					button_main_enable();
					Main_frame.get_main_frame().east_panel.visible_manage_panel();
					
					break;
				}// end switch
			}// end actionPerformed()
		};
	}
}
