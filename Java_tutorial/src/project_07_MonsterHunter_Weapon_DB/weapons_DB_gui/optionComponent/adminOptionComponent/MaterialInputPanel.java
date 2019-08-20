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

	private JTextField materialText;
	
	
// 생성자
	public MaterialInputPanel(MainFrame frame) {
		super.initItsPanel("재료", frame.getSize_x() - 15, 60);
		initPanels();
	}
	
	
// Panel 초기화
	private void initPanels() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = e.getActionCommand();
				System.out.println(selectedOption);
			}
		};
		
		JPanel outerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		outerPanel.setBackground(Color.WHITE);
		
		JLabel materialLabel = new JLabel("재료");
		outerPanel.add(materialLabel);
		
		this.materialText = new JTextField(35);
		materialText.addActionListener(listener);
		outerPanel.add(materialText);
		
		this.add(outerPanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
	
	@Override
	public void clearInputedData() {
		this.materialText.setText("");
	}
}
