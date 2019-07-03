package java_class.save_time;

public class Time {
	private String day_night;
	private int hour;
	private int origin_hour;
	private int minute;
	private float second;
	
	
	// 시간 setter
	public void set_hour(int _hour) {
		if(_hour >= 24) {
			this.hour = _hour % 24;
			
		} else {
			this.hour = _hour;
		}
		
		this.day_night = ((this.hour % 12) == 0)  ? "오전" : "오후";
		
		this.origin_hour = this.hour;
		this.hour %= 12;
	}
	
	// 시간 getter
	public int get_hour() {
		return this.hour;
	}
	
	
	// 분 setter
	public void set_minute(int _minute) {
		if(_minute >= 60) {
			this.minute = _minute % 60;
			
		} else {
			this.minute = _minute;
		}
	}
	
	// 분 getter
	public int get_minute() {
		return this.minute;
	}
	
	
	// 초 setter
	public void set_second(float _second) {
		if(_second >= 60F) {
			this.second = _second % 60;
			
		} else {
			this.second = _second;
		}
	}
	
	// 초 getter
	public float get_second() {
		return this.second;
	}
	
	// 시간 입력 통합 메소드
	public void set_time(int _hour, int _minute, float _second) {
		set_hour(_hour);
		set_minute(_minute);
		set_second(_second);
	}
	
	
	// 입력 시간 출력
	public void print_time() {
		System.out.print("현재 시각 : ");
		System.out.print(this.day_night + " " + get_hour() + "시 " + get_minute() + "분 " + get_second() + "초 입니다.\n");
	}
	
	// 입력 시간 출력 - toString() 오버라이딩 이용
	@Override
	public String toString() {
		return "현재 시각 : " + this.day_night + " " + get_hour() + "시 " + get_minute() + "분 " + get_second() + "초 입니다.\n";
	}
	
	public String print_time_2() {
		return String.format("%02d:%02d:%.2f %s",
				(hour == 0 || hour == 12) ? 12 : (this.origin_hour % 12),
				minute, second, (this.origin_hour < 12) ? "Am" : "Pm");
	}
}
