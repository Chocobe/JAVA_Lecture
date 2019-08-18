package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weaponsDAO.WeaponsDAO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.SystemDialog;

@SuppressWarnings("serial")
public class DataInsertPanel extends JPanel {
	private MainFrame frame;
	private AdminOptionGroupPanel adminPanel;
	private WeaponsDAO dao;
	private SystemDialog systemDialog;
	
	private JButton insertButton;
	
	public DataInsertPanel(MainFrame frame, AdminOptionGroupPanel adminPanel, SystemDialog systemDialog) {
		this.frame = frame;
		this.adminPanel = adminPanel;
		this.dao = new WeaponsDAO(frame);
		this.systemDialog = systemDialog;
		
		initPanel();
		initButton();
	}
	
	private void initPanel() {
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
		this.setBorder(border);
		
		this.setPreferredSize(new Dimension(this.frame.getSize_x() - 38, 40));
		this.setBackground(Color.WHITE);
	}
	
	private void initButton() {
		this.insertButton = new JButton("추가");
		
		this.insertButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				WeaponsDTO tempDTO = new WeaponsDTO();
				
				System.out.println("\n--- Data Input 테스트 ---");
				
			// 이름
				String name = adminPanel.getNamePanel().getSelectedOption();
				tempDTO.setName(name);
				System.out.println("이름 입력값 : " + name);
				
			// 무기
				String sort = adminPanel.getBasePanel().getSortOption();
				tempDTO.setSort(sort);
				System.out.println("무기 입력값 : " + sort);
				
			// 공격력
				String damage = adminPanel.getBasePanel().getDamageOption();
				tempDTO.setDamage(Integer.parseInt(damage));
				System.out.println("공격력 입력값 : " + damage);
				
			// 치명률
				String critical = adminPanel.getBasePanel().getCriticalOption();
				tempDTO.setCritical(Integer.parseInt(critical));
				System.out.println("치명률 입력값 : " + critical);
				
			// 등급
				String grade = adminPanel.getBasePanel().getGradeOption();
				tempDTO.setGrade(Integer.parseInt(grade));
				System.out.println("등급 입력값 : " + grade);
				
			// 속성
				String selectedAttribute = adminPanel.getAttributePanel().getSelectedOption();
				String attribute = "";
				String attribute_val = "";
				if(!selectedAttribute.equals("무속성")) {
					int optionBound = selectedAttribute.indexOf(",");
					attribute = selectedAttribute.substring(0, optionBound);
					attribute_val = selectedAttribute.substring(
									optionBound + 2, selectedAttribute.length());
					
				} else {
					attribute = selectedAttribute;
					attribute_val = "0";
				}
				
				tempDTO.setAttribute(attribute);
				tempDTO.setAttribute_val(Integer.parseInt(attribute_val));
				System.out.println("속성 입력값 : " + attribute + " (" + attribute_val + ")");				
				
			// 슬롯
				String slot = adminPanel.getSlotPanel().getSelectedOption();
				System.out.println("슬롯 널 체크 : " + slot);
				
				String slot_1 = slot.substring(0, 1);
				String slot_2 = slot.substring(1, 2);
				String slot_3 = slot.substring(2, 3);
				String numOfSlot = slot.substring(3, 4);
				tempDTO.setSlot_1(Integer.parseInt(slot_1));
				tempDTO.setSlot_2(Integer.parseInt(slot_2));
				tempDTO.setSlot_3(Integer.parseInt(slot_3));
				tempDTO.setNumOfSlot(Integer.parseInt(numOfSlot));
				System.out.println("slot_1 : " + slot_1 + ", slot_2 : " + slot_2 + ", slot_3 : " + slot_3 + ", numOfSlot : " + numOfSlot);				
				
			// 재료
				String material = adminPanel.getMaterialPanel().getSelectedOption();
				tempDTO.setMaterial(material);
				System.out.println("재료 : " + material);
				
			// 예리도
				String sharpness_1 = adminPanel.getSharpnessPanel().getSharpness_1();
				String sharpness_2 = adminPanel.getSharpnessPanel().getSharpness_2();
				String sharpness_3 = adminPanel.getSharpnessPanel().getSharpness_3();
				String sharpness_4 = adminPanel.getSharpnessPanel().getSharpness_4();
				String sharpness_5 = adminPanel.getSharpnessPanel().getSharpness_5();
				String sharpness_6 = adminPanel.getSharpnessPanel().getSharpness_6();
				tempDTO.setSharpness_1(Integer.parseInt(sharpness_1));				
				tempDTO.setSharpness_2(Integer.parseInt(sharpness_2));
				tempDTO.setSharpness_3(Integer.parseInt(sharpness_3));
				tempDTO.setSharpness_4(Integer.parseInt(sharpness_4));
				tempDTO.setSharpness_5(Integer.parseInt(sharpness_5));
				tempDTO.setSharpness_6(Integer.parseInt(sharpness_6));
				
				System.out.println("\t예리도_1 입력값 : " + sharpness_1);
				System.out.println("\t예리도_2 입력값 : " + sharpness_2);
				System.out.println("\t예리도_3 입력값 : " + sharpness_3);
				System.out.println("\t예리도_4 입력값 : " + sharpness_4);
				System.out.println("\t예리도_5 입력값 : " + sharpness_5);
				System.out.println("\t예리도_6 입력값 : " + sharpness_6);
				
			// 트리
				String tree = adminPanel.getTreePanel().getSelectedOption();
				
				if(!(tree == null)) {
					
					String treeName = "";
					String treePosition = "";
					int treeBound = tree.indexOf(",");
					
					treeName = tree.substring(0, treeBound);
					treePosition = tree.substring(treeBound + 2, tree.length());
					
					tempDTO.setTree(treeName);
					tempDTO.setTree_position(Integer.parseInt(treePosition));
					
					System.out.println("트리값 : " + treeName);
					System.out.println("트리 번호값 : " + treePosition);
					
				}
				
				dao.insertData(tempDTO);
				
				systemDialog.dispose();				
			}
		});
		
		this.add(this.insertButton);
	}
	
	public void initInputArea() {
		
	}
}
