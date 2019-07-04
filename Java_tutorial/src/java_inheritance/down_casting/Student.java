package java_inheritance.down_casting;

public class Student extends Person {
	private String grade;
	private String department;
	
	public Student() {
		this("초코비");
	}
	
	public Student(String _name) {
		this(_name, "F", "백엔드");
	}
	
	public Student(String _name, String _grade) {
		this(_name, _grade, "백엔드");
	}
	
	public Student(String _name, String _grade, String _department) {
		super(_name);
		this.grade = _grade;
		this.department = _department;
	}
	
	public void set_grade(String _grade) {
		this.grade = _grade;
	}
	
	public String get_grade() {
		return this.grade;
	}
	
	public void set_department(String _department) {
		this.department = _department;
	}
	
	public String get_department() {
		return this.department;
	}
}
