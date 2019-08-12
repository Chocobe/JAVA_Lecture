package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class CenterTab extends JTabbedPane {
	private Dimension dim_window;
	
// 생성자
	public CenterTab(Dimension size) {
		this.dim_window = size;
		initTab();
	}
	
// 텝 초기화
	private void initTab() {
		
		JPanel searchMainPanel = new JPanel();
		this.addTab("무기검색", null, searchMainPanel, "무기검색");
		
		JPanel insertMainPanel = new JPanel();
		this.addTab("데이터 입력", null, insertMainPanel, "무기 데이터 추가");
	}
	
	
	
	
	

}
