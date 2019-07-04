package java_inheritance.down_casting;

public class Down_casting_test {
	public static void main(String[] args) {
		Person person = new Student();
		
		System.out.println(person.get_name());
		// 부모 클래스 형 이기 때문에, 자식 클래스의 메소드에 접근 불가
//		System.out.println(person.get_grade());
//		System.out.println(person.get_department());
		
		System.out.println("------------------");
		
		// down casting(다운 케스팅)
		System.out.println("다운 케스팅 테스트");
		Student student = (Student)person;
		System.out.println(student.get_name());
		System.out.println(student.get_grade());
		System.out.println(student.get_department());

		// 다운 케스팅의 조건은 업케스팅 된 객체만 가능하다.
//		Person person_2 = new Person();
//		Student student_2 = (Student)person_2;
//		System.out.println(student_2.get_name());
	}
}
