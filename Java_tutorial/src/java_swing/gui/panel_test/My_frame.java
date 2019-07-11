package java_swing.gui.panel_test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")	// 단순히 예제의 경고를 지우는 용도
public class My_frame extends JFrame {
	public My_frame() {
		this.setTitle("패널 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button_1 = new JButton("버튼1");
		JButton button_2 = new JButton("버튼2");
		
		JPanel panel = new JPanel();
		
		panel.add(button_1);
		panel.add(button_2);
		
		this.add(panel);
		
		this.setVisible(true);
	}
}
