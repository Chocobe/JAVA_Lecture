package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class SortPanel extends OptionPanel {
	private final String CARTEGORY = "SORT = ";
	private String selectedOption = "'대검'";
	
	public SortPanel(MainFrame frame) {
		super.initItsPanel("무기", frame.getSize_x() - 18, 110);
		initPanel();
	}
	
	
// 무기 카테고리 세부
	private void initPanel() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedOption = "'" + e.getActionCommand() + "'";
				System.out.println("Sort Category : " + selectedOption);
				//
				// "검색"버튼 하나만 이벤트 걸고, 각 항목의 command값 저장
				//
			}
		};

		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton bigSword = new JRadioButton("대검");
		bigSword.setBackground(Color.WHITE);
		bigSword.setSelected(true);
		bigSword.addActionListener(listener);
		group.add(bigSword);
		this.add(bigSword);
		
		JRadioButton longSword = new JRadioButton("태도");
		longSword.setBackground(Color.WHITE);
		longSword.addActionListener(listener);
		group.add(longSword);
		this.add(longSword);
		
		JRadioButton onehandSword = new JRadioButton("한손검");
		onehandSword.setBackground(Color.WHITE);
		onehandSword.addActionListener(listener);
		group.add(onehandSword);
		this.add(onehandSword);
		
		JRadioButton doubleSword = new JRadioButton("쌍검");
		doubleSword.setBackground(Color.WHITE);
		doubleSword.addActionListener(listener);
		group.add(doubleSword);
		this.add(doubleSword);
		
		JRadioButton hammer = new JRadioButton("헤머");
		hammer.setBackground(Color.WHITE);
		hammer.addActionListener(listener);
		group.add(hammer);
		this.add(hammer);
		
		JRadioButton pipe = new JRadioButton("수렵피리");
		pipe.setBackground(Color.WHITE);
		pipe.addActionListener(listener);
		group.add(pipe);
		this.add(pipe);
		
		JRadioButton lance = new JRadioButton("랜스");
		lance.setBackground(Color.WHITE);
		lance.addActionListener(listener);
		group.add(lance);
		this.add(lance);
		
		JRadioButton gunLance = new JRadioButton("건랜스");
		gunLance.setBackground(Color.WHITE);
		gunLance.addActionListener(listener);
		group.add(gunLance);
		this.add(gunLance);
		
		JRadioButton slashAxe = new JRadioButton("슬래시액시");
		slashAxe.setBackground(Color.WHITE);
		slashAxe.addActionListener(listener);
		group.add(slashAxe);
		this.add(slashAxe);
		
		JRadioButton chargeAxe = new JRadioButton("차지액스");
		chargeAxe.setBackground(Color.WHITE);
		chargeAxe.addActionListener(listener);
		group.add(chargeAxe);
		this.add(chargeAxe);
		
		JRadioButton bugStick = new JRadioButton("조충곤");
		bugStick.setBackground(Color.WHITE);
		bugStick.addActionListener(listener);
		group.add(bugStick);
		this.add(bugStick);
		
		JRadioButton lightBowgun = new JRadioButton("라이트 보우건");
		lightBowgun.setBackground(Color.WHITE);
		lightBowgun.addActionListener(listener);
		group.add(lightBowgun);
		this.add(lightBowgun);
		
		JRadioButton heavyBowgun = new JRadioButton("헤비 보우건");
		heavyBowgun.setBackground(Color.WHITE);
		heavyBowgun.addActionListener(listener);
		group.add(heavyBowgun);
		this.add(heavyBowgun);
		
		JRadioButton bow = new JRadioButton("활");
		bow.setBackground(Color.WHITE);
		bow.addActionListener(listener);
		group.add(bow);
		this.add(bow);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.CARTEGORY + this.selectedOption;
	}
}
