package java_inheritance.person;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void set_weight(int _weight) {
		this.weight = _weight;
	}
	
	public int get_weight() {
		return this.weight;
	}
}
