package java_class.book;

public class Book_test {
	// new : ����� ���� ���� (heap)�� �Ҵ�
	// new ������ �޼ҵ� : new ���� �޸𸮿� �Ҵ��� �ڷḦ �����Ѵ�.
	// new Book();
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("java");
		
		String author = book.getAuthor();
		System.out.println("���� : " + author);
		
		book.setAuthor("Java 2");
		author = book.getAuthor();
		System.out.println("���� : " + author);
	}
}
