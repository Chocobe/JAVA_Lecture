package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionPanels;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

public class TreePanel extends OptionPanel {
	
	private String selectedOption;
	
	public TreePanel(MainFrame frame) {
		super.initItsPanel(frame, "최종트리", 60);
		this.initPanel();
	}
	
	
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = e.getActionCommand();
				System.out.println("TreePanel : " + selectedOption);
			}
		};
		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton all = new JRadioButton("전체");
		all.setBackground(Color.WHITE);
		all.addActionListener(listener);
		group.add(all);
		this.add(all);
		
		JRadioButton finalTree = new JRadioButton("최종트리");
		finalTree.setBackground(Color.WHITE);
		finalTree.addActionListener(listener);
		group.add(finalTree);
		this.add(finalTree);
		
		JRadioButton normalMamta = new JRadioButton("일반 맘타");
		normalMamta.setBackground(Color.WHITE);
		normalMamta.addActionListener(listener);
		group.add(normalMamta);
		this.add(normalMamta);
		
		JRadioButton overPowerMamta = new JRadioButton("역전 맘타");
		overPowerMamta.setBackground(Color.WHITE);
		overPowerMamta.addActionListener(listener);
		group.add(overPowerMamta);
		this.add(overPowerMamta);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}








































