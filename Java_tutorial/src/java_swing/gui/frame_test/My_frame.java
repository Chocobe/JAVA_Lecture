package java_swing.gui.frame_test;

import javax.swing.JFrame;

@SuppressWarnings("serial") // 단순히 예제의 경고를 지우는 용도
public class My_frame extends JFrame {
	public My_frame() {
		this.setTitle("프레임 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
