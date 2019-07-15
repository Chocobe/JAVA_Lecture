package java_swing.layout.box_layout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class My_frame extends JFrame {
	private int size_x;
	private int size_y;
	
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
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
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
	}
	
	
	public void add_component() {
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		
		// X축 정렬 설정
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		// Y축 정렬 설정
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		JButton button_1 = new JButton("버튼_1");
		JButton button_2 = new JButton("버튼_2");
		JButton long_button_1 = new JButton("사이즈가 긴 버튼_1");
		JButton button_3 = new JButton("버튼_3");
		JButton button_4 = new JButton("버튼_4");
		JButton long_button_2 = new JButton("사이즈가 긴 버튼_2");
		
		panel_1.add(button_1);
		panel_1.add(button_2);
		panel_1.add(long_button_1);
		panel_2.add(button_3);
		panel_2.add(button_4);
		panel_2.add(long_button_2);
		
		this.add(panel_1);
		this.add(panel_2);
	}
}
