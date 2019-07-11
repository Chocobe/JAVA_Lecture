package java_swing.gui.label_test;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial") // 단순히 예제의 경고를 지우는 용도
public class My_frame extends JFrame {
	public My_frame() {
		this.setTitle("레이블 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JLabel label_1 = new JLabel("레이블 이름 1");
		JLabel label_2 = new JLabel();
		label_2.setText("레이블 이름 2");
		
		this.add(label_1);
		this.add(label_2);
		
		this.setVisible(true);
	}
}
