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
	
	private String sortOption;
	private String damageOption;
	private String criticalOption;
	private String gradeOption;
	
	private JTextField sortText;
	private JTextField damageText;
	private JTextField criticalText;
	private JTextField gradeText;
	
	
// 생성자
	public BaseInputPanel(MainFrame frame) {
		super.initItsPanel("기본스펙", frame.getSize_x() - 15, 110);
		initPanel();
	}
	
	
// Panel 초기화
	private void initPanel() {
	// sort Listener
		ActionListener sortListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sortOption = e.getActionCommand();
				selectedOption = sortOption + ", " +
								 damageOption + ", " +
								 criticalOption + ", " +
								 gradeOption;
				
				System.out.println("무기 입력값 : " + sortOption);
			}
		};
		
	// damage Listener
		ActionListener damageListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				damageOption = e.getActionCommand();
				selectedOption = sortOption + ", " +
						 damageOption + ", " +
						 criticalOption + ", " +
						 gradeOption;
				
				System.out.println("공격력 입력값 : " + damageOption);
			}
		};
		
	// critical Listener
		ActionListener criticalListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				criticalOption = e.getActionCommand();
				selectedOption = sortOption + ", " +
						 damageOption + ", " +
						 criticalOption + ", " +
						 gradeOption;
				
				System.out.println("치명률 입력값 : " + criticalOption);
			}
		};
		
	// grade Listener
		ActionListener gradeListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gradeOption = e.getActionCommand();
				selectedOption = sortOption + ", " +
						 damageOption + ", " +
						 criticalOption + ", " +
						 gradeOption;
				
				System.out.println("등급 입력값 : " + gradeOption);
			}
		};
		
		JPanel others = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 5));
		others.setBackground(Color.WHITE);
		this.add(others);
		
	// 무기종류
		JPanel sortPanel = new JPanel();	
		sortPanel.setBackground(Color.WHITE);
		
		JLabel sortLabel = new JLabel("무기종류");
		sortLabel.setPreferredSize(new Dimension(55, 15));
		sortPanel.add(sortLabel);
		
		this.sortText = new JTextField(34);
		sortText.addActionListener(sortListener);
		sortText.setText("대검");
		sortOption = "대검";
		sortPanel.add(sortText);
		this.add(sortPanel);
		
	// 공격력
		JPanel damagePanel = new JPanel();
		damagePanel.setBackground(Color.WHITE);
		
		JLabel damageLabel = new JLabel("공격력");
		damageLabel.setBackground(Color.WHITE);
		others.add(damageLabel);
		
		this.damageText = new JTextField(5);
		damageText.addActionListener(damageListener);
		damageText.setText("0");
		damageOption = "0";
		damagePanel.add(damageText);
		others.add(damagePanel);
		
	// 치명률
		JPanel criticalPanel = new JPanel();
		criticalPanel.setBackground(Color.WHITE);
		
		JLabel criticalLabel = new JLabel("치명률");
		criticalLabel.setBackground(Color.WHITE);
		criticalPanel.add(criticalLabel);
		
		this.criticalText = new JTextField(5);
		criticalText.addActionListener(criticalListener);
		criticalText.setText("0");
		criticalOption = "0";
		criticalPanel.add(criticalText);
		others.add(criticalPanel);
		
	// 등급
		JPanel gradePanel = new JPanel();
		gradePanel.setBackground(Color.WHITE);
		
		JLabel gradeLabel = new JLabel("등급");
		gradeLabel.setBackground(Color.WHITE);
		gradePanel.add(gradeLabel);
		
		this.gradeText = new JTextField(5);
		gradeText.addActionListener(gradeListener);
		gradeText.setText("0");
		gradeOption = "0";
		gradePanel.add(gradeText);
		others.add(gradePanel);
	}
	
	
// getter
	public String getSortOption() {
		return this.sortOption;
	}
	
	public String getDamageOption() {
		return this.damageOption;
	}
	
	public String getCriticalOption() {
		return this.criticalOption;
	}
	
	public String getGradeOption() {
		return this.gradeOption;
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
	
	
	@Override
	public void clearInputedData() {
		this.sortText.setText("대검");
		this.damageText.setText("0");
		this.criticalText.setText("0");
		this.gradeText.setText("0");
	}
}
