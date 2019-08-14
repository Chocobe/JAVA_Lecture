package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class BaseInputPanel extends OptionPanel {
	private String selectedOption;
	
	
	public BaseInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "기본스펙", frame.getSize_x() - 15, 110);
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
		
	// 무기종류
		JPanel sortPanel = new JPanel();	
		sortPanel.setBackground(Color.WHITE);
		
		JLabel sortLabel = new JLabel("무기종류");
		sortLabel.setPreferredSize(new Dimension(55, 15));
		sortPanel.add(sortLabel);
		
		JTextField sortText = new JTextField(34);
		sortText.addActionListener(listener);
		sortPanel.add(sortText);
		this.add(sortPanel);
		
		JPanel others = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
		others.setBackground(Color.WHITE);
		this.add(others);
		
	// 공격력
		JPanel damagePanel = new JPanel();
		damagePanel.setBackground(Color.WHITE);
		
		JLabel damageLabel = new JLabel("공격력");
		damageLabel.setBackground(Color.WHITE);
		others.add(damageLabel);
		
		JTextField damageText = new JTextField(5);
		damageText.addActionListener(listener);
		damagePanel.add(damageText);
		others.add(damagePanel);
		
	// 치명률
		JPanel criticalPanel = new JPanel();
		criticalPanel.setBackground(Color.WHITE);
		
		JLabel criticalLabel = new JLabel("치명률");
		criticalLabel.setBackground(Color.WHITE);
		criticalPanel.add(criticalLabel);
		
		JTextField criticalText = new JTextField(5);
		criticalText.addActionListener(listener);
		criticalPanel.add(criticalText);
		others.add(criticalPanel);
		
	// 등급
		JPanel gradePanel = new JPanel();
		gradePanel.setBackground(Color.WHITE);
		
		JLabel gradeLabel = new JLabel("등급");
		gradeLabel.setBackground(Color.WHITE);
		gradePanel.add(gradeLabel);
		
		JTextField gradeText = new JTextField(5);
		gradeText.addActionListener(listener);
		gradePanel.add(gradeText);
		others.add(gradePanel);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
