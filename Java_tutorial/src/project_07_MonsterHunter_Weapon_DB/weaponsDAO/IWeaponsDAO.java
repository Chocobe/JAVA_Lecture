package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;

public interface IWeaponsDAO {
	public IWeaponsDTO receiveData();
	public boolean transmit(IWeaponsDTO dto);
}
