package java_inheritance.class_relationship_2;

import java.util.Scanner;

public class Card_test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Deck deck = new Deck();
		Card cur_card = null;
		int picked_num = 0;
		
		boolean is_continue = true;
		
		while(is_continue) {
			System.out.print("뽑을 카드 번호를 입력하세요 : ");
			picked_num = scanner.nextInt();
			scanner.nextLine();	// 버퍼 비우기
			
			cur_card = deck.pick(picked_num);
			System.out.println(cur_card.toString());
			
			System.out.println("더 하시겠습니까? (y/n) : ");
			
			if(scanner.nextLine().equals("n")) {
				is_continue = false;
			}			
		}
		
		scanner.close();
	}
}
