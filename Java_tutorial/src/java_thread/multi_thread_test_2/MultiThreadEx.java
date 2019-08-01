package java_thread.multi_thread_test_2;

public class MultiThreadEx {
	public static void main(String[] args) {
		Thread horse_1 = new Thread(new Horse("Chocobe"));
		Thread horse_2 = new Thread(new Horse("흰둥이"));
		Thread horse_3 = new Thread(new Horse("피카츄"));
		Thread horse_4 = new Thread(new Horse("고라파덕"));
		Thread horse_5 = new Thread(new Horse("달리는게 잴 쉬웠어요"));
		
		horse_1.start();
		horse_2.start();
		horse_3.start();
		horse_4.start();
		horse_5.start();
	}
}
