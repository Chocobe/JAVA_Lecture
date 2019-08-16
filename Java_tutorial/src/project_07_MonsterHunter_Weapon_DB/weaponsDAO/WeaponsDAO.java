package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public class WeaponsDAO implements IWeaponsDAO {
	private Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public WeaponsDAO() {
		initConnection();
	}
	
	
	private void initConnection() {
		this.conn = WeaponsDBConnector.getConnection();
	}
	
	
	@Override
	public IWeaponsDTO selectData(String sql) {
		// TODO Auto-generated method stub
		try {
			preparedStatement = conn.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
		} catch(SQLException e) {
			System.out.println("SELECT 에러 : " + e.getMessage());
		}
		
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
