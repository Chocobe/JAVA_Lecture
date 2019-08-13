package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class NorthPanel extends JPanel implements ActionListener {
	private static final String SYS_AUTHENTICATION;
	
	static {
		SYS_AUTHENTICATION = "a";
	}
	
	private MainFrame frame;
	private Dimension size;
	
	public NorthPanel(MainFrame frame) {
		this.frame = frame;
		this.size = frame.getDimWindow();
		this.setSize(size);
		this.initNorthPanel();
	}
	

// panel 크기 설정
	public void setSize(Dimension size) {
		this.size = size;
	}
	
	
// panel 초기화
	private void initNorthPanel() {
	// 타이틀 외부 패널
		this.setPreferredSize(new Dimension((int)this.size.getWidth(), 100));
		this.setBackground(new Color(0, 102, 0));
		this.setLayout(new BorderLayout());
		
	// 타이틀 내부 패널
		JPanel innerPanel = new JPanel();
		innerPanel.setPreferredSize(new Dimension((int)this.size.getWidth() - 24, 65));
		innerPanel.setBackground(new Color(0, 153, 0));
		
		this.add(innerPanel);
		innerPanel.setLayout(new BorderLayout(0, 0));
		
	// 타이틀 내용 - NORTH
		JMenuBar menu = new JMenuBar();
		this.add(menu, BorderLayout.NORTH);
		
		JMenu mainMenu_Menu = new JMenu("Menu");
		menu.add(mainMenu_Menu);
		
		JMenuItem itemMenu_System = new JMenuItem("System");
		itemMenu_System.addActionListener(this);
		mainMenu_Menu.add(itemMenu_System);
		
		JMenuItem itemMenu_Exit = new JMenuItem("Exit");
		itemMenu_Exit.addActionListener(this);
		mainMenu_Menu.add(itemMenu_Exit);
		
		JMenu mainMenu_Help = new JMenu("Help");
		menu.add(mainMenu_Help);
		
		JMenuItem itemHelp_About = new JMenuItem("About");
		itemHelp_About.addActionListener(this);
		mainMenu_Help.add(itemHelp_About);
		
	// 타이틀 내용 - CENTER
		JLabel titleLabel = new JLabel("Monaster Hunter Weapons DB");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setFont(new Font("고딕", Font.PLAIN, 25));
		innerPanel.add(titleLabel, BorderLayout.CENTER);
		
	// 타이틀 내용 - SOUTH
		JPanel devPanel = new JPanel();
		devPanel.setBackground(new Color(0, 153, 102));
		devPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		innerPanel.add(devPanel, BorderLayout.SOUTH);
		
		JLabel devLabel = new JLabel("Dev : 김영우      (ver 1.0)");
		devPanel.add(devLabel);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		switch(command) {
		case "Exit":
			int isExit = JOptionPane.NO_OPTION;
			isExit =JOptionPane.showConfirmDialog(frame, "종료합니까?", 
							"Exit", JOptionPane.YES_NO_OPTION);
			
			if(isExit == JOptionPane.YES_OPTION) {
				System.exit(0);	
			}
			
			break;
			
		case "About":
			String aboutMessage = 
					"Released 2019.08.12 for Portfolio\n" +
					"Thank you for using\n" +
					"Copyright ⓒ YoungWoo Kim";
			
			JOptionPane.showMessageDialog(frame, aboutMessage, 
							"About", JOptionPane.INFORMATION_MESSAGE);
			
			break;
			
		case "System":
			String authentication = JOptionPane.showInputDialog(
							"관리자 모드\n" +
							"(코드값 : chocobe)");
			
			if(authentication != null && authentication.equals(SYS_AUTHENTICATION)) {
				System.out.println("인증 성공!");
				SystemDialog systemDialog = new SystemDialog(frame);
				systemDialog.setVisible(true);
				// System Dialog 불러오기
				
			} else {
				JOptionPane.showMessageDialog(frame, "인증 실패", "인증 에러", 
								JOptionPane.WARNING_MESSAGE);
			}
			
		}
	}
	
}

























