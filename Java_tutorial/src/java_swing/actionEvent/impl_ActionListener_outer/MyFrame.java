package java_swing.actionEvent.impl_ActionListener_outer;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	private CardPage card;
	
	private JButton button_next;
	private JButton button_previous;
	
	private MyActionListener my_action_listener;
	
	private int size_x;
	private int size_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int location_x;
	private int location_y;
	

// 생성장
	public MyFrame() {
		super();
		this.init_frame();
		this.init_component();
		
		this.setVisible(true);
	}
	
	
// JFrame 초기화
	private void init_frame() {
		this.size_x = 900;
		this.size_y = 450;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		this.location_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.location_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.location_x, this.location_y);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
// 컴포넌트 초기화
	private void init_component() {		
		this.card = new CardPage();
		this.add(this.card, BorderLayout.CENTER);
		
		this.button_next = new JButton("NEXT");
		this.button_previous = new JButton("PREVIOUS");
		
		this.my_action_listener = new MyActionListener(this.button_next, this.button_previous, this.card);
		
		this.button_next.addActionListener(this.my_action_listener);		
		this.button_previous.addActionListener(this.my_action_listener);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 10));
		panel.add(this.button_previous);
		panel.add(this.button_next);
		
		this.add(panel, BorderLayout.SOUTH);
	}
}
