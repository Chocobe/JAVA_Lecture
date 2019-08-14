package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;


public class AdminOptionGroupPanel extends JPanel {
	private JPanel namePanel;
	private JPanel basePanel;
	private JPanel attributePanel;
	private JPanel slotPanel;
	private JPanel materialPanel;
//	private JPanel treePanel;
//	private JPanel sharpnessPanel;
//	
	private MainFrame frame;
	
	public AdminOptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		initInputOptionPanels();
	}
	
	private void initInputOptionPanels() {
		namePanel = new NameInputPanel(this.frame);
		this.add(namePanel);
		
		basePanel = new BaseInputPanel(this.frame);
		this.add(basePanel);
		
		attributePanel = new AttributeInputPanel(this.frame);
		this.add(attributePanel);
		
		slotPanel = new SlotInputPanel(this.frame);
		this.add(slotPanel);
		
		materialPanel = new MaterialInputPanel(this.frame);
		this.add(materialPanel);
	}
}
