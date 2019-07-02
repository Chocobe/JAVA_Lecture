package java_class.tv;

public class TV_samsung {
	String name = "Samsung";
	String color;
	boolean power;
	int channel;
	
	
	public void power() {
		this.power = !this.power;
	}
	
	public void channel_up() {
		this.channel++;
	}
	
	public void channel_down() {
		this.channel--;
	}
}
