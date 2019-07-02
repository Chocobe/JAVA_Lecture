package java_class.tv;

public class TV_test_2 {
	public static void main(String[] args) {
		TV_lg tv_1 = new TV_lg();
		TV_lg tv_2 = new TV_lg();
		TV_lg tv_3 = tv_1;
		
		System.out.println("tv_1의 주소 : " + tv_1);
		System.out.println("tv_2의 주소 : " + tv_2);
		System.out.println("tv_3의 주소 : " + tv_3);
		
		print_line();
		
		System.out.println("tv_1의 채널 기본값 : " + tv_1.get_channel());
		System.out.println("tv_2의 채널 기본값 : " + tv_2.get_channel());
		
		print_line();
		
		tv_1.set_channel(7);
		tv_2.set_channel(50);
		
		System.out.println("tv_1의 현재 채널 : " + tv_1.get_channel());
		System.out.println("tv_2의 현재 채널 : " + tv_2.get_channel());
		
		print_line();
		
		tv_1.channel_up();
		tv_2.channel_down();
		
		System.out.println("tv_1의 현재 채널 : " + tv_1.get_channel());
		System.out.println("tv_2의 현재 채널: " + tv_2.get_channel());
	} //main
	
	
	// 라인 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public static void print_line() {
		System.out.println("--------------------------------");
	}
}
