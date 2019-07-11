package java_swing.gui.button_test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial") // 단순히 예제의 경고를 지우는 용도
public class My_frame extends JFrame {

	public My_frame() {
		this.setTitle("버튼 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JButton button_1 = new JButton("버튼이름");
		JButton button_2 = new JButton();
		button_2.setText("버튼이름2");
		
		this.add(button_1);
		this.add(button_2);
		
		this.setVisible(true);
	}
}
