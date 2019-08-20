package project_07_MonsterHunter_Weapon_DB.weaponsDAO;

import java.awt.Container;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDTO;

public class WeaponsDAO implements IWeaponsDAO {
	private Connection conn;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private Container parentContainer;
	
	
// 생성자
	public WeaponsDAO(Container parentContainer) {
		this.parentContainer = parentContainer;
		initConnection();
	}
	
	
// Connection 객체 생성
	private void initConnection() {
		this.conn = WeaponsDBConnector.getConnection();
	}
	
	
// SELECT sql
	@Override
	public ArrayList<WeaponsDTO> selectData(String sql) {
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
	
	
// UPDATE Favorite sql
	@Override
	public void updateFavorite(WeaponsDTO dto) {
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
					JOptionPane.showMessageDialog(parentContainer, "이미 추가된 항목입니다");
					
				} else {
					sql = "UPDATE WEAPONS SET " +
						  "FAVORITE = 'true' " +
						  "WHERE NAME = ?";
					this.preparedStatement = conn.prepareStatement(sql);
					this.preparedStatement.setString(1, dto.getName());
					this.preparedStatement.executeUpdate();
					
					JOptionPane.showMessageDialog(parentContainer, "즐겨찾기에 <" + 
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
	
	
// DELETE Favorite sql
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
				JOptionPane.showMessageDialog(parentContainer, "즐겨찾기에서 삭제 되었습니다");
			}
			
		} catch(SQLException e) {
			System.out.println("즐겨찾기 삭제 에러 : " + e.getMessage());
			
		} finally {
			WeaponsDBConnector.close(this.preparedStatement);
		}// end try~catch
	}
	
	
// SELECT Favorite sql
	@Override
	public ArrayList<WeaponsDTO> selectFavorite() {
		ArrayList<WeaponsDTO> dtoArray = new ArrayList<WeaponsDTO>();
		
		String sql = "SELECT * FROM WEAPONS " +
					 "WHERE FAVORITE = 'true'";
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.resultSet = this.preparedStatement.executeQuery();
			
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
			}// end while()
			
		} catch(SQLException e) {
			System.out.println("즐겨찾기 검색 에러 : " + e.getMessage());
		}// end try~catch
		
		return dtoArray;
	}
	
	
// INSERT Data sql
	@Override
	public void insertData(WeaponsDTO dto) {
		String sql = "INSERT INTO WEAPONS(" +
	
					 "NAME, SORT, DAMAGE, CRITICAL, GRADE, " +		// 1행
					 "ATTRIBUTE, ATTRIBUTE_VAL, " +					// 2행
					 "SLOT_1, SLOT_2, SLOT_3, " +					// 3행
					 "NUM_OF_SLOT, " +								// 4행
					 "MATERIAL, " +									// 5행
					 "TREE, TREE_POSITION, " +						// 6행
					 "SHARPNESS_1, SHARPNESS_2, SHARPNESS_3, " +	// 7행
					 "SHARPNESS_4, SHARPNESS_5, SHARPNESS_6)" +		// 8행
					 
					 "VALUES(?, ?, ?, ?, ?," +						// 1행 입력
					 "?, ?, " +										// 2행 입력
					 "?, ?, ?, " +									// 3행 입력
					 "?, " +										// 4행 입력
					 "?, " +										// 5행 입력
					 "?, ?, " +										// 6행 입력
					 "?, ?, ?, " +									// 7행 입력
					 "?, ?, ?)";									// 8행 입력
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			
		// 1행 입력
			this.preparedStatement.setString(1, dto.getName());
			this.preparedStatement.setString(2, dto.getSort());
			this.preparedStatement.setInt(3, dto.getDamage());
			this.preparedStatement.setInt(4, dto.getCritical());
			this.preparedStatement.setInt(5, dto.getGrade());
			
		// 2행 입력
			this.preparedStatement.setString(6, dto.getAttribute());
			this.preparedStatement.setInt(7, dto.getAttribute_val());
			
		// 3행 입력
			this.preparedStatement.setInt(8, dto.getSlot_1());
			this.preparedStatement.setInt(9, dto.getSlot_2());
			this.preparedStatement.setInt(10, dto.getSlot_3());
			
		// 4행 입력
			this.preparedStatement.setInt(11, dto.getNumOfSlot());
			
		// 5행 입력
			this.preparedStatement.setString(12, dto.getMaterial());
			
		// 6행 입력
			this.preparedStatement.setString(13, dto.getTree());
			this.preparedStatement.setInt(14, dto.getTree_position());
			
		// 7행 입력
			this.preparedStatement.setInt(15, dto.getSharpness_1());
			this.preparedStatement.setInt(16, dto.getSharpness_2());
			this.preparedStatement.setInt(17, dto.getSharpness_3());
			
		// 8행 입력
			this.preparedStatement.setInt(18, dto.getSharpness_4());
			this.preparedStatement.setInt(19, dto.getSharpness_5());
			this.preparedStatement.setInt(20, dto.getSharpness_6());
			
		// sql 실행
			this.preparedStatement.executeUpdate();
			
			JOptionPane.showMessageDialog(parentContainer, 
					dto.getName() + " 데이터가 추가 되었습니다", "데이터 추가", 
					JOptionPane.INFORMATION_MESSAGE);
			
		} catch(SQLException e) {
			System.out.println("입력 에러 : " + e.getMessage());
			JOptionPane.showMessageDialog(parentContainer, "데이터 추가 에러", 
							"데이터 추가 에러", JOptionPane.ERROR_MESSAGE);
		}// end try~catch
	}
	

// DELETE Data sql
	@Override
	public void deleteData(WeaponsDTO dto) {
		String sql = "DELETE FROM WEAPONS WHERE NAME = ?";
		
		try {
			this.preparedStatement = this.conn.prepareStatement(sql);
			this.preparedStatement.setString(1, dto.getName());
			int resultState = this.preparedStatement.executeUpdate();
			
			if(resultState != 0) {
				JOptionPane.showMessageDialog(parentContainer, "DB에서 삭제 되었습니다");
			}
		
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(parentContainer, "데이터 삭제 에러",
							"데이터 삭제 에러", JOptionPane.ERROR_MESSAGE);
		}
	}
}
