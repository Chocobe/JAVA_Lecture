package java_polymorphism.ex_TV;

public class TV {
	private String brand_name;
	private boolean power;
	private int channel;
	private int volume;
	
	private static final int MAX_CHANNEL = 99;
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_VOLUME  = 12;
	private static final int MIN_VOLUME  = 1;
	
	// 생성자
	public TV() {
		this("미정");
	}
	
	public TV(String _brand_name) {
		this.brand_name = _brand_name;
		this.power = false;
		this.channel = MIN_CHANNEL;
		this.volume = MIN_VOLUME;
	}
	// 생성자
	
	
// 전원
	// 이름 설정
	// @author	:	Chocobe
	// @param	:	String _name : TV이름
	// @return	:	N/A
	public void set_brand_name(String _name) {
		this.brand_name = _name;
	}
	
	// 이름 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(String) TV이름 반환
	private String get_brand_name() {
		return this.brand_name;
	}
// 이름
	
	
// 전원
	// 전원 설정
	// @author	:	Chocobe
	// @param	:	boolean _power
	// @return	:	N/A
	public void set_power(boolean _power) {
		this.power = _power;
	}
	
	// 전원 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(boolean) 전원 상태값
	private boolean get_power() {
		return this.power;
	}
	
	// 전원 켜짐 여부
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(boolean) true  : 켜져 있음
	//			:			  false : 꺼짐
	private boolean is_TV_on() {
		if(this.power) {
			return true;	
		}
		
		System.out.println("TV가 꺼져있습니다.");
		return false;
	}
// 전원
	

// 채널
	// 채널 설정
	// @author	:	Chocobe
	// @param	:	int _channel : 설정할 채널값
	// @return	:	N/A
	public void set_channel(int _channel) {
		if(is_TV_on()) {
			valid_channel(_channel);
		}
	}
	
	// 채널 1증가
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void up_channel() {
		if(is_TV_on()) {
			valid_channel(this.channel + 1);
		}
	}
	
	// 채널 1감소
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void down_channel() {
		if(is_TV_on()) {
			valid_channel(this.channel - 1);
		}
	}
	
	// 채널 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private int get_channel() {
		return this.channel;
	}

	// 채널 유효성 검사
	// @author	:	Chocobe
	// @param	:	int _channel : 검사할 채널값
	// @return	:	N/A
	private void valid_channel(int _channel) {
		if(_channel < MIN_CHANNEL) {
			this.channel = MAX_CHANNEL;
			
		} else if(_channel > MAX_CHANNEL) {
			this.channel = MIN_CHANNEL;
			
		} else {
			this.channel = _channel;
		}
	}
// 채널
	

// 볼륨
	// 볼륨 설정
	// @author	:	Chocobe
	// @param	:	int _volume : 설정할 볼륨값
	// @return	:	N/A
	public void set_volume(int _volume) {
		if(is_TV_on()) {
			valid_volume(_volume);
		}
	}
	
	// 볼륨 1증가
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void up_volume() {
		if(is_TV_on()) {
			valid_volume(this.volume + 1);
		}
	}
	
	// 볼륨 1감소
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void down_volume() {
		if(is_TV_on()) {
			valid_volume(this.volume - 1);
		}
	}
	
	// 볼륨 반환
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(int) 현재 볼륨값
	private int get_volume() {
		return this.volume;
	}

	// 볼륨 유효성 검사
	// @author	:	Chocobe
	// @param	:	int _volume : 검사할 볼륨값
	// @return	:	N/A
	private void valid_volume(int _volume) {
		if(_volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
			
		} else if(_volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
			
		} else {
			this.volume = _volume;
		}
	}
// 볼륨
	

// 상태 출력
	// 전체 데이터 출력
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	public void print_inform() {
		if(is_TV_on()) {
			System.out.println(
					"이름 : " + get_brand_name() + "\n" +
					"전원 : " + get_power() + "\n" +
					"채널 : " + get_channel() + "\n" +
					"볼륨 : " + get_volume() + "\n");
			
		}
	}
// 상태 출력
}
