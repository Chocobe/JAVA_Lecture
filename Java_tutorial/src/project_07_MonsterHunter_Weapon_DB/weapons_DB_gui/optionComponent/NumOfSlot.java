package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class NumOfSlot extends OptionPanel {
	private final String CATEGORY = "NUM_OF_SLOT = ";
	private String selectedOption = "전체";
	
	
// 초기화
	public NumOfSlot(MainFrame frame) {
		super.initItsPanel("슬롯 수", frame.getSize_x() - 18, 60);
		initPanel();
	}
	
	
// Panel 초기화
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = e.getActionCommand();		
				System.out.println("NumOfSlot : " + selectedOption);
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
		
		JRadioButton num_1 = new JRadioButton("1 개");
		num_1.setBackground(Color.WHITE);
		num_1.addActionListener(listener);
		group.add(num_1);
		this.add(num_1);
		
		JRadioButton num_2 = new JRadioButton("2 개");
		num_2.setBackground(Color.WHITE);
		num_2.addActionListener(listener);
		group.add(num_2);
		this.add(num_2);
		
		JRadioButton num_3 = new JRadioButton("3 개");
		num_3.setBackground(Color.WHITE);
		num_3.addActionListener(listener);
		group.add(num_3);
		this.add(num_3);		
	}
	
	
	@Override
	public String getSelectedOption() {
		if(selectedOption.equals("전체")) {
			return "";
		}
		
		if(selectedOption.equals("1 개")) {
			return this.CATEGORY + "1";
			
		} else if(selectedOption.equals("2 개")) {
			return this.CATEGORY + "2";
			
		} else {
			return this.CATEGORY + "3";
		}
	}
	
	
	@Override
	public void clearInputedData() { }
}
