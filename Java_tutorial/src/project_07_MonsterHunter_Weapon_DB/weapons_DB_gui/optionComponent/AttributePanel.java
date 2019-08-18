package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class AttributePanel extends OptionPanel {
	private final String CATEGORY = "ATTRIBUTE = ";
	private String selectedOption = "'전체'";
	
	public AttributePanel(MainFrame frame) {
		super.initItsPanel("속성", frame.getSize_x() - 18, 80);
		initPanel();
	}
	
	public void initPanel() {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = "'" + e.getActionCommand() + "'";
				
				System.out.println("Attribute Category : " + selectedOption);
			}
		};
		
	// 그룹
		ButtonGroup group = new ButtonGroup();
		
	// 버튼 생성
		JRadioButton all = new JRadioButton("전체");
		all.setBackground(Color.WHITE);
		all.addActionListener(listener);
		all.setSelected(true);
		group.add(all);
		this.add(all);
		
		JRadioButton none = new JRadioButton("무속성");
		none.setBackground(Color.WHITE);
		none.addActionListener(listener);
		group.add(none);
		this.add(none);
		
		JRadioButton fire = new JRadioButton("화속성");
		fire.setBackground(Color.WHITE);
		fire.addActionListener(listener);
		group.add(fire);
		this.add(fire);
		
		JRadioButton water = new JRadioButton("수속성");
		water.setBackground(Color.WHITE);
		water.addActionListener(listener);
		group.add(water);
		this.add(water);
		
		JRadioButton thunder = new JRadioButton("뇌속성");
		thunder.setBackground(Color.WHITE);
		thunder.addActionListener(listener);
		group.add(thunder);
		this.add(thunder);
		
		JRadioButton ice = new JRadioButton("빙속성");
		ice.setBackground(Color.WHITE);
		ice.addActionListener(listener);
		group.add(ice);
		this.add(ice);
		
		JRadioButton dragon = new JRadioButton("용속성");
		dragon.setBackground(Color.WHITE);
		dragon.addActionListener(listener);
		group.add(dragon);
		this.add(dragon);
		
		JRadioButton paralysis = new JRadioButton("마비속성");
		paralysis.setBackground(Color.WHITE);
		paralysis.addActionListener(listener);
		group.add(paralysis);
		this.add(paralysis);
		
		JRadioButton sleep = new JRadioButton("수면속성");
		sleep.setBackground(Color.WHITE);
		sleep.addActionListener(listener);
		group.add(sleep);
		this.add(sleep);
		
		JRadioButton poison = new JRadioButton("독속성");
		poison.setBackground(Color.WHITE);
		poison.addActionListener(listener);
		group.add(poison);
		this.add(poison);
		
		JRadioButton explosion = new JRadioButton("폭파속성");
		explosion.setBackground(Color.WHITE);
		explosion.addActionListener(listener);
		group.add(explosion);
		this.add(explosion);
	}
	
	public String getSelectedOption() {
		if(selectedOption.equals("'전체'")) {
			return "";
		}
		
		return this.CATEGORY + selectedOption;
	}
}
