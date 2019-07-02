package java_class.tv;

public class TV_test_1 {
	public static void main(String[] args) {		
		TV_samsung tv_samsung = new TV_samsung();
		System.out.println("TV : " + tv_samsung.name);
		
		tv_samsung.channel = 7;
		
		tv_samsung.channel_down();
		System.out.println("현재 채널 : " + tv_samsung.channel);
		
		tv_samsung.channel_up();
		System.out.println("현재 채널 : " + tv_samsung.channel);
		
		tv_samsung.channel_up();
		tv_samsung.channel_up();
		tv_samsung.channel_up();
		System.out.println("현재 채널 : " + tv_samsung.channel);
		
		print_line();
		
		TV_lg tv_lg = new TV_lg();
		System.out.println("TV : " + tv_lg.get_name());
		
		tv_lg.set_channel(7);
		
		tv_lg.channel_down();
		System.out.println("현재 채널 : " + tv_lg.get_channel());
		
		tv_lg.channel_up();
		System.out.println("현재 채널 : " + tv_lg.get_channel());
		
		tv_lg.channel_up();
		tv_lg.channel_up();
		tv_lg.channel_up();
		System.out.println("현재 채널 : " + tv_lg.get_channel());
	}
	
	
	public static void print_line() {
		System.out.println("-----------------------------");
	}
}
