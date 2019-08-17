package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public ArrayList<WeaponsDTO> selectData(String sql) {
		// TODO Auto-generated method stub
		ArrayList<WeaponsDTO> dtoArray = new ArrayList<WeaponsDTO>();
		
		try {			
			preparedStatement = conn.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				WeaponsDTO dto = new WeaponsDTO();
				dto.setAllData(resultSet.getString("NAME"), 
							   resultSet.getString("SORT"), 
							   resultSet.getInt("DAMAGE"), 
							   resultSet.getInt("CRITICAL"), 
							   resultSet.getInt("GRADE"), 
							   resultSet.getString("ATTRIBUTE"), 
							   resultSet.getInt("ATTRIBUTE_VAL"), 
							   resultSet.getInt("SLOT_1"), 
							   resultSet.getInt("SLOT_2"), 
							   resultSet.getInt("SLOT_3"), 
							   resultSet.getInt("NUM_OF_SLOT"),
							   resultSet.getString("MATERIAL"), 
							   resultSet.getString("TREE"), 
							   resultSet.getInt("TREE_POSITION"), 
							   resultSet.getInt("SHARPNESS_1"), 
							   resultSet.getInt("SHARPNESS_2"), 
							   resultSet.getInt("SHARPNESS_3"), 
							   resultSet.getInt("SHARPNESS_4"), 
							   resultSet.getInt("SHARPNESS_5"), 
							   resultSet.getInt("SHARPNESS_6"));
				dtoArray.add(dto);
			}
			
		} catch(SQLException e) {
			System.out.println("SELECT 에러 : " + e.getMessage());
			
		} 
		
		return dtoArray;
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
