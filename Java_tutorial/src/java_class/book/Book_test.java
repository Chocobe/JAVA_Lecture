package java_class.book;

public class Book_test {
	// new : 사용자 정의 공간 (heap)에 할당
	// new 생성자 메소드 : new 다음 메모리에 할당할 자료를 생성한다.
	// new Book();
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("java");
		
		String author = book.getAuthor();
		System.out.println("저자 : " + author);
		
		book.setAuthor("Java 2");
		author = book.getAuthor();
		System.out.println("저자 : " + author);
	}
}
