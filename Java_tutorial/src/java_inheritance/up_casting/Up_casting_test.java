package java_inheritance.up_casting;

public class Up_casting_test {
	public static void main(String[] args) {
		Student student = new Student();
		Person person = student;
		
		System.out.println("student 객체 접근 - name : " + student.get_name());
		System.out.println("student 객체 접근 - grade : " + student.get_grade());
		System.out.println("student 객체 접근 - department : " + student.get_department());
		
		System.out.println("------------------------");
		
		System.out.println("Student -> Person 으로 업케스팅 테스트");
		System.out.println(person.get_name());
		
		// 부모형으로 업케스팅 했기 때문에, 자식 클래스에 선언된  멤버변수/메소드 에 접근 불가
//		System.out.println(person.get_grade());
//		System.out.println(person.get_department());
	}
}
