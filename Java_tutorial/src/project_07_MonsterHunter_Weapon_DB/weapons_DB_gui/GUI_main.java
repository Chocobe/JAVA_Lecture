package project_07_MonsterHunter_Weapon_DB.weapons_DB_gui;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public class GUI_main {
	public static void main(String[] args) {
		WeaponsDTO weaponsDTO = new WeaponsDTO();
		
		MainFrame frame = new MainFrame(weaponsDTO);
		frame.setVisible(true);
	}
}
