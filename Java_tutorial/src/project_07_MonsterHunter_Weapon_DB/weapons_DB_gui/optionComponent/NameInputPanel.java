package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class NameInputPanel extends OptionPanel {
	private String name;	
	
	public NameInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "무기명", 60);
		this.initPanel();
	}
	
	
	public void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String weaponsName = e.getActionCommand();
				System.out.println("무기명 : " + weaponsName);
				
				//
				// DAO Insert 호출
				//
			}
		};
		
		JLabel nameLabel = new JLabel("무기명");
		this.add(nameLabel);
		
		JTextField nameField = new JTextField(20);
		nameField.addActionListener(listener);
		this.add(nameField);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.name;
	}
}
