package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weaponsDAO.WeaponsDAO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class InfoDialog extends JDialog {
	private MainFrame frame;
	private WeaponsDAO dao;
	private WeaponsDTO dto;
	
	private int dialog_size_x;
	private int dialog_size_y;
	private int dialog_location_x;
	private int dialog_location_y;
	
	private String buttonName;
	
	public InfoDialog(MainFrame frame, String buttonName) {
		this.frame = frame;
		this.buttonName = buttonName;
		this.dao = new WeaponsDAO(frame);
		initDialog();
	}
	
	private void initDialog() {
		this.dialog_size_x = frame.getSize_x() - 200;
		this.dialog_size_y = 360;
		this.setSize(dialog_size_x, dialog_size_y);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		this.dialog_location_x = 
						(int)kit.getScreenSize().getWidth() / 2
						- (int)this.getSize().getWidth() / 2;
		this.dialog_location_y =
						(int)kit.getScreenSize().getHeight() / 2
						- (int)this.getSize().getHeight() / 2;
		this.setLocation(this.dialog_location_x, this.dialog_location_y);		
		
		this.setModal(true);		
	}
	
	
	public void showInfo(WeaponsDTO dto) {
		this.setTitle("세부정보(" + dto.getName() + ")");
		this.dto = dto;
		
	// 베이스 페널
		JPanel outerPanel = new JPanel();
		this.add(outerPanel);
		
	// 이름
		JPanel namePanel = new JPanel();
		namePanel.setBackground(Color.WHITE);
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
		namePanel.setBorder(border);
		namePanel.setPreferredSize(new Dimension(dialog_size_x - 20, 40));
		
		JLabel nameLabel = new JLabel("- " + dto.getName() + " -");
		namePanel.add(nameLabel);

		outerPanel.add(namePanel);
		
	// 세부정보 패널
		JPanel infoPanel = new JPanel();
		infoPanel.setBorder(border);
		infoPanel.setPreferredSize(new Dimension(dialog_size_x - 20, 270));
		infoPanel.setBackground(Color.WHITE);
		outerPanel.add(infoPanel);
		
	// 무기종류, 레어도
		JPanel sortPanel = new JPanel();
		sortPanel.setBackground(Color.WHITE);
		sortPanel.setPreferredSize(new Dimension(dialog_size_x - 38, 30));
		
		JLabel sortLabel = new JLabel(this.dto.getSort() + 
						" (레어도 : " + this.dto.getGrade() + ")");
		sortPanel.add(sortLabel);
		
		infoPanel.add(sortPanel);
		
	// 공격력
		JPanel damagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		damagePanel.setPreferredSize(new Dimension(dialog_size_x / 2 - 20, 20));
		
		JLabel damageLabel = new JLabel("공격력 : " + dto.getDamage());
		damagePanel.add(damageLabel);
		
		infoPanel.add(damagePanel);
		
	// 회심
		JPanel criticalPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		criticalPanel.setPreferredSize(new Dimension(dialog_size_x / 2 - 20, 20));
		
		JLabel criticalLabel = new JLabel("회심률 : " + this.dto.getCritical() + "%");
		criticalPanel.add(criticalLabel);
		
		infoPanel.add(criticalPanel);
		
	// 슬롯
		JPanel slotPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		slotPanel.setBackground(Color.WHITE);
		slotPanel.setPreferredSize(new Dimension(dialog_size_x - 38, 20));
		
		String slotData = "슬롯   :   ";
		if(dto.getSlot_1() == 0) {
			slotData += "- ";
			
		} else {
			slotData += String.valueOf(this.dto.getSlot_1()) + " ";
		}
		
		if(dto.getSlot_2() == 0) {
			slotData += "- ";
			
		} else {
			slotData += String.valueOf(this.dto.getSlot_2()) + " "; 
		}
		
		if(dto.getSlot_3() == 0) {
			slotData += "-";
			
		} else {
			slotData += String.valueOf(this.dto.getSlot_3());
		}
		
		JLabel slotLabel = new JLabel(slotData);
		slotPanel.add(slotLabel);
		
		infoPanel.add(slotPanel);
		
	// 속성
		JPanel attributePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		attributePanel.setPreferredSize(new Dimension(dialog_size_x - 40, 20));
		
		String attributeData = "속성 : " + this.dto.getAttribute() + 
						" (" + this.dto.getAttribute_val() + ")";
		JLabel attributeLabel = new JLabel(attributeData);
		attributePanel.add(attributeLabel);
		
		infoPanel.add(attributePanel);
		
	// 소재
		JPanel materialPanel = new JPanel();
		materialPanel.setBackground(Color.WHITE);
		TitledBorder materialBorder = new TitledBorder(
						new LineBorder(Color.LIGHT_GRAY, 2), "재료");
		materialPanel.setBorder(materialBorder);
		materialPanel.setPreferredSize(new Dimension(dialog_size_x - 38, 110));
		
		String materialData = dto.getMaterial();
		int beginIdx = 0;
		
		for(int i = 0; i < materialData.length(); i++) {
			if(materialData.charAt(i) == ',') {
				JLabel materialLabel = new JLabel(
								materialData.substring(beginIdx, i + 1));
				
				materialPanel.add(materialLabel);
				
				beginIdx = i + 1;
			}
		}
		materialPanel.add(new JLabel(materialData.substring(
						beginIdx, materialData.length())));

		infoPanel.add(materialPanel);
		
		

		JButton favoriteButton = new JButton(this.buttonName);
		
		favoriteButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int answer = JOptionPane.showConfirmDialog(frame,
								"즐겨찾기에 추가 하시겠습니까?", "즐겨찾기 추가",
								JOptionPane.YES_NO_OPTION);
				
				if(answer == JOptionPane.YES_OPTION) {
					// 즐겨찾기 추가 로직
					dao.updateFavorite(dto);
				}
			}
		});
		
		
		
		
		
//		JButton deleteButton = new JButton(this.buttonName);
		
		// deleteButton addActionListener 작성할 것
		
		
		
		
		
		if(this.buttonName.equals("추가")) {
			infoPanel.add(favoriteButton);
		}
		
		if(this.buttonName.equals("삭제")) {
			
		}
		
		this.setVisible(true);
	}
}
