package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class SharpnessInputPanel extends OptionPanel {
	private String selectedOption;
	
	private JTextField sharpness_1Text;
	private JTextField sharpness_2Text;
	private JTextField sharpness_3Text;
	private JTextField sharpness_4Text;
	private JTextField sharpness_5Text;
	private JTextField sharpness_6Text;
	
	
	public SharpnessInputPanel(MainFrame frame) {
		super.initItsPanel(frame, "예리도", 95);
		this.initPanel();
	}
	
	
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(sharpness_1Text.getText().equals("") ||
								sharpness_1Text.getText().equals("0")) {
					sharpness_2Text.setText("");
					sharpness_2Text.setEnabled(false);
					
					
					
				} else {
					sharpness_2Text.setEnabled(true);
				}// end if~else
				
				selectedOption = sharpness_1Text.getText();
				
				if(sharpness_2Text.getText().equals("") ||
								sharpness_2Text.getText().equals("0")) {
					sharpness_3Text.setText("");
					sharpness_3Text.setEnabled(false);
					
				} else {
					sharpness_3Text.setEnabled(true);
					
					selectedOption += " " + sharpness_2Text.getText();
				}// end if~else
				
				if(sharpness_3Text.getText().equals("") ||
								sharpness_3Text.getText().equals("0")) {
					sharpness_4Text.setText("");
					sharpness_4Text.setEnabled(false);
					
				} else {
					sharpness_4Text.setEnabled(true);
					
					selectedOption += " " + sharpness_3Text.getText();
				}// end if~else
				
				if(sharpness_4Text.getText().equals("") ||
								sharpness_4Text.getText().equals("0")) {
					sharpness_5Text.setText("");
					sharpness_5Text.setEnabled(false);
					
				} else {
					sharpness_5Text.setEnabled(true);
					
					selectedOption += " " + sharpness_4Text.getText();
				}// end if~else
				
				if(sharpness_5Text.getText().equals("") ||
								sharpness_5Text.getText().equals("0")) {
					sharpness_6Text.setText("");
					sharpness_6Text.setEnabled(false);
					
				} else {
					sharpness_6Text.setEnabled(true);
					
					selectedOption += " " + sharpness_5Text.getText();
				}
				
				if(!sharpness_6Text.getText().equals("") ||
								sharpness_6Text.getText().equals("0")) {
					selectedOption += " " + sharpness_6Text.getText();
				}
//				
				System.out.println("예리도 : " + selectedOption);
			}
		};
		
		JPanel outerPanel = new JPanel(new GridLayout(2, 3, 10, 5));
		outerPanel.setBackground(Color.WHITE);
		
	// sharpness_1
		JPanel sharpness_1Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_1Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_1Label = new JLabel("예리도 1");
		sharpness_1Panel.add(sharpness_1Label);
		
		this.sharpness_1Text = new JTextField(5);
		this.sharpness_1Text.addActionListener(listener);
		sharpness_1Panel.add(this.sharpness_1Text);
		this.add(sharpness_1Panel);
		
	// sharpness_2
		JPanel sharpness_2Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_2Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_2Label = new JLabel("예리도 2");
		sharpness_2Panel.add(sharpness_2Label);
		
		this.sharpness_2Text = new JTextField(5);
		this.sharpness_2Text.addActionListener(listener);
		this.sharpness_2Text.setEnabled(false);
		sharpness_2Panel.add(this.sharpness_2Text);
		this.add(sharpness_2Panel);
		
	// sharpness_3
		JPanel sharpness_3Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_3Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_3Label = new JLabel("예리도 3");
		sharpness_3Panel.add(sharpness_3Label);
		
		this.sharpness_3Text = new JTextField(5);
		this.sharpness_3Text.addActionListener(listener);
		this.sharpness_3Text.setEnabled(false);
		sharpness_3Panel.add(this.sharpness_3Text);
		this.add(sharpness_3Panel);
		
	// sharpness_4
		JPanel sharpness_4Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_4Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_4Label = new JLabel("예리도 4");
		sharpness_4Panel.add(sharpness_4Label);
		
		this.sharpness_4Text = new JTextField(5);
		this.sharpness_4Text.addActionListener(listener);
		this.sharpness_4Text.setEnabled(false);
		sharpness_4Panel.add(this.sharpness_4Text);
		this.add(sharpness_4Panel);
		
	// sharpness_5
		JPanel sharpness_5Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_5Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_5Label = new JLabel("예리도 5");
		sharpness_5Panel.add(sharpness_5Label);
		
		this.sharpness_5Text = new JTextField(5);
		this.sharpness_5Text.addActionListener(listener);
		this.sharpness_5Text.setEnabled(false);
		sharpness_5Panel.add(this.sharpness_5Text);
		this.add(sharpness_5Panel);
		
	// sharpness_6
		JPanel sharpness_6Panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		sharpness_6Panel.setBackground(Color.WHITE);
		
		JLabel sharpness_6Label = new JLabel("예리도 6");
		sharpness_6Panel.add(sharpness_6Label);
		
		this.sharpness_6Text = new JTextField(5);
		this.sharpness_6Text.addActionListener(listener);
		this.sharpness_6Text.setEnabled(false);
		sharpness_6Panel.add(this.sharpness_6Text);
		this.add(sharpness_6Panel);				
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.selectedOption;
	}
}
