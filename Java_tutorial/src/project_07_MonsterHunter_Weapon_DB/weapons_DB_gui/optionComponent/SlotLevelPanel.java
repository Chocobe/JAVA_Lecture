package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class SlotLevelPanel extends OptionPanel {
	
	private String selectedOption;
	
	private WeaponsDTO weaponsDTO;
	
	public SlotLevelPanel(MainFrame frame, WeaponsDTO dto) {
		super.initItsPanel(frame, "슬롯레벨", frame.getSize_x(), 60);
		this.weaponsDTO = dto;
		this.initPanel();
	}
	
	
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = e.getActionCommand();
				System.out.println("Slot Level : " + selectedOption);
			}
		};
		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton all = new JRadioButton("전체");
		all.setBackground(Color.WHITE);
		all.setSelected(true);
		all.addActionListener(listener);
		group.add(all);
		this.add(all);
		
		JRadioButton lv_1 = new JRadioButton("Lv 1");
		lv_1.setBackground(Color.WHITE);
		lv_1.addActionListener(listener);
		group.add(lv_1);
		this.add(lv_1);
		
		JRadioButton lv_2 = new JRadioButton("Lv 2");
		lv_2.setBackground(Color.WHITE);
		lv_2.addActionListener(listener);
		group.add(lv_2);
		this.add(lv_2);
		
		JRadioButton lv_3 = new JRadioButton("Lv 3");
		lv_3.setBackground(Color.WHITE);
		lv_3.addActionListener(listener);
		group.add(lv_3);
		this.add(lv_3);
	}
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
