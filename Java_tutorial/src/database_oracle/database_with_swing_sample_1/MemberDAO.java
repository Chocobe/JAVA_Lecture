package database_oracle.database_with_swing_sample_1;

import java.sql.*;
import java.util.Vector;

import database_oracle.util_OracleDataSource.DBConnection_data_source;

public class MemberDAO {
	Connection con;

	public void dbConnect() throws Exception{
		Class.forName(
			"oracle.jdbc.driver.OracleDriver");
		String url
		="jdbc:oracle:thin:@localhost:1521:orcl";
		con=DriverManager.getConnection(url,"scott","tiger");
		System.out.println("Db Connected...");
	}
	
	
	public int insertMember(MemberDTO dto) {
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO MEMBER2 VALUES(" +
					 "MEMBER2_NO.NEXTVAL, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getTel());
			ps.setString(4, dto.getAddr());
			
			result = ps.executeUpdate();
			
		} catch(SQLException e) {
			System.out.println("입력 실패 : " + e.getMessage());
			
		} finally {
			DBConnection_data_source.close(ps);
		}
		
		return result;
	}
	
	
	public MemberDTO[] selectAll() {
		String sql = "SELECT * FROM  MEMBER2";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			MemberDTO[] arr = makeArray(rs);
			return arr;
			
		} catch(SQLException e) {
			System.out.println("검색실패 : " + e.getMessage());
			return null;
			
		} finally {
			DBConnection_data_source.close(rs);
			DBConnection_data_source.close(ps);
		}
	}
	
	
	public MemberDTO[] makeArray(ResultSet rs) throws SQLException {
		Vector<MemberDTO> list = new Vector<MemberDTO>();
		MemberDTO dto = null;
		
		while(rs.next()) {
			dto = new MemberDTO();
			dto.setNo(rs.getInt("NO"));
			dto.setId(rs.getString("ID"));
			dto.setName(rs.getString("NAME"));
			dto.setTel(rs.getString("PHONE"));
			dto.setAddr(rs.getString("ADDR"));
			
			list.add(dto);
		}
		
		MemberDTO[] memArr = new MemberDTO[list.size()];
		list.copyInto(memArr);
		
		return memArr;
	}
	
	
	public void close(){
		try{
			if(con!=null)
				con.close();
		}catch(SQLException e){System.out.println("닫기실패");}
	}//close()---------	
}//////////////////////////////////////




