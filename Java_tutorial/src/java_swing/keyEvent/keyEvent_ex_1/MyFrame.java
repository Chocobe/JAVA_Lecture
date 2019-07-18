package java_swing.keyEvent.keyEvent_ex_1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements KeyListener {
	public static void main(String[] args) {
		new MyFrame();
	}
	
	
	public MyFrame() {
		this.setTitle("키 이벤트");
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField text_field = new JTextField(20);
		text_field.addKeyListener(this);
		
		this.add(text_field);
		this.setVisible(true);
	}

	
	private void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {		// 사용자가 (아무)키를 입력했을 때 호출
		display(e, "keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {	// 사용자가 키를 눌렀을 때 호출
		display(e, "keyPRessed");
	}

	@Override
	public void keyReleased(KeyEvent e) {	// 사용자가 키에서 손을 떼었을 때 호출
		display(e, "keyReleased");
	}
}
