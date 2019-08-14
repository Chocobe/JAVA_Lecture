package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class MaterialInputPanel extends OptionPanel {
	private String selectedOption;
	
	public MaterialInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "재료", 60);
		initPanels();
	}
	
	private void initPanels() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = e.getActionCommand();
				System.out.println(selectedOption);
			}
		};
		
		JPanel outerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		outerPanel.setBackground(Color.WHITE);
		
		JLabel materialLabel = new JLabel("재료");
		outerPanel.add(materialLabel);
		
		JTextField materialText = new JTextField(36);
		materialText.addActionListener(listener);
		outerPanel.add(materialText);
		
		this.add(outerPanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
