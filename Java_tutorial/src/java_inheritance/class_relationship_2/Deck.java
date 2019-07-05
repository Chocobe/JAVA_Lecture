package java_inheritance.class_relationship_2;

// Deck : 카드 한벌을 의미한다.

public class Deck {
	final int CARD_NUM = 52;
	Card[] card_arr = new Card[CARD_NUM];
	
	public Deck() {
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			for(int n = 0; n < Card.NUM_MAX; n++) {
				this.card_arr[i++] = new Card(k, n);
			}
		}
		
		this.shuffle();
	}
	
	
	// 카드 섞기
	private void shuffle() {		
		for(int i = 0; i < this.card_arr.length; i++) {
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = this.card_arr[i];
			this.card_arr[i] = this.card_arr[r];
			this.card_arr[r] = temp;
		}
	}
	
	
	// 임의 카드 뽑기
	public Card pick() {
		int idx = (int)(Math.random() * CARD_NUM);
		return this.pick(idx);
	}
	
	// 지정한 카드 뽑기
	public Card pick(int _num) {
		if(_num < CARD_NUM) {
			return this.card_arr[_num];
			
		} else {
			System.out.println("유효한 카드 번호가 아닙니다.");
			return pick();
		}
	}
}
