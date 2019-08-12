package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private JPanel northPanel;
	private CenterTab centerTab;


// 생성자
	public MainFrame() {
		initFrame();
		initNorthFrame();
		initCenterTab();
	}

	
// Frame 초기화
	private void initFrame() {
		this.setTitle("Monster Hunter Weapons DB");
		this.setBounds(100, 100, 600, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(10, 10));
	}
	
	
// North panel 초기화
	private void initNorthFrame() {
		this.northPanel = new NorthPanel(this.getSize());
		this.getContentPane().add(this.northPanel, BorderLayout.NORTH);
	}
	
	
// Center tab 초기화
	private void initCenterTab() {
		this.centerTab = new CenterTab();
		this.getContentPane().add(this.centerTab, BorderLayout.CENTER);
	}

}
