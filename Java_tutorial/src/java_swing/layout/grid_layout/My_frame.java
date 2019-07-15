package java_swing.layout.grid_layout;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class My_frame extends JFrame {
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private int size_x;
	private int size_y;
	
	public My_frame() {
		this.init();
		this.add_component();
		this.setVisible(true);
	}
	
	
	public void init() {
		this.size_x = 500;
		this.size_y = 500;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.pos_x, this.pos_y);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0, 3));		
	}
	
	
	public void add_component() {
		JButton button_1 = new JButton("버튼_1");
		JButton button_2 = new JButton("버튼_2");
		JButton button_3 = new JButton("버튼_3");
		JButton button_4 = new JButton("버튼_4");
		JButton button_5 = new JButton("버튼_5");
		
		this.add(button_1);
		this.add(button_2);
		this.add(button_3);
		this.add(button_4);
		this.add(button_5);
	}
}
