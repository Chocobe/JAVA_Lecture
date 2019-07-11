package java_swing.gui.text_field;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class My_frame extends JFrame {
	public My_frame() {
		this.setTitle("텍스트 필드 테스트");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JTextField text_field_1 = new JTextField(10);
		JTextField text_field_2 = new JTextField(20);
		
		this.add(text_field_1);
		this.add(text_field_2);
		
		this.setVisible(true);
	}
}
