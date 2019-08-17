package project_07_MonsterHunter_Weapon_DB.WeaponDTO;

public interface IWeaponsDTO {
	public void setAllData(
					String name, String sort, int damage, 
					int critical, int grade, 
					String attribute, int attribute_val, 
					int slot_1, int slot_2, int slot_3, int num_of_slot,
					String material, String tree, int tree_position,
					int sharpness_1, int sharpness_2, int sharpness_3,
					int sharpness_4, int sharpness_5, int sharpness_6
					);
}
