package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;

public interface IWeaponsDAO {
	public IWeaponsDTO selectData(String sql);
	public boolean updateData(IWeaponsDTO dto);
	public boolean insertData(IWeaponsDTO dto);
	public boolean deleteData(IWeaponsDTO dto);
}
