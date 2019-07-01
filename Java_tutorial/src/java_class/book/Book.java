package java_class.book;

public class Book {
	// å�� �Ӽ�
	private String author;
	private String title;
	private int price;
	private int pageNumber;
	private String publisher;
	
	// author �Ӽ��� ����
	// @param	:	String _author : ���� �̸�
	// @return	:	N/A
	public void setAuthor(String _author) {
		this.author = _author;
	}

	// title �Ӽ��� ����
	// @param	:	String _title : å ����
	// @return	:	N/A
	public void setTitle(String _title) {
		this.title = _title;
	}
	
	// price �Ӽ��� ����
	// @param	:	int _price : ����
	// @return	:	N/A
	public void setPrice(int _price) {
		this.price = _price;
	}
	
	// pageNumber �Ӽ��� ����
	// @param	:	int _pageNumber : �� ������ ��
	// @return	:	N/A
	public void setPageNumber(int _pageNumber) {
		this.pageNumber = _pageNumber;
	}
	
	// publisher �Ӽ��� ����
	// @param	:	String _publisher : ���ǻ��
	// @return	:	N/A
	public void setPublisher(String _publisher) {
		this.publisher = _publisher;
	}
	
	
	// author �Ӽ��� ��ȯ
	// @param	:	N/A
	// @return	:	(String) ���� �̸�
	public String getAuthor() {
		return this.author;
	}
	
	// title �Ӽ��� ��ȯ
	// @param	:	N/A
	// @return	:	(String) å �̸�
	public String getTitle() {
		return this.title;
	}
	
	// price �Ӽ��� ��ȯ
	// @param	:	N/A
	// @return	:	(int) ����
	public int getPrice() {
		return this.price;
	}
	
	// pageNumber �Ӽ��� ��ȯ
	// @param	:	N/A
	// @return	:	(int) ������ �� ��
	public int getPageNumber() {
		return this.pageNumber;
	}
	
	// publisher �Ӽ��� ��ȯ
	// @param	:	N/A
	// @return	:	(String) ���ǻ�� 
	public String getPublisher() {
		return this.publisher;
	}
}
