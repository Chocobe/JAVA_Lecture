package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class SlotInputPanel extends OptionPanel {
	private String selectedOption = "000";
	
	private JComboBox<String> slot_1ComboBox;
	private JComboBox<String> slot_2ComboBox;
	private JComboBox<String> slot_3ComboBox;
	
	public SlotInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "슬롯", 65);
		initPanel();
	}
	
	
	private void initPanel() {
		ItemListener listener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) {					
					if(slot_1ComboBox.getSelectedItem().equals("0")) {
						slot_2ComboBox.setSelectedIndex(0);
						slot_2ComboBox.setEnabled(false);
						
						slot_3ComboBox.setSelectedIndex(0);
						slot_3ComboBox.setEnabled(false);
						
					} else if(slot_2ComboBox.getSelectedItem().equals("0")) {
						slot_2ComboBox.setEnabled(true);
						
						slot_3ComboBox.setSelectedIndex(0);
						slot_3ComboBox.setEnabled(false);
						
					} else {
						slot_3ComboBox.setEnabled(true);
					}
					
					// 테스트 출력
					selectedOption = 
							(String)slot_1ComboBox.getSelectedItem() +
							(String)slot_2ComboBox.getSelectedItem() +
							(String)slot_3ComboBox.getSelectedItem();
					System.out.println("selectedOption : " + selectedOption);
				}
			}
		};
		
		JPanel outerPanel = new JPanel(new GridLayout(1, 3, 20, 10));
		outerPanel.setBackground(Color.WHITE);
		String[] range = {"0", "1", "2", "3"};
		
	// slot_1
		JPanel slot_1Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
		slot_1Panel.setBackground(Color.WHITE);
		
		JLabel slot_1Label = new JLabel("슬롯 1");
		slot_1Panel.add(slot_1Label);
		
		slot_1ComboBox = new JComboBox<String>(range);
		slot_1ComboBox.setMaximumRowCount(4);
		slot_1ComboBox.addItemListener(listener);
		slot_1Panel.add(slot_1ComboBox);
		outerPanel.add(slot_1Panel);
		
	// slot_2
		JPanel slot_2Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
		slot_2Panel.setBackground(Color.WHITE);
		
		JLabel slot_2Label = new JLabel("슬롯 2");
		slot_2Panel.add(slot_2Label);
		
		slot_2ComboBox = new JComboBox<String>(range);
		slot_2ComboBox.setMaximumRowCount(4);
		slot_2ComboBox.addItemListener(listener);
		slot_2ComboBox.setEnabled(false);
		slot_2Panel.add(slot_2ComboBox);
		outerPanel.add(slot_2Panel);
		
	// slot_3
		JPanel slot_3Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
		slot_3Panel.setBackground(Color.WHITE);
		
		JLabel slot_3Label = new JLabel("슬롯 3");
		slot_3Panel.add(slot_3Label);
		
		slot_3ComboBox = new JComboBox<String>(range);
		slot_3ComboBox.setMaximumRowCount(4);
		slot_3ComboBox.addItemListener(listener);
		slot_3ComboBox.setEnabled(false);
		slot_3Panel.add(slot_3ComboBox);
		outerPanel.add(slot_3Panel);
		
		this.add(outerPanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
