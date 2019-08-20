package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.optionComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public abstract class OptionPanel extends JPanel{
	
	
// 하위클래스 생성자에서 호출할 것
	// 자식 클래스의 속성에 따른 설정
	protected void initItsPanel(String title, int width, int height) {		
		TitledBorder titledBorder = new TitledBorder(
						new LineBorder(Color.LIGHT_GRAY, 2), title);
		this.setBorder(titledBorder);
		
		this.setPreferredSize(new Dimension(width - 20, height));
		this.setBackground(Color.WHITE);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 2, 2));
	}

	
// selectedOption getter
	public abstract String getSelectedOption();
// clearInputData
	public abstract void clearInputedData();
}
