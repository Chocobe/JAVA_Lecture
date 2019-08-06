package database_oracle.simple_project_DB_1;

// DTO : Data Transfer Object
// 데이터베이스에 자료를 전달할 때 전송하는 대상 객체(전송단위)

public class MemberDTO {
	private int id;
	private String name;
	private String password;
	private String email;
	

// id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
// name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
// password
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
// email
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
// toString
	@Override
	public String toString() {
		String str = null;
		str = String.format("%5d,%-8s,%-8s,%-8s", this.id, this.name, this.password, this.email);
		
		return str;
	}
}
