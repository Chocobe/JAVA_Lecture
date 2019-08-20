package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weaponsDAO.WeaponsDAO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent.AdminTableDialog;

@SuppressWarnings("serial")
public class SortPanel extends OptionPanel {	
	private final String CARTEGORY = "SORT = ";
	private String selectedOption = "'대검'";
	
	private JRadioButton bigSword;
	JRadioButton longSword;
	JRadioButton onehandSword;
	JRadioButton doubleSword;
	JRadioButton hammer;
	JRadioButton pipe;
	JRadioButton lance;
	JRadioButton gunLance;
	JRadioButton slashAxe;
	JRadioButton chargeAxe;
	JRadioButton bugStick;
	JRadioButton lightBowgun;
	JRadioButton heavyBowgun;
	JRadioButton bow;	
	
	private ActionListener listener;
	
	private WeaponsDAO dao;
	private AdminTableDialog adminDialog;
	
	
// 생성자 Overloading_1
	public SortPanel(MainFrame frame) {
		super.initItsPanel("무기", frame.getSize_x() - 18, 110);
		this.initActionListener();
		this.initPanel();
	}
	
	
// 생성자 Overloading_2
	public SortPanel(AdminTableDialog dialog) {
		super.initItsPanel("Category", 
						(int)dialog.getSize().getWidth(), 110);
		this.adminDialog = dialog;
		this.dao = new WeaponsDAO(this);
		this.initAutoSearchActionListener();
		this.initPanel();
	}
	
	
// ActionListener 초기화 (생성자의 인자값으로 Frame입력 시 호출)
	private void initActionListener() {
		this.listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectedOption = "'" + e.getActionCommand() + "'";
				System.out.println("Sort Category : " + selectedOption);
			}
		};
	}
	
// 자동검색 ActionListener 초기화 (생성자의 인자값으로 Dialog입력 시 호출)
	private void initAutoSearchActionListener() {		
		this.listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<WeaponsDTO> list = new ArrayList<WeaponsDTO>();
				DefaultTableModel model = new DefaultTableModel();
				
				String sql = "SELECT * FROM WEAPONS WHERE SORT = " +
							 "'" + e.getActionCommand() + "'";
				System.out.println(sql);
				list = dao.selectData(sql);
				
				String[][] resultData = 
								new String[list.size()]
										  [adminDialog.getTupleName().length];
				
				for(int i = 0; i < list.size(); i++) {
					resultData[i][0] = list.get(i).getSort();
					resultData[i][1] = list.get(i).getName();
					resultData[i][2] = 
									String.valueOf(list.get(i).getDamage());
					resultData[i][3] = 
									String.valueOf(list.get(i).getCritical());
					resultData[i][4] = 
									String.valueOf(list.get(i).getNumOfSlot());
				}
				
				model.setDataVector(resultData, adminDialog.getTupleName());				
				
				adminDialog.setModel(model);
				adminDialog.setResultData(list);
			}
		};
	}
	
	
// 무기 카테고리 세부
	private void initPanel() {		
		// 라디오 버튼
		ButtonGroup group = new ButtonGroup();
		
	// 대검 버튼
		this.bigSword = new JRadioButton("대검");
		bigSword.setBackground(Color.WHITE);
		bigSword.setSelected(true);
		bigSword.addActionListener(listener);
		group.add(bigSword);
		this.add(bigSword);
		
	// 태도 버튼
		this.longSword = new JRadioButton("태도");
		longSword.setBackground(Color.WHITE);
		longSword.addActionListener(listener);
		group.add(longSword);
		this.add(longSword);
		
	// 한손검 버튼
		this.onehandSword = new JRadioButton("한손검");
		onehandSword.setBackground(Color.WHITE);
		onehandSword.addActionListener(listener);
		group.add(onehandSword);
		this.add(onehandSword);
		
	// 쌍검 버튼
		this.doubleSword = new JRadioButton("쌍검");
		doubleSword.setBackground(Color.WHITE);
		doubleSword.addActionListener(listener);
		group.add(doubleSword);
		this.add(doubleSword);
		
	// 헤머 버튼
		this.hammer = new JRadioButton("헤머");
		hammer.setBackground(Color.WHITE);
		hammer.addActionListener(listener);
		group.add(hammer);
		this.add(hammer);
		
	// 수렵피리 버튼
		this.pipe = new JRadioButton("수렵피리");
		pipe.setBackground(Color.WHITE);
		pipe.addActionListener(listener);
		group.add(pipe);
		this.add(pipe);
		
	// 랜스 버튼
		this.lance = new JRadioButton("랜스");
		lance.setBackground(Color.WHITE);
		lance.addActionListener(listener);
		group.add(lance);
		this.add(lance);
		
	// 건랜스 버튼
		this.gunLance = new JRadioButton("건랜스");
		gunLance.setBackground(Color.WHITE);
		gunLance.addActionListener(listener);
		group.add(gunLance);
		this.add(gunLance);
		
	// 슬래시액스 버튼
		this.slashAxe = new JRadioButton("슬래시액스");
		slashAxe.setBackground(Color.WHITE);
		slashAxe.addActionListener(listener);
		group.add(slashAxe);
		this.add(slashAxe);
		
	// 차지액스 버튼
		this.chargeAxe = new JRadioButton("차지액스");
		chargeAxe.setBackground(Color.WHITE);
		chargeAxe.addActionListener(listener);
		group.add(chargeAxe);
		this.add(chargeAxe);
		
	// 조충곤 버튼
		this.bugStick = new JRadioButton("조충곤");
		bugStick.setBackground(Color.WHITE);
		bugStick.addActionListener(listener);
		group.add(bugStick);
		this.add(bugStick);
		
	// 라이트 보우건 버튼
		this.lightBowgun = new JRadioButton("라이트 보우건");
		lightBowgun.setBackground(Color.WHITE);
		lightBowgun.addActionListener(listener);
		group.add(lightBowgun);
		this.add(lightBowgun);
		
	// 헤비 보우건 버튼
		this.heavyBowgun = new JRadioButton("헤비 보우건");
		heavyBowgun.setBackground(Color.WHITE);
		heavyBowgun.addActionListener(listener);
		group.add(heavyBowgun);
		this.add(heavyBowgun);
		
	// 활 버튼
		this.bow = new JRadioButton("활");
		bow.setBackground(Color.WHITE);
		bow.addActionListener(listener);
		group.add(bow);
		this.add(bow);
	}
	
	
	@Override
	public String getSelectedOption() {
		return this.CARTEGORY + this.selectedOption;
	}
	
	
	@Override
	public void clearInputedData() { }
}
