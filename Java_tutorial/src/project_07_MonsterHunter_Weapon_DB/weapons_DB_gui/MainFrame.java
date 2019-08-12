package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;

public class MainFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Test_1 window = new Test_1();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		MainFrame test = new MainFrame();
		test.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
		init_southPanel();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	private void init_southPanel() {
	// 타이틀 외부 패널
		JPanel southPanel = new JPanel();
		southPanel.setPreferredSize(new Dimension((int)this.frame.getSize().getWidth(), 75));
		southPanel.setBackground(new Color(0, 102, 0));
		
	// 타이틀 내부 패널
		JPanel innerPanel = new JPanel();
		innerPanel.setPreferredSize(new Dimension((int)this.frame.getSize().getWidth() - 24, 65));
		innerPanel.setBackground(new Color(0, 153, 0));
		
		southPanel.add(innerPanel);
		innerPanel.setLayout(new BorderLayout(0, 0));
		
	// 타이틀 내용
		JLabel titleLabel = new JLabel("Monaster Hunter Weapons DB");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("고딕", Font.PLAIN, 25));
		innerPanel.add(titleLabel, BorderLayout.CENTER);
		
		JPanel devPanel = new JPanel();
		devPanel.setBackground(new Color(0, 153, 102));
		devPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		innerPanel.add(devPanel, BorderLayout.SOUTH);
		
		JLabel devLabel = new JLabel("Released 2019-08-12    Dev : 김영우");
		devPanel.add(devLabel);
		
		frame.getContentPane().add(southPanel, BorderLayout.NORTH);
		
	// 중앙 텝
		JTabbedPane tabbedPanel = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPanel.addTab("New tab", null, panel, null);
	}

}
