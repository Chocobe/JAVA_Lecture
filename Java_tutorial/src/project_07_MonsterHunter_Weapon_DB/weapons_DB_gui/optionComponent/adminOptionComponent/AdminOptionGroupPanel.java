package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Dimension;

import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.OptionPanel;

@SuppressWarnings("serial")
public class AdminOptionGroupPanel extends JPanel {
	private OptionPanel namePanel;
	private BaseInputPanel basePanel;
	private OptionPanel attributePanel;
	private OptionPanel slotPanel;
	private OptionPanel materialPanel;
	private SharpnessInputPanel sharpnessPanel;
	private OptionPanel treePanel;
	private JPanel insertPanel;
	
	private MainFrame frame;
	
	
// 생성자
	public AdminOptionGroupPanel(MainFrame frame) {
		this.frame = frame;
		this.setPreferredSize(new Dimension(1, 550));
		initInputOptionPanels();
	}
	
	
// InputOptionPanel 초기화
	public void initInputOptionPanels() {		
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
		
		this.insertPanel = new DataInsertPanel(this.frame, this);
		this.add(insertPanel);
	}
	
	
// 입력창 초기화
	public void clearInputedData() {
		this.namePanel.clearInputedData();
		this.basePanel.clearInputedData();
		this.attributePanel.clearInputedData();
		this.slotPanel.clearInputedData();
		this.materialPanel.clearInputedData();
		this.sharpnessPanel.clearInputedData();
		this.treePanel.clearInputedData();
	}
	
	
// getter
	public OptionPanel getNamePanel() {
		return this.namePanel;
	}
	
	public BaseInputPanel getBasePanel() {
		return this.basePanel;
	}
	
	public OptionPanel getAttributePanel() {
		return this.attributePanel;
	}
	
	public OptionPanel getSlotPanel() {
		return this.slotPanel;
	}
	
	public OptionPanel getMaterialPanel() {
		return this.materialPanel;
	}
	
	public SharpnessInputPanel getSharpnessPanel() {
		return this.sharpnessPanel;
	}
	
	public OptionPanel getTreePanel() {
		return this.treePanel;
	}	
}
