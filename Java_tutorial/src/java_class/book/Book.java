package java_class.book;

public class Book {
	// 책의 속성
	private String author;
	private String title;
	private int price;
	private int pageNumber;
	private String publisher;
	
	// author 속성값 대입
	// @param	:	String _author : 저자 이름
	// @return	:	N/A
	public void setAuthor(String _author) {
		this.author = _author;
	}

	// title 속성값 대입
	// @param	:	String _title : 책 제목
	// @return	:	N/A
	public void setTitle(String _title) {
		this.title = _title;
	}
	
	// price 속성값 대입
	// @param	:	int _price : 가격
	// @return	:	N/A
	public void setPrice(int _price) {
		this.price = _price;
	}
	
	// pageNumber 속성값 대입
	// @param	:	int _pageNumber : 총 페이지 수
	// @return	:	N/A
	public void setPageNumber(int _pageNumber) {
		this.pageNumber = _pageNumber;
	}
	
	// publisher 속성값 대입
	// @param	:	String _publisher : 출판사명
	// @return	:	N/A
	public void setPublisher(String _publisher) {
		this.publisher = _publisher;
	}
	
	
	// author 속성값 반환
	// @param	:	N/A
	// @return	:	(String) 저자 이름
	public String getAuthor() {
		return this.author;
	}
	
	// title 속성값 반환
	// @param	:	N/A
	// @return	:	(String) 책 이름
	public String getTitle() {
		return this.title;
	}
	
	// price 속성값 반환
	// @param	:	N/A
	// @return	:	(int) 가격
	public int getPrice() {
		return this.price;
	}
	
	// pageNumber 속성값 반환
	// @param	:	N/A
	// @return	:	(int) 페이지 총 수
	public int getPageNumber() {
		return this.pageNumber;
	}
	
	// publisher 속성값 반환
	// @param	:	N/A
	// @return	:	(String) 출판사명 
	public String getPublisher() {
		return this.publisher;
	}
}
