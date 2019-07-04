package java_inheritance.down_casting;

public class Person {
	private String name;
	
	public Person() {
		this("홍길동");
	}
	
	public Person(String _name) {
		this.name = _name;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public void set_name(String _name) {
		this.name = _name;
	}
}
