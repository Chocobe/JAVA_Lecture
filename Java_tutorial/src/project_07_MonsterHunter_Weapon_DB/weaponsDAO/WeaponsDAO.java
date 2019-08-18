package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.IWeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;
import project_07_MonsterHunter_Weapon_DB.weapons_DB_gui.MainFrame;

public class WeaponsDAO implements IWeaponsDAO {
	private Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private MainFrame frame;
	
	public WeaponsDAO(MainFrame frame) {
		this.frame = frame;
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
			
		} finally {
			WeaponsDBConnector.close(resultSet);
			WeaponsDBConnector.close(preparedStatement);
		}
		
		return dtoArray;
	}
	
	
	@Override
	public void updateFavorite(WeaponsDTO dto) {
		// TODO Auto-generated method stub
		String sql = "SELECT FAVORITE " +
					 "FROM WEAPONS " +
					 "WHERE NAME = ?";	
		
		System.out.println("즐겨찾기 추가할 무기 : " + dto.getName());
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.preparedStatement.setString(1, dto.getName());
			this.resultSet = this.preparedStatement.executeQuery();
			
			
			if(resultSet.next()) {
				if(resultSet.getString("FAVORITE").equals("true")) {
					JOptionPane.showMessageDialog(frame, "이미 추가된 항목입니다");
					
				} else {
					sql = "UPDATE WEAPONS SET " +
						  "FAVORITE = 'true' " +
						  "WHERE NAME = ?";
					this.preparedStatement = conn.prepareStatement(sql);
					this.preparedStatement.setString(1, dto.getName());
					this.preparedStatement.executeUpdate();
					
					JOptionPane.showMessageDialog(frame, "즐겨찾기에 <" + 
									dto.getName() + "> 이(가) 추가되었습니다");
				}				
			}
			
		} catch(SQLException e) {
			System.out.println("업데이트 에러 : " + e.getMessage());
			
		} finally {
			WeaponsDBConnector.close(this.resultSet);
			WeaponsDBConnector.close(this.preparedStatement);
		}
	}
	
	
	@Override
	public void deleteFavorite(WeaponsDTO dto) {
		String sql = "UPDATE WEAPONS SET " +
					 "FAVORITE = 'false' " +
					 "WHERE NAME = ?";
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.preparedStatement.setString(1, dto.getName());
			int updateState = this.preparedStatement.executeUpdate();
			
			if(updateState != 0) {
				JOptionPane.showMessageDialog(frame, "즐겨찾기에서 삭제 되었습니다");
				
			}
			
		} catch(SQLException e) {
			System.out.println("즐겨찾기 삭제 에러 : " + e.getMessage());
			
		} finally {
			WeaponsDBConnector.close(this.preparedStatement);
		}
	}
	
	
	@Override
	public ArrayList<WeaponsDTO> selectFavorite() {
		ArrayList<WeaponsDTO> dtoArray = new ArrayList<WeaponsDTO>();
		
		String sql = "SELECT * FROM WEAPONS " +
					 "WHERE FAVORITE = 'true'";
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.resultSet = this.preparedStatement.executeQuery();
			
//			System.out.println("Favorite 테스트 : " + resultSet.getString("NAME"));
			
			while(resultSet.next()) {
				WeaponsDTO dto = new WeaponsDTO();
				dto.setAllData(
						   resultSet.getString("NAME"), 
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
			System.out.println("즐겨찾기 검색 에러 : " + e.getMessage());
		}
		
		return dtoArray;
	}
	
	
	@Override
	public void insertData(WeaponsDTO dto) {
		String sql = "INSERT INTO WEAPONS(" +
					 "NAME, SORT, DAMAGE, CRITICAL, GRADE, " +
					 "ATTRIBUTE, ATTRIBUTE_VAL, " +
					 "SLOT_1, SLOT_2, SLOT_3, " +
					 "NUM_OF_SLOT, " +
					 "MATERIAL, " +
					 "TREE, TREE_POSITION, " +
					 "SHARPNESS_1, SHARPNESS_2, SHARPNESS_3, " +
					 "SHARPNESS_4, SHARPNESS_5, SHARPNESS_6)" +
					 "VALUES(?, ?, ?, ?, ?," +
					 "?, ?, " +
					 "?, ?, ?, " +
					 "?, " +
					 "?, " +
					 "?, ?, " +
					 "?, ?, ?, " +
					 "?, ?, ?)";
		
//		String sql = "INSERT INTO WEAPONS VALUES(" +
//					 "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
//					 "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.preparedStatement.setString(1, dto.getName());
			this.preparedStatement.setString(2, dto.getSort());
			this.preparedStatement.setInt(3, dto.getDamage());
			this.preparedStatement.setInt(4, dto.getCritical());
			this.preparedStatement.setInt(5, dto.getGrade());
			this.preparedStatement.setString(6, dto.getAttribute());
			this.preparedStatement.setInt(7, dto.getAttribute_val());
			this.preparedStatement.setInt(8, dto.getSlot_1());
			this.preparedStatement.setInt(9, dto.getSlot_2());
			this.preparedStatement.setInt(10, dto.getSlot_3());
			this.preparedStatement.setInt(11, dto.getNumOfSlot());
			this.preparedStatement.setString(12, dto.getMaterial());
			this.preparedStatement.setString(13, dto.getTree());
			this.preparedStatement.setInt(14, dto.getTree_position());
			this.preparedStatement.setInt(15, dto.getSharpness_1());
			this.preparedStatement.setInt(16, dto.getSharpness_2());
			this.preparedStatement.setInt(17, dto.getSharpness_3());
			this.preparedStatement.setInt(18, dto.getSharpness_4());
			this.preparedStatement.setInt(19, dto.getSharpness_5());
			this.preparedStatement.setInt(20, dto.getSharpness_6());
			
			this.preparedStatement.executeUpdate();
			
//			if(insertResult != 0) {
//				JOptionPane.showMessageDialog(frame, 
//								dto.getName() + " 데이터가 추가 되었습니다", "데이터 추가", 
//								JOptionPane.INFORMATION_MESSAGE);
//				// 각 입력창 초기화
//				// insertPanel.initPanel();
//				
//			} else {
//				JOptionPane.showMessageDialog(frame, "데이터 추가 에러", 
//								"데이터 추가 에러", JOptionPane.ERROR_MESSAGE);
//				// 각 입력창 초기화
//				// insertPanel.initPanel();
//			}
			JOptionPane.showMessageDialog(frame, 
					dto.getName() + " 데이터가 추가 되었습니다", "데이터 추가", 
					JOptionPane.INFORMATION_MESSAGE);
			
		} catch(SQLException e) {
			System.out.println("입력 에러 : " + e.getMessage());
			JOptionPane.showMessageDialog(frame, "데이터 추가 에러", 
					"데이터 추가 에러", JOptionPane.ERROR_MESSAGE);
		}
	}
	

	@Override
	public boolean deleteData(IWeaponsDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
