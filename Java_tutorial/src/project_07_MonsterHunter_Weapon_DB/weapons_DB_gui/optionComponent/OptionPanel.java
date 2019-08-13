package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

@SuppressWarnings("serial")
public abstract class OptionPanel extends JPanel{
	private MainFrame frame;
	
// 하위클래스 생성자에서 호출할 것
	protected void initItsPanel(MainFrame frame, String title, int height) {
		this.frame = frame;
		
		TitledBorder titledBorder = new TitledBorder(
						new LineBorder(Color.LIGHT_GRAY, 2), title);
		this.setBorder(titledBorder);
		
		this.setPreferredSize(new Dimension(this.frame.getSize_x() - 20, height));
		this.setBackground(Color.WHITE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
	}

	
// selectedOption getter
	public abstract String getSelectedOption();
}
