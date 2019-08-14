package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public class WeaponsDAO implements IWeaponsDAO {
	private Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private WeaponsDTO weaponsDTO;
	
	public WeaponsDAO(WeaponsDTO dto) {
		this.weaponsDTO = dto;
	}
	
	@Override
	public IWeaponsDTO selectData(IWeaponsDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean updateData(IWeaponsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean insertData(IWeaponsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean deleteData(IWeaponsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
