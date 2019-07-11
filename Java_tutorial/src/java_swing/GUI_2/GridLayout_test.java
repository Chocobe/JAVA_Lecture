package java_swing.GUI_2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

class Grid extends JFrame {
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private JButton button_1 = new JButton("버튼_1");
	private JButton button_2 = new JButton("버튼_2");
	private JButton button_3 = new JButton("버튼_3");
	
	public Grid() {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.dim_screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		
		this.setLocation(this.pos_x, this.pos_y);
	}
}

public class GridLayout_test {
	public static void main(String[] args) {
		Grid frame = new Grid();
	}
}
