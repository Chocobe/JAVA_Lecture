package java_swing.layout.border_layout;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
		this.add_button();
		
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
		
		// BorderLayout 생성자의 매개변수 (수평 간격, 수직간격)
		this.setLayout(new BorderLayout(50, 50));
	}
	
	
	public void add_button() {
		JButton button_1 = new JButton("North");
		JButton button_2 = new JButton("South");
		JButton button_3 = new JButton("West");
		JButton button_4 = new JButton("East");
		JButton button_5 = new JButton("Center");
		
		// 북쪽에 배치
		this.add(button_1, BorderLayout.NORTH);
		// 남쪽에 배치
		this.add(button_2, BorderLayout.SOUTH);
		// 서쪽에 배치
		this.add(button_3, BorderLayout.WEST);
		// 동쪽에 배치
		this.add(button_4, BorderLayout.EAST);
		// 중앙에 배치
		this.add(button_5, BorderLayout.CENTER);
	}
}


























