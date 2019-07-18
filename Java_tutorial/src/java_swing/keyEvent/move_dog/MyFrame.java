package java_swing.keyEvent.move_dog;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {
	public MyFrame() {
		this.setSize(900, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(new MyPanel());
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
