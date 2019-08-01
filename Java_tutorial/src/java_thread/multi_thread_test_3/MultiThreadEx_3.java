package java_thread.multi_thread_test_3;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MultiThreadEx_3 extends JFrame {
	public MultiThreadEx_3() {
		this.setTitle("FlickeringLabelEx");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel flicker_label_1 = new FlickeringLabel("깜빡", 500);
		
		JLabel label = new JLabel("안깜빡");
		
		FlickeringLabel flicker_label_2 = new FlickeringLabel("여기도 깜빡", 300);
		
		c.add(flicker_label_1);
		c.add(label);
		c.add(flicker_label_2);
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MultiThreadEx_3();
	}
}
