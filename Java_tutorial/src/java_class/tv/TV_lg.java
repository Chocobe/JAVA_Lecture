package java_class.tv;

public class TV_lg {
	private String name = "Lg";
	private String color;
	private int channel;
	private boolean power;
	
	
	// 전원 on/off 
	public void power() {
		this.power = !this.power;
	}
	
	// 채널 1 증가
	public void channel_up() {
		this.channel++;
	}
	
	// 채널 1 감소
	public void channel_down() {
		this.channel--;
	}
	
	// 채널 지정
	public void set_channel(int _channel) {
		this.channel = _channel;
	}
	
	// 채널 반환
	public int get_channel() {
		return this.channel;
	}
	
	// TV이름 반환
	public String get_name() {
		return this.name;
	}
	
	// color 설정
	public void set_color(String _color) {
		this.color = _color;
	}
	
	// color 반환
	public String get_color() {
		return this.color;
	}
}
