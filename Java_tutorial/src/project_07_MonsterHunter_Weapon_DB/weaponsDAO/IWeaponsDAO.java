package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.util.ArrayList;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public interface IWeaponsDAO {
	public ArrayList<WeaponsDTO> selectData(String sql);
	public void updateFavorite(WeaponsDTO dto);
	public void deleteFavorite(WeaponsDTO dto);
	public ArrayList<WeaponsDTO> selectFavorite();
	public void insertData(WeaponsDTO dto);
	public void deleteData(WeaponsDTO dto);
}
