package java_swing.GUI_2;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setTitle("BoxLayoutTest");
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		make_button(panel, "Button_1");
		make_button(panel, "Button_2");
		make_button(panel, "Button_3");
		make_button(panel, "B4");
		make_button(panel, "Long Button_5");
		
		this.add(panel);
		this.setVisible(true);
	}
	
	
	private void make_button(JPanel _panel, String _text) {
		JButton button = new JButton(_text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		_panel.add(button);
	}
}


public class BoxLayout_test {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
