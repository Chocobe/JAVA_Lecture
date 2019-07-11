package java_swing.GUI_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class BorderLay extends JFrame {
	private int xpos, ypos;
	private Dimension dim_1, dim_2;
	private JButton button_1 = new JButton("Center");
	private JButton button_2 = new JButton("West");
	private JButton button_3 = new JButton("East");
	private JButton button_4 = new JButton("North");
	private JButton button_5 = new JButton("South");
	
	public BorderLay() {
		super();
		init();
		start();
		
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.dim_1 = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_2 = this.getSize();
		
		this.xpos = (int)dim_1.getWidth() / 2 - (int)dim_2.getWidth() / 2;
		this.ypos = (int)dim_1.getHeight() / 2 - (int)dim_2.getHeight() / 2;
		
		this.setLocation(this.xpos, this.ypos);
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		//this.add(this.button_1, BorderLayout.CENTER);
		
//		this.add(this.button_1);
//		this.add(this.button_2, BorderLayout.WEST);
//		this.add(this.button_3, BorderLayout.EAST);
//		this.add(this.button_4, BorderLayout.NORTH);
//		this.add(this.button_5, BorderLayout.SOUTH);
		
		this.add(this.button_1);
		this.add(this.button_2, BorderLayout.LINE_START);
		this.add(this.button_3, BorderLayout.LINE_END);
		this.add(this.button_4, BorderLayout.PAGE_START);
		this.add(this.button_5, BorderLayout.PAGE_END);
	}
	
	public void start() {
		
	}
}

public class BorderLayout_test {
	public static void main(String[] args) {
		BorderLay frame = new BorderLay();
	}
}
