package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class NorthPanel extends JPanel {
	
	private Dimension size;
	
	public NorthPanel(Dimension size) {
		this.setSize(size);
		this.initSouthPanel();
	}
	

// panel 크기 설정
	public void setSize(Dimension size) {
		this.size = size;
	}
	
	
// panel 초기화
	private void initSouthPanel() {
	// 타이틀 외부 패널
		this.setPreferredSize(new Dimension((int)this.size.getWidth(), 75));
		this.setBackground(new Color(0, 102, 0));
		
	// 타이틀 내부 패널
		JPanel innerPanel = new JPanel();
		innerPanel.setPreferredSize(new Dimension((int)this.size.getWidth() - 24, 65));
		innerPanel.setBackground(new Color(0, 153, 0));
		
		this.add(innerPanel);
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
	}
}
