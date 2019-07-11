package java_swing.event;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame_6 extends JFrame {
	private int pos_x;
	private int pos_y;
	
	private Dimension dim_screen;
	private Dimension dim_window;
	
	private JButton button;
	
	public MyFrame_6() {
		super();
		init();
		start();
		
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.dim_screen = Toolkit.getDefaultToolkit().getScreenSize();
		this.dim_window = this.getSize();
		
		this.pos_x = (int)dim_screen.getWidth() / 2 - (int)this.dim_window.getWidth() / 2;
		this.pos_y = (int)dim_screen.getHeight() / 2 - (int)this.dim_window.getHeight() / 2;
		this.setLocation(this.pos_x, this.pos_y);		
		
	}
	
	
	public void init() {
		this.button = new JButton("버튼을 클릭하세요");
		this.button.addActionListener(new MyListener());
		this.add(this.button);
	}
	
	
	public void start() {
		
	}
}


class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		
		if(button.getText().equals("버튼을 클릭하세요")) {
			button.setText("Button Button");
			
		} else {
			button.setText("버튼을 클릭하세요");
		}
	}
}


public class ActionEvent_test {
	public static void main(String[] args) {
		MyFrame_6 frame = new MyFrame_6();
	}
}
