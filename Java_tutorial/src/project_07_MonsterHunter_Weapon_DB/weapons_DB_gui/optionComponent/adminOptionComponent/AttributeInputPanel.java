package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class AttributeInputPanel extends OptionPanel{
	private String selectedOption;
	
	private JComboBox<String> attributeComboBox;
	private JTextField valueText;
	
	public AttributeInputPanel(MainFrame frame) {
		super.initItsPanel("속성", frame.getSize_x() - 15, 60);
		
		this.setLayout(new BorderLayout());		
		this.initPanel();
	}
	
	
	private void initPanel() {
		ItemListener itemListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() == ItemEvent.SELECTED) {					
					if(e.getItem().equals("무속성")) {
						valueText.setText("0");
						valueText.setEnabled(false);
						
					} else {
						valueText.setEnabled(true);
					}
					
					selectedOption = (String)e.getItem() + " " + valueText.getText();
					System.out.println(selectedOption);
				}
			}
		};
		
		
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = attributeComboBox.getSelectedItem() + ", " +e.getActionCommand();
				System.out.println(selectedOption);
			}
		};
		
		
		String[] range = { "무속성", "화속성", "수속성", "뇌속성", "빙속성",
						   "용속성", "마비속성", "수면속성", "독속성", "폭파속성" };
		
		
		JPanel outerPanel = new JPanel(new GridLayout(1, 0, 10, 5));
		outerPanel.setBackground(Color.WHITE);
		
		
	// 속성종류
		JPanel sortPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sortPanel.setBackground(Color.WHITE);
		
		JLabel attributeLabel = new JLabel("속성");
		sortPanel.add(attributeLabel);
		
		attributeComboBox = new JComboBox<String>(range);
		attributeComboBox.setMaximumRowCount(5);
		attributeComboBox.setSelectedIndex(0);
		attributeComboBox.addItemListener(itemListener);
		sortPanel.add(attributeComboBox);
		
		outerPanel.add(sortPanel);
		
		this.selectedOption = attributeComboBox.getItemAt(0);
		
	// 속성수치
		JPanel valuePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		valuePanel.setBackground(Color.WHITE);
		
		JLabel valueLabel = new JLabel("속성값");
		valueLabel.setBackground(Color.WHITE);
		valuePanel.add(valueLabel);
		
		valueText = new JTextField(5);
		valueText.addActionListener(actionListener);
		valueText.setText("0");
		valueText.setEnabled(false);
		valuePanel.add(valueText);
		
		outerPanel.add(valuePanel);
		
		this.add(outerPanel);		
	}
	
	
	@Override 
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
