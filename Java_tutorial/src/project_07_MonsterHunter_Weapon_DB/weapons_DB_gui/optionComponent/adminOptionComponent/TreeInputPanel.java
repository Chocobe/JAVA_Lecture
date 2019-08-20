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
public class TreeInputPanel extends OptionPanel {
	private String selectedOption;
	
	private JTextField treeNameText;
	private JTextField treePositionText;
	
	
// 생성자
	public TreeInputPanel(MainFrame frame) {
		super.initItsPanel("트리", frame.getSize_x() - 15,  60);
		this.initPanel();
	}
	
	
// Panel 초기화
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = treeNameText.getText() + ", " + treePositionText.getText();
				System.out.println(selectedOption);
			}
		};
		
	// treeNameText
		JPanel treeNamePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		treeNamePanel.setBackground(Color.WHITE);
		
		JLabel treeNameLabel = new JLabel("트리");
		treeNamePanel.add(treeNameLabel);
		
		this.treeNameText = new JTextField(15);
		this.treeNameText.addActionListener(listener);
		treeNamePanel.add(this.treeNameText);
		this.add(treeNamePanel);
		
	// treePositionText
		JPanel treePositionPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		treePositionPanel.setBackground(Color.WHITE);
		
		JLabel treePositionLabel = new JLabel("트리위치");
		treePositionPanel.add(treePositionLabel);
		
		this.treePositionText = new JTextField(5);
		this.treePositionText.addActionListener(listener);
		treePositionPanel.add(treePositionText);
		this.add(treePositionPanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
	
	
	@Override
	public void clearInputedData() { 
		this.treeNameText.setText("");
		this.treePositionText.setText("");
	}
}
