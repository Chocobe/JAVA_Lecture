package java_class.getter_setter_ex_1;

public class Account_test {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.set_owner_name("홍길동");
		account.set_account_number(123);
		account.set_balance(1000);
		System.out.println(account.toString());
		
		print_line();
		
		account.deposit(10000);
		System.out.println(account.toString());		
	}
	
	
	public static void print_line() {
		System.out.println("-------------------------");
	}
}
