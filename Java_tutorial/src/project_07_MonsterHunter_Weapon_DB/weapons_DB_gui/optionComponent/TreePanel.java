package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class TreePanel extends OptionPanel {
	private final String CATEGORY = "TREE = ";
	private String selectedOption = "'전체'";
	
	
// 생성자
	public TreePanel(MainFrame frame) {
		super.initItsPanel("트리", frame.getSize_x() - 16, 60);
		this.initPanel();
	}
	
	
// Panel 초기화
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = "'" + e.getActionCommand() + "'";
				System.out.println("TreePanel : " + selectedOption);
			}
		};
		
	// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
	// 전체 버튼
		JRadioButton all = new JRadioButton("전체");
		all.setBackground(Color.WHITE);
		all.setSelected(true);
		all.addActionListener(listener);
		group.add(all);
		this.add(all);
		
	// 일반 버튼
		JRadioButton finalTree = new JRadioButton("일반");
		finalTree.setBackground(Color.WHITE);
		finalTree.addActionListener(listener);
		group.add(finalTree);
		this.add(finalTree);
		
	// 맘타로트 버튼
		JRadioButton normalMamta = new JRadioButton("맘타로트");
		normalMamta.setBackground(Color.WHITE);
		normalMamta.addActionListener(listener);
		group.add(normalMamta);
		this.add(normalMamta);
		
	// 역전 맘타로트 버튼
		JRadioButton overPowerMamta = new JRadioButton("역전 맘타로트");
		overPowerMamta.setBackground(Color.WHITE);
		overPowerMamta.addActionListener(listener);
		group.add(overPowerMamta);
		this.add(overPowerMamta);
	}
	
	
	@Override
	public String getSelectedOption() {
		if(selectedOption.equals("'전체'")) {
			return "";
		}
		
		return this.CATEGORY + this.selectedOption;
	}
	
	
	@Override
	public void clearInputedData() { }
}
