package java_class.save_time;

public class Time_test {
	public static void main(String[] args) {
		Time time_1 = new Time();
		Time time_2 = new Time();
		
		final int MY_HOUR = 25;
		final int MY_MINUTE = 55;
		final float MY_SECOND = 68F;
		
		time_1.set_hour(MY_HOUR);
		time_1.set_minute(MY_MINUTE);
		time_1.set_second(MY_SECOND);
		
		time_1.print_time();
		System.out.println(time_1);
		System.out.println(time_1.print_time_2());
		
		print_line();
		
		time_2.set_time(MY_HOUR, MY_MINUTE, MY_SECOND);
		System.out.println(time_2.print_time_2());
	}
	
	
	public static void print_line() {
		System.out.println("--------------------------------");
	}
}
