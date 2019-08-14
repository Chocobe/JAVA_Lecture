package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class OptionGroupPanel extends JPanel {
	
	private JPanel sortPanel;
	private JPanel attributePanel;
	private JPanel slotLevelPanel;
	private JPanel numOfSlotPanel;
	private JPanel treePanel;
	
	private MainFrame frame;
	
	private WeaponsDTO weaponsDTO;
	
	public OptionGroupPanel(MainFrame frame, WeaponsDTO dto) {
		this.frame = frame;
		this.weaponsDTO = dto;
		initOptionPanels();
		
	}
	
	
	private void initOptionPanels() {
		this.sortPanel = new SortPanel(this.frame, weaponsDTO);
		this.add(sortPanel);
		
		this.attributePanel = new AttributePanel(this.frame, weaponsDTO);
		this.add(attributePanel);
		
		this.slotLevelPanel = new SlotLevelPanel(this.frame, weaponsDTO);
		this.add(slotLevelPanel);
		
		this.numOfSlotPanel = new NumOfSlot(this.frame, weaponsDTO);
		this.add(numOfSlotPanel);
		
		this.treePanel = new TreePanel(this.frame, weaponsDTO);
		this.add(treePanel);
	}
}




















