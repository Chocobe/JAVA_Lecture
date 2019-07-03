package nonogram;

public class Car {
	private String color;
	private String gear_type;
	private int door;
	
	
	public Car() {
		this("White", "auto", 4);
	}
	
	public Car(int _door) {
		this("White", "auto", _door);
	}
	
	public Car(String _color) {
		this(_color, "auto", 4);
	}
	
	public Car(String _color, String _gear_type) {
		this(_color, _gear_type, 4);
	}
	
	public Car(String _color, String _gear_type, int _door) {
		this.color = _color;
		this.gear_type = _gear_type;
		this.door = _door;
	}
	
	public void print_inform() {
		System.out.println(this.color + "색 " + this.gear_type + ", 문 " + this.door + "개");
	}
}
