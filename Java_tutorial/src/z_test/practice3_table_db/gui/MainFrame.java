package z_test.practice3_table_db.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private int size_x;
	private int size_y;
	private Dimension dim_screen;
	private Dimension dim_window;
	private int location_x;
	private int location_y;
	private final String TITLE_NAME = "Test Program";
	
	private JPanel westPanel;
	private JPanel centerPanel;
	
	public MainFrame() {
		initFrame();
	}
	
	private void initFrame() {
		this.setTitle(TITLE_NAME);
		size_x = 600;
		size_y = 500;
		this.setSize(this.size_x, this.size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		dim_screen = kit.getScreenSize();
		dim_window = this.getSize();
		this.location_x = (int)dim_screen.getWidth() / 2 - (int)dim_window.getWidth() / 2;
		this.location_y = (int)dim_screen.getHeight() / 2 - (int)dim_window.getHeight() / 2;
		this.setLocation(location_x, location_y);
		
		this.getContentPane().setLayout(new BorderLayout());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
	
	
	public void setPanel(View _westPanel, View _centerPanel) {
		if(_westPanel instanceof JPanel) {
			this.westPanel = (JPanel)_westPanel;
			
		} else {
			System.out.println("컴포넌트 연결 실패 : westPanel");
		}
		
		if(_centerPanel instanceof JPanel) {
			this.centerPanel = (JPanel)_centerPanel;
			
		} else {
			System.out.println("컴포넌트 연결 실패 : centerpanel");
		}
		
		this.getContentPane().add(westPanel);
		this.getContentPane().add(centerPanel);
	}
}
