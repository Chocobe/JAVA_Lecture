package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

public class BaseInputPanel extends OptionPanel {
	private String selectedOption;
	
	public BaseInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "기본스펙", 55);
		initPanel();
	}
	
	
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = e.getActionCommand();
				System.out.println("기본스펙 입력값 : " + selectedOption);
			}
		};
		
		JPanel sortPanel = new JPanel();	
		sortPanel.setBackground(Color.WHITE);
		
		JLabel sortLabel = new JLabel("무기종류");
		sortLabel.setPreferredSize(new Dimension(72, 15));
		sortPanel.add(sortLabel);
		
		JTextField sortText = new JTextField(34);
		sortPanel.add(sortText);
		
		this.add(sortPanel);
		
		JPanel others = new JPanel();
		others.setBackground(Color.WHITE);
		
		JPanel damagePanel = new JPanel();
		damagePanel.setBackground(Color.WHITE);
		
		JLabel damageLabel = new JLabel("데미지");
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
