package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.util.ArrayList;
import java.util.Vector;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public interface IWeaponsDAO {
	public ArrayList<WeaponsDTO> selectData(String sql);
	public boolean updateData(IWeaponsDTO dto);
	public boolean insertData(IWeaponsDTO dto);
	public boolean deleteData(IWeaponsDTO dto);
}
