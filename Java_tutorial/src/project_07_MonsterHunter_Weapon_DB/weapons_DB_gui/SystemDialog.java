package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent.AdminOptionGroupPanel;

@SuppressWarnings("serial")
public class SystemDialog extends JDialog {
	
	private MainFrame frame;
	
	public SystemDialog(MainFrame frame) {
		this.frame = frame;
		this.initDialog();
		this.initTopPanel();
		this.initMidPanel();
	}
	
	
	private void initDialog() {
		this.setSize(frame.getSize());
		this.setLocation(frame.getLocation_x(), frame.getLocation_y());
		this.setModal(true);
	}
	
	
	private void initTopPanel() {
		JPanel topPanel = new JPanel();
		topPanel.setBackground(new Color(0, 153, 0));
		
		JLabel nameLabel = new JLabel("Admin Mode : Update Weapons Data");
		nameLabel.setFont(new Font("고딕", Font.PLAIN, 25));
		nameLabel.setAlignmentX(CENTER_ALIGNMENT);
		topPanel.add(nameLabel);
		
		this.add(topPanel, BorderLayout.NORTH);
	}
	
	
	private void initMidPanel() {
		JScrollPane midScroll = new JScrollPane();
		
		JPanel optionPanel = new AdminOptionGroupPanel(this.frame);
		midScroll.setViewportView(optionPanel);
		
		this.add(midScroll, BorderLayout.CENTER);
	}
}
