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

@SuppressWarnings("serial")
public class NameInputPanel extends OptionPanel {
	private String selectedOption;	

	private JTextField nameField;
	
	
// 생성자
	public NameInputPanel(MainFrame frame) {
		super.initItsPanel("무기명", frame.getSize_x() - 15, 55);
		this.initPanel();
	}
	
	
// Panel 초기화
	public void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = e.getActionCommand();
				System.out.println("무기명 : " + selectedOption);
			}
		};
		
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.WHITE);
		
		JLabel nameLabel = new JLabel("무기명");
		nameLabel.setPreferredSize(new Dimension(55, 15));
		namePanel.add(nameLabel);
		
		this.nameField = new JTextField(34);
		nameField.addActionListener(listener);
		namePanel.add(nameField);
		
		this.add(namePanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
	
	
	@Override
	public void clearInputedData() {
		this.nameField.setText("");
	}
}
