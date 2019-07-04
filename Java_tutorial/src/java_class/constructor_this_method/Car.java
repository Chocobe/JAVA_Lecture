package java_class.constructor_this_method;

public class Car {
	String color;
	String gearType;
	int door;
	
	
	public Car() {}
	
	public Car(String _color, String _gear, int _door) {
		this.color = _color;
		this.gearType = _gear;
		this.door = _door;
	}
}
