package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class CenterTab extends JTabbedPane {
	public CenterTab() {
		JPanel searchMainPanel = new JPanel();
		this.addTab("Search", null, searchMainPanel, "무기검색");
		
		
		JPanel insertMainPanel = new JPanel();
		this.addTab("Insert", null, insertMainPanel, "무기 데이터 추가");
	}
}
