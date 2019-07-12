package java_swing.event.action_lister_2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class My_frame extends JFrame {
	private JButton button_1;
	private JButton button_2;
	
	private int pos_x;
	private int pos_y;
	
	Dimension dim_screen;
	Dimension dim_window;
	
	public My_frame() {
		super();
		init();
		start();
		
		this.setTitle("무명 클래스 ActionListener 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dim_screen = kit.getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)this.dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)this.dim_screen.getHeight() / 2 - (int)this.dim_window.getWidth() / 2;
		
		this.setLocation(this.pos_x, this.pos_y);
		
		this.setVisible(true);
	}
	
	
	private void init() {
		this.button_1 = new JButton("버튼_1 : Off");
		this.button_2 = new JButton("버튼_2 : Off");
		
		this.add(button_1);
		this.add(button_2);
	}
	
	
	private void start() {
		this.button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button_1) {
					if(button_1.getText().equals("버튼_1 : Off")) {
						button_1.setText("버튼_1 : On");
						
					} else {
						button_1.setText("버튼_1 : Off");
					}
					
				}
			}
		});
		
		this.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button_2) {
					if(button_2.getText().equals("버튼_2 : Off")) {
						button_2.setText("버튼_2 : On");
						
					} else {
						button_2.setText("버튼_2 : Off");
					}
				}
				
			}
		});		
	}
}
