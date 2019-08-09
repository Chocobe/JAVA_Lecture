package z_test.practice2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JPanel centerPanel;
	private JPanel southPanel;
	
	public MyFrame() {
		super();
		initFrame();
	}
	
	
	private void initFrame() {
		this.setBounds(700, 400, 500, 300);
		this.setTitle("테이블 테스트");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void initPanel() {
		this.centerPanel = new CenterPanel();
		
	}
	
	public void runFrame() {
		this.setVisible(true);
	}
}
