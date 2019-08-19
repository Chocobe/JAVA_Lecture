package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
		SIZE_Y = 750;
		initFrameSize();
	}
	
	private JPanel northPanel;
	private CenterTab centerTab;

// 생성자
	public MainFrame() {
		initFrame();
		
		initNorthFrame();
		initCenterTab();
		
		
		
		
		
//		
//		
//		
//		// 테스트용
//		JButton testButton = new JButton("DTO 출력");
//		testButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println(centerTab.getSelectedOption());				
//			}
//		});
//		
//		this.getContentPane().add(testButton, BorderLayout.SOUTH);
//		//
//		
//		
		
		
		
		
	}
	
	
// size getter
	public Dimension getDimWindow() {
		return dim_window;
	}
	
	public int getSize_x() {
		return SIZE_X;
	}
	
	public int getSize_y() {
		return SIZE_Y;
	}
	
// location getter
	public int getLocation_x() {
		return location_x;
	}
	
	public int getLocation_y() {
		return location_y;
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
		
		JScrollPane centerScroll = new JScrollPane(centerTab);
		
		this.getContentPane().add(centerScroll);
	}

}
