package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import javax.swing.JDialog;
import javax.swing.JPanel;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionPanels.OptionGroupPanel;

public class AdminDialog extends JDialog {
	
	private MainFrame frame;
	private JPanel optionPanel;
	
	public AdminDialog(MainFrame frame) {
		this.frame = frame;
		this.initPanel();
	}
	
	
	private void initPanel() {
		this.optionPanel = new OptionGroupPanel(this.frame);
		this.add(optionPanel);
	}
}
