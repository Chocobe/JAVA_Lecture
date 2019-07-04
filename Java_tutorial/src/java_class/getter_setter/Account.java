package java_class.getter_setter;

public class Account {
	String owner_name;		// 예금주
	int account_number;		// 계좌번호
	int balance;			// 잔액
	
	// 생성자
	public Account() {
		this("", 0, 0);
	}
	
	public Account(String _name) {
		this(_name, 0, 0);
	}
	
	public Account(String _name, int _account) {
		this(_name, _account, 0);
	}
	
	public Account(String _name, int _account, int _balance) {
		this.owner_name = _name;
		this.account_number = _account;
		this.balance = _balance;
	}
	//생성자
	
	
	// 이름반환
	// author	:	Chocobe
	// param	:	N/A
	// return	:	(String) 예금주 이름
	public String get_owner_name() {
		return this.owner_name;
	}
	
	
	// 이름설정
	// author	:	Chocobe
	// param	:	String _name : 예금주 이름
	// return	:	N/A
	public void set_owner_name(String _name) {
		this.owner_name = _name;
	}
	
	
	// 계좌번호 반환
	// author	:	Chocobe
	// param	:	N/A
	// return	:	(int) 계좌번호
	public int get_account_number() {
		return this.account_number;
	}
	
	
	// 계좌번호 설정
	// author	:	Chocobe
	// param	:	int _account_num : 설정할 계좌번호
	// return	:	N/A
	public void set_account_number(int _account_num) {
		this.account_number = _account_num;
	}
	
	
	// 잔액 반환
	// author	:	Chocobe
	// param	:	N/A
	// return	:	(int) 잔액
	public int get_balance() {
		return this.balance;
	}
	
	
	// 잔액 설정
	// author	:	Chocobe
	// param	:	int _balance
	// return	:	N/A
	public void set_balance(int _balance) {
		this.balance = _balance;
	}
	
	
	// 정보 출력
	// author	:	Chocobe
	// param	:	N/A
	// return	:	(String) 정보 문자열
	@Override
	public String toString() {
		String result = "";
		result += "예금주 : " + this.owner_name + "\n";
		result += "계좌번호 : " + this.account_number + "\n";
		result += "잔액 : " + this.balance;
		return result;
	}
	
	
	// 예금하기
	// author	:	Chocobe
	// param	:	int _money :예금 금액
	// return	:	N/A
	public void deposit(int _money) {
		this.balance += _money;
	}
	
	
	// 출금하기
	// author	:	Chocobe
	// param	:	int _money : 출금 금액
	// return	:	N/A
	public void withdraw(int _money) {
		if(this.balance < _money) {
			System.out.println("Error] 잔액 부족");
			
		} else {
			this.balance -= _money;
		}
	}
}
