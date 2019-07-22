package project_convenience_store.gui;

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
public abstract class Base_frame extends JFrame {
	protected final static int size_x;
	protected final static int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;

	protected static ActionListener action_listener;
	protected static JPanel north_panel;
	protected static JButton button_main;
	protected static JButton button_manager;
	

	
	
// 클래스 변수 초기화
	static {
		size_x = 700;
		size_y = 500;
	}
	
	
// 생성자
	protected Base_frame() {
		this.setSize(Base_frame.size_x, Base_frame.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.location_x =
				(int)this.dim_screen.getWidth() / 2 -
				(int)this.dim_window.getWidth() / 2;
		this.location_y =
				(int)this.dim_screen.getHeight() / 2 -
				(int)this.dim_window.getHeight() / 2;
		this.setLocation(this.location_x, this.location_y);
		
		this.setLayout(new BorderLayout());
		
		this.init_north_component();
		this.init_center_component();		
		
		this.setResizable(false);
	}
	
	
	protected abstract void set_default_close_operation();
	protected abstract void set_frame_title();
	
	
	private void init_north_component() {
		Base_frame.action_listener = new Main_menu_action_listener();
		
		Base_frame.button_main = new JButton("Main");
		Base_frame.button_main.addActionListener(Base_frame.action_listener);
		Base_frame.button_main.setEnabled(false);
		
		Base_frame.button_manager = new JButton("Manager");
		Base_frame.button_manager.addActionListener(Base_frame.action_listener);
		
		Base_frame.north_panel = new JPanel();
		Base_frame.north_panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
		Base_frame.north_panel.add(Base_frame.button_main);
		Base_frame.north_panel.add(Base_frame.button_manager);
		
		// test
		Base_frame.north_panel.setBackground(Color.LIGHT_GRAY);
		
		this.add(Base_frame.north_panel, BorderLayout.NORTH);
	}
	
	
	private void init_center_component() {
		
	}
	
	
	class Main_menu_action_listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			switch(command) {
			case "Main":
				System.out.println("Main 버튼 누름");
				break;
				
			case "Manager":
				System.out.println("Manager 버튼 누름");
				break;
			}
		}
	}
}
