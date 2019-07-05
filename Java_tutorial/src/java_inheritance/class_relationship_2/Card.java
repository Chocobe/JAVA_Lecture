package java_inheritance.class_relationship_2;

// 카드 정의 (카드 객체 52개를 만들기 위한 클래스)

public class Card {
	static final int KIND_MAX = 4;	// 카드 무늬 수
	static final int NUM_MAX = 13;	// 무늬당 카드 수
	
	static final int SPADE = 4;		// 스페이드 카드의 구분 값
	static final int DIAMOND = 3;	// 아이아몬드 카드 구분 값
	static final int HEART = 2;		// 하트 카드 구분 값
	static final int CLOVER = 1;	// 클로버 카드 구분 값
	
	int kind;		// 이 카드의 종류
	int number;		// 이 카드의 번호
	
	
	// 생성자
	public Card() {
		this(SPADE, 1);
	}
	
	public Card(int _kind, int _number) {
		this.kind = _kind;
		this.number = _number;
	}
	// 생성자
	
	
	// toString() 오버라이딩
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(String) 카드 [종류, 번호] 반환
	@Override
	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		
		return "[kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number) + "]";
	}
}
