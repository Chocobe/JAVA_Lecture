package project_lecture_sequence.lecture_system;

public class Bookstore_owner {
	
	
	
	public boolean order_book(String _book) {
		System.out.println("\"" + _book + "\" 책 주문이 접수 되었습니다");
		
		try {
			Thread.sleep(1000);
			
		} catch(InterruptedException e) {
			return false;
		}
		
		System.out.println("\"" + _book + "\" 책이 배송 되었습니다");
		
		return true;
	}
}
