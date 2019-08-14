package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Dimension;

import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public class AdminOptionGroupPanel extends JPanel {
	private JPanel namePanel;
	private JPanel basePanel;
	private JPanel attributePanel;
	private JPanel slotPanel;
	private JPanel materialPanel;
	private JPanel sharpnessPanel;
	private JPanel treePanel;
	
	private MainFrame frame;
	
	public AdminOptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		this.setPreferredSize(new Dimension(1, 550));		
		initInputOptionPanels();
	}
	
	private void initInputOptionPanels() {		
		this.namePanel = new NameInputPanel(this.frame);
		this.add(namePanel);
		
		this.basePanel = new BaseInputPanel(this.frame);
		this.add(basePanel);
		
		this.attributePanel = new AttributeInputPanel(this.frame);
		this.add(attributePanel);
		
		this.slotPanel = new SlotInputPanel(this.frame);
		this.add(slotPanel);
		
		this.materialPanel = new MaterialInputPanel(this.frame);
		this.add(materialPanel);
		
		this.sharpnessPanel = new SharpnessInputPanel(this.frame);
		this.add(sharpnessPanel);
		
		this.treePanel = new TreeInputPanel(this.frame);
		this.add(treePanel);
	}
}
