package java_polymorphism.instanceof_test;

public class Instanceof_test {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.print("= new Person() 의 형변환 가능 타입 : ");
		print_instanceof(person);
		
		person = new Student();
		System.out.print("= new Student() 의 형변환 가능 타입 : ");
		print_instanceof(person);
		
		person = new Researcher();
		System.out.print("= new Researcher() 의 형변환 가능 타입 : ");
		print_instanceof(person);
		
		person = new Professor();
		System.out.print("= new Professor() 의 형변환 가능 타입 : ");
		print_instanceof(person);
	}
	
	
	public static void print_instanceof(Person _person) {
		if(_person instanceof Person) {
			System.out.print("\"Person\" ");
		}
		
		if(_person instanceof Student) {
			System.out.print("\"Student\" ");
		}
		
		if(_person instanceof Researcher) {
			System.out.print("\"Researcher\" ");
		}
		
		if(_person instanceof Professor) {
			System.out.print("\"Professor\" ");
		}
		
		System.out.println();
	}
}
