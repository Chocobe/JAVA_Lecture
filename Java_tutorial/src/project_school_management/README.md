# 학교 관리 시스템 만들기

구조 설계시, 액셀을 이용하여, 해당 객체들의 속성, 기능들을 나열하자.

공통부분은 클래스로,

유사한 부분은 추상 메소드로,

클래스 + 추상메소드 = 추상 클래스 (추상클래스가 싫다면, 클래스 따로 인터페이스 따로 만들면 된다.)

---
---

* 학생

	* 이름을 입력하세요 :
	* 주소를 입력하세요 :
	* 학번을 입력하세요 :
	* 학급을 입력하세요 :
	
* 강사정보

	* 이름을 입력하세요 :
	* 주소를 입력하세요 :
	* 교번을 입력하세요 :
	* 과목을 입력하세요 :
	
* 직원정보

	* 이름을 입력하세요 :
	* 주소를 입력하세요 :
	* 사번을 입력하세요 :
	* 부서를 입력하세요 :
	
---

* 공통부분을 클래스로 만들자.

	* 이름과 주소가 중복된다. (사람 클래스를 상속 받게 하자 -> 사람 클래스 도출)
		
		* 학생은 사람이다. 
		* 교사는 사람이다. 
		* 직원은 사람이다.

	* 학번, 교번, 사번은 완전히 동일하진 않지만, ID로써 같은 역할을 가진다. (추상 메소드면 해결된다.)
		* 사람 클래스 + 추상메소드(ID) = 추상 클래스 :
			
			``class Student extends Person``
			
			``class Teacher extends Person``
			
			``class Staff extends Person``
			
		* 인터페이스 생성(ID)
			
			``class Student extends Person implement ID``
			
			``class Teacher extends Person implement ID``
			
			``class Staff extends Person implement ID`` 
		
		



