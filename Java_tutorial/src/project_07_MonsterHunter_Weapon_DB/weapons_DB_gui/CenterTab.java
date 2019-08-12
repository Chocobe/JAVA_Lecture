package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class CenterTab extends JTabbedPane {
	private Dimension dim_window;
	
	public CenterTab(Dimension size) {
		initTab(size);
	}
	
	
	private void initTab(Dimension size) {
		dim_window = size;
		
		JPanel searchMainPanel = new JPanel();
		this.addTab("Search", null, searchMainPanel, "무기검색");
		
		JPanel insertMainPanel = new JPanel();
		this.addTab("Insert", null, insertMainPanel, "무기 데이터 추가");
	}
}
