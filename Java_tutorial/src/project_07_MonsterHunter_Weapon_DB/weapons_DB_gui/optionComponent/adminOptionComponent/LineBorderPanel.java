package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent.adminOptionComponent;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class LineBorderPanel extends JPanel{
	public LineBorderPanel() {
		initPanel();
	}
	
	
	private void initPanel() {
		LineBorder border = new LineBorder(Color.LIGHT_GRAY, 2);
		this.setBorder(border);
	}
}
