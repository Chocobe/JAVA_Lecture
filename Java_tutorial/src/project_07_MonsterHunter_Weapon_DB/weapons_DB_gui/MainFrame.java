package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private static final int SIZE_X;
	private static final int SIZE_Y;
	private static int location_x;
	private static int location_y;
	
	private static Dimension dim_screen;
	private static Dimension dim_window;
	
	static {
		SIZE_X = 500;
		SIZE_Y = 600;
		initFrameSize();
	}
	
	private JPanel northPanel;
	private CenterTab centerTab;


// 생성자
	public MainFrame() {
		initFrame();
		initNorthFrame();
		initCenterTab();
	}
	
	
// dim_window getter
	public Dimension getDimWindow() {
		return dim_window;
	}
	
	public int getSize_X() {
		return SIZE_X;
	}

	
// 화면 크기 초기화
	private static void initFrameSize() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		dim_screen = kit.getScreenSize();
		dim_window = new Dimension(SIZE_X, SIZE_Y);
		
		location_x = ((int)dim_screen.getSize().getWidth() / 2) - (SIZE_X / 2);
		location_y = ((int)dim_screen.getSize().getHeight() / 2) - (SIZE_Y / 2);
	}

	
// Frame 초기화
	private void initFrame() {
		this.setTitle("Monster Hunter Weapons DB");
		this.setBounds(location_x, location_y, SIZE_X, SIZE_Y);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setLayout(new BorderLayout(10, 10));
		
		this.setBackground(Color.BLACK);
	}
	
	
// North panel 초기화
	private void initNorthFrame() {
		this.northPanel = new NorthPanel(this);
		this.getContentPane().add(this.northPanel, BorderLayout.NORTH);
	}
	
	
// Center tab 초기화
	private void initCenterTab() {
		this.centerTab = new CenterTab(this);
		this.getContentPane().add(this.centerTab, BorderLayout.CENTER);
	}

}
