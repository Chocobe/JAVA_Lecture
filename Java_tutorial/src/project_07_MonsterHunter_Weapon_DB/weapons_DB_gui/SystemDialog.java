package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent.AdminOptionGroupPanel;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent.AdminTableDialog;

@SuppressWarnings("serial")
public class SystemDialog extends JDialog {
	
	private MainFrame frame;
	private AdminTableDialog infoDialog;
	
	public SystemDialog(MainFrame frame) {
		this.frame = frame;
		this.initDialog();
		this.initTopPanel();
		this.initMidPanel();
		this.initCloseOperation();
		// 데이터 출력 테이블  Dialog 초기화 할 것
		this.initTableDialog();
	}
	
	
	private void initDialog() {
		this.setTitle("관리자 모드");
		this.setSize(new Dimension(frame.getSize_x(), frame.getSize_y() - 70));
		this.setLocation(frame.getLocation_x() - (int)(this.getSize().getWidth() / 2), 
						frame.getLocation_y());
		
//		this.setModal(true);
	}
	
	
// 상단부 페널 초기화
	public void initTopPanel(JDialog target, String title) {
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(0, 153, 0));
		
		JLabel nameLabel = new JLabel(title);
		nameLabel.setFont(new Font("고딕", Font.PLAIN, 25));
		nameLabel.setAlignmentX(CENTER_ALIGNMENT);
		topPanel.add(nameLabel);
		
		target.add(topPanel, BorderLayout.NORTH);
	}
	
	private void initTopPanel() {
		initTopPanel(this, "Admin Mode : Update Weapons Data");
	}
	
	
// 옵션 페널 초기화
	private void initMidPanel() {
		JScrollPane midScroll = new JScrollPane();
		
		JPanel optionPanel = new AdminOptionGroupPanel(this.frame);
		midScroll.setViewportView(optionPanel);
		
		this.add(midScroll, BorderLayout.CENTER);
	}
	
	
	private void initCloseOperation() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				infoDialog.dispose();
			}
		});
	}
	
	
	private void initTableDialog() {
		// 테이블 Dialog 생성할 것
		infoDialog = new AdminTableDialog(this);
	}	
}
