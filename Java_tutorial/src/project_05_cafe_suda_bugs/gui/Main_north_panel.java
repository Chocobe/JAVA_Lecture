package project_05_cafe_suda_bugs.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
	
	private JPanel store_name_panel;
	private JLabel store_name;
	
	private ActionListener action_listener;
	
	private Font font_menu;
	private Font font_store_name;
	
	
// 생성자
	public Main_north_panel(Font _font_menu) {
		super();

		this.font_menu = _font_menu;
		
		this.font_store_name = new Font(null, Font.PLAIN, 18);
		
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
		
		this.store_name = new JLabel("쓰다벅스 - 그린점");
		this.store_name.setFont(this.font_store_name);
		this.store_name_panel = new JPanel(new BorderLayout());
		this.store_name_panel.setPreferredSize(new Dimension(700, 20));
		this.store_name_panel.add(this.store_name, BorderLayout.EAST);
		
		
		this.add(this.button_main);
		this.add(this.button_manage);
		this.add(this.store_name_panel);
	}
	
	
// 메인 모드 전환
	public void change_to_main_mode() {
		this.button_main.setEnabled(false);
		this.button_manage.setEnabled(true);
	}
	
	
// 관리 모드 전환
	public void change_to_manage_mode() {
		this.button_main.setEnabled(true);
		this.button_manage.setEnabled(false);
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
					Main_frame.get_frame().change_to_main_mode();					
					
					break;
					
				case "Manage":
					System.out.println("Manage 누름");
					Main_frame.get_frame().change_to_manage_mode();					
					
					break;
				}// end switch
			}// end actionPerformed()
		};
	}// end init_action_listener()
}
