package window_builder;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class WB_test_3 extends JFrame {
	private JTextField textField;
	public WB_test_3() {
		initGUI();
	}
	private void initGUI() {
		
		textField = new JTextField();
		getContentPane().add(textField, BorderLayout.WEST);
		textField.setColumns(10);
	}

}
