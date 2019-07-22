package project_convenience_store.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Base_north_panel extends JPanel {
	private JButton button_main;
	private JButton button_manage;
	private JLabel store_name;
	
	private ActionListener action_listener;
	
	
// 생성자
	public Base_north_panel() {
		super();
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		
		this.init_action_listener();
		
		this.init_buttons();
		
		this.setVisible(true);
	}
	
	
// 버튼 초기화
	private void init_buttons() {
		this.button_main = new JButton("Main");		
		this.button_main.setFont(Base_frame.font);
		this.button_main.addActionListener(this.action_listener);
		this.button_main.setEnabled(false);
		
		this.button_manage = new JButton("Manage");
		this.button_manage.setFont(Base_frame.font);
		this.button_manage.addActionListener(this.action_listener);
		
		
		this.store_name = new JLabel("ZS25 서면점");
		this.store_name.setFont(Base_frame.font);
		
		this.add(this.button_main);
		this.add(this.button_manage);
		this.add(this.store_name);
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
					button_main.setEnabled(false);
					button_manage.setEnabled(true);
					
					break;
					
				case "Manage":
					System.out.println("Manage 누름");
					button_main.setEnabled(true);
					button_manage.setEnabled(false);
					
					break;
				}// end switch
			}// end actionPerformed()
		};
	}
}
