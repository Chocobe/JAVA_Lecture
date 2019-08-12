package project_06_bookstore.dao;

@SuppressWarnings("unused")
public class Member_dao implements I_dao {
	private int mem_id;
	private String mem_name;
	private String mem_tel;
	private String mem_email;
	private int mem_rent_num;
	private String mem_penalty;
	
	
// mem_id
	public int get_mem_id() {
		return this.mem_id;
	}
	
	public void set_mem_id(int _id) {
		this.mem_id = _id;
	}
	
	
// mem_name
	public String get_mem_name() {
		return this.mem_name;
	}
	
	public void set_mem_name(String _name) {
		this.mem_name = _name;
	}
	
	
// mem_tel
	public String get_mem_tel() {
		return this.mem_tel;
	}
	
	public void set_mem_tel(String _tel) {
		this.mem_tel = _tel;
	}
	
	
// mem_email
	public String get_mem_email() {
		return this.mem_email;
	}
	
	public void set_mem_email(String _email) {
		this.mem_email = _email;
	}
}























