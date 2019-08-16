package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionGroupPanel;

@SuppressWarnings("serial")
public class CenterTab extends JTabbedPane {
	private MainFrame frame;
	
	private OptionGroupPanel searchMainPanel;
	private JPanel favoritePanel;
	
// 생성자
	public CenterTab(MainFrame frame) {
		this.frame = frame;
		initTab();
	}
	
// 텝 초기화
	private void initTab() {
		
	// 검색 패널 초기화
		this.searchMainPanel = new OptionGroupPanel(this.frame);
		this.addTab("무기검색", null, this.searchMainPanel, "무기검색");
		
		
	// 즐겨찾기 패널 초기화
		// 즐겨찾기 테이블 검색 결과만 출력할것
		this.favoritePanel= new JPanel();
		this.addTab("즐겨찾기", null, this.favoritePanel, "즐겨찾기");	
		
		this.setPreferredSize(new Dimension(frame.getSize_x() - 200, 460));
	}

}
