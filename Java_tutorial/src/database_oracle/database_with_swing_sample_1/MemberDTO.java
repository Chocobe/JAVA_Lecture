package database_oracle.database_with_swing_sample_1;

public class MemberDTO {
	private int no;//자동증가..
	private String id;
	private String name;
	private String tel;
	private String addr;
	
	public MemberDTO(){
		
	}//기본 생성자-----

	public MemberDTO(int no,String id, String name, 
			String tel, String addr) {
		super();
		this.no=no;
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}//인자 생성자--------

	//setter, getter-----
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
