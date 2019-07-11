package java_swing.GUI_2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Flow_layout extends JFrame {	
	private int xpos;
	private int ypos;
	Dimension dim_1;
	Dimension dim_2;
	
	private JButton button_1 = new JButton("버튼_1");
	private JButton button_2 = new JButton("버튼_2");
	private JButton button_3 = new JButton("버튼_3");
	private JButton button_4 = new JButton("버튼_4");
	private JButton button_5 = new JButton("버튼_5");
	
	private JPanel panel_1 = new JPanel();
	
	public Flow_layout() {
		super();
		init();
		start();
		this.setSize(300, 200);
		
		this.dim_1 = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_2 = this.getSize();
		
		this.xpos = (int)dim_1.getWidth() / 2 - (int)dim_2.getWidth() / 2;
		this.ypos = (int)dim_1.getHeight() / 2 - (int)dim_2.getHeight() / 2;
		
		this.setTitle("FlowLayout");
		this.setLocation(this.xpos, this.ypos);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init() {
		this.panel_1.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.panel_1.add(this.button_1);
		this.panel_1.add(this.button_2);
		this.panel_1.add(this.button_3);
		this.panel_1.add(this.button_4);
		this.panel_1.add(this.button_5);
		
		this.add(this.panel_1);
	}
	
	
	private void start() {
		
	}
}

public class FlowLayout_test {
	public static void main(String[] args) {
		Flow_layout frame = new Flow_layout();
	}
}
