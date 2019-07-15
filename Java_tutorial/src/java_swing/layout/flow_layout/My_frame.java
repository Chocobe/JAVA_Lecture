package java_swing.layout.flow_layout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class My_frame extends JFrame {
	private int size_x;
	private int size_y;
	
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	public My_frame(int _flow_layout_code) {
		this.init();
		this.set_flow_layout(_flow_layout_code);
		
		this.setVisible(true);
	}
	
	public void init() {
		this.size_x = 500;
		this.size_y = 400;
		this.setSize(this.size_x, this.size_y);		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		
		this.setLocation(this.pos_x, this.pos_y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void set_flow_layout(int _flow_layout_code) {
		JButton button_1 = new JButton("버튼_1");
		JButton button_2 = new JButton("버튼_2");
		
		this.setLayout(new FlowLayout(_flow_layout_code));
		
		this.add(button_1);
		this.add(button_2);
	}
}
