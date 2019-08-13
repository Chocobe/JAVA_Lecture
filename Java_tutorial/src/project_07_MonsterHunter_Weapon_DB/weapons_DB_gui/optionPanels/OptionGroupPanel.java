package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionPanels;

import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class OptionGroupPanel extends JPanel {
	
	private JPanel sortPanel;
	private JPanel attributePanel;
	private JPanel slotLevelPanel;
	private JPanel numOfSlotPanel;
	private JPanel treePanel;
	
	private MainFrame frame;
	
	public OptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		initOptionPanels();
		
	}
	
	
	private void initOptionPanels() {
		this.sortPanel = new SortPanel(this.frame);
		this.add(sortPanel);
		
		this.attributePanel = new AttributePanel(this.frame);
		this.add(attributePanel);
		
		this.slotLevelPanel = new SlotLevelPanel(this.frame);
		this.add(slotLevelPanel);
		
		this.numOfSlotPanel = new NumOfSlot(this.frame);
		this.add(numOfSlotPanel);
		
		this.treePanel = new TreePanel(this.frame);
		this.add(treePanel);
	}
}




















