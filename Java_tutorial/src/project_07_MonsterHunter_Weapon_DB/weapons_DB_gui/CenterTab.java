package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionPanels.OptionPanel;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionPanels.SortPanel;

@SuppressWarnings("serial")
public class CenterTab extends JTabbedPane {
	private MainFrame frame;
	
	private JPanel searchMainPanel;
	private JPanel favoritePanel;
	
	private OptionPanel centerPanel;
	
// 생성자
	public CenterTab(MainFrame frame) {
		this.frame = frame;
		initTab();
	}
	
// 텝 초기화
	private void initTab() {
	// 부분 Panel 초기화
		initPanels();		
		
	// 검색 패널 초기화
		this.searchMainPanel = new JPanel();
		this.addTab("무기검색", null, this.searchMainPanel, "무기검색");
		
		this.searchMainPanel.add(this.centerPanel);
		
	// 즐겨찾기 패널 초기화
		this.favoritePanel= new JPanel();
		this.addTab("데이터 입력", null, this.favoritePanel, "무기 데이터 추가");
	}
	

	

// 부분 Panel 초기화
	private void initPanels() {
		centerPanel = new SortPanel(this.frame);
	}
	
	
	
	
	

}
