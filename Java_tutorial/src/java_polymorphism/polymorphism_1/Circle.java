package java_polymorphism.polymorphism_1;

public class Circle extends Shape {
	protected String name;
	
	@Override
	public void draw() {
		this.name = "Circle";
		super.name = "Shape";
		super.draw();
		System.out.println(this.name);
	}
}
