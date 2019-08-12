package project_07_MonsterHunter_Weapon_DB.unit_tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import project_07_MonsterHunter_Weapon_DB.WeaponDTO.WeaponsDB_Connection;

@SuppressWarnings("unused")
public class WeaponsDB_connectionTestUnit {
	private static Connection conn;
	private static PreparedStatement ps;
	private static ResultSet rs;
	
	public static void main(String[] args) {
		conn = WeaponsDB_Connection.getConnection();
		
		String sql_insert = "INSERT INTO MH_TEST VALUES(?, ?)";
		String sql_select = "SELECT * FROM MH_TEST";
		String sql_delete = "DELETE FROM MH_TEST WHERE NAME = ?";
		
		selectTest(sql_select);
		insertTest(sql_insert, "네르기간테", 1);
//		deleteTest(sql_delete, "네르기간테");
		
		System.out.println();
		selectTest(sql_select);
		
		WeaponsDB_Connection.close(conn);
	}
	
	
	public static void insertTest(String sql, String name, int no) {
		ps = null;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, no);
			int result_state = ps.executeUpdate();
			
			if(result_state != 0) System.out.println("입력 완료");
			
		} catch(SQLException e) {
			System.out.println("INSERT 에러 : " + e.getMessage());
			
		} finally {
			if(ps != null) {
				WeaponsDB_Connection.close(ps);
			}
		}
	}
	
	
	public static void selectTest(String sql) {
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				System.out.println("Name : " + rs.getString("NAME") + ", No : " + rs.getInt("NO"));
			}
			
		} catch(SQLException e) {
			System.out.println("SELECT 에러 : " + e.getMessage());
			
		} finally {
			if(rs != null) {
				WeaponsDB_Connection.close(rs);
			}
			
			if(ps != null) {
				WeaponsDB_Connection.close(ps);
			}
		}
	}
	
	
	public static void deleteTest(String sql, String name) {
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			int result_state = ps.executeUpdate();
			
			if(result_state != 0) System.out.println("삭제 완료");
			
		} catch(SQLException e) {
			System.out.println("delete 에러 : " + e.getMessage());
			
		} finally {
			WeaponsDB_Connection.close(ps);
		}
	}
}
