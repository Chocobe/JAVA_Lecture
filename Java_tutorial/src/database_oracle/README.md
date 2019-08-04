# Database_JDBC

1. Package Explorer의 최상위 폴더에서 우클릭

1. ``Build Path`` -> ``Configure Build Path`` 들어간다.

1. ``Libraries`` -> ``Add extenal JARs``

1. Oracle Database가 설치된 곳의 ``ojdbc6.jar``파일을 열고, 등록하면 완료된다.

	``(C:\app\user\product\11.2.0\dbhome_1\jdbc\lib\ojdbc6.jar)``
	
---
---

* [connection_test](#connection_test)


* [select_test](#select_test)

---
---

### connection_test

JDBC를 이용하여 database에 접속 하기

1. JDBC 드라이버 객체 생성하기(구동하기)
	
	```java
	String driver_path = "oracle.jdbc.driver.OracleDriver;
	forName(driver_path);
	```
		
	JDBC 드라이버가 구동된다.
	(JDBC 드라이버가 구동 되어야 자바를 이용하여 DB에 접속하여 사용할 수 있다)
		
1. URL 정의하기(설정하기)

	* URL (Uniform Resource Locator) : 자원 위치 지정자
		
		컴퓨터 네트워크 상에서 특정 정보자원에 대한 종류와 위치 정보
	
	* jdbc:oracle:thin:@호스트명:포트번호:SID(DB 이름)
	
1. ``Connection``객체 생성하기.

	* 실제로 DB에 접속하는 과정으로, Connection 클래스의 객체를 생성하여 접속할 수 있다.
	
	* ``Connection``객체는 생성자를 호출하여 생성하지 않고, ``DriverManager``클래스의 ``getConnection(url, id, password)`` 메소드를 통해 생성한다. (정적 펙토리 메소드 패턴)
	
	```java
	Connection c = DriverManager(url, id, password);
	```
	
1. JDBC 드라이버 구동, ``Connection``객체 생성, 이 두 과정을 통해 DB에 접속상태가 된다.

:camel:[Top](#database_jdbc)

---
---

### select_test

JDBC를 이용하여 ``SELECT``쿼리 사용하기

DB에 쿼리를 정송하여 결과를 읽어오기 위해서는 ``Statement``객체와 ``ResultSet``객체가 필요하다.

1. 쿼리를 전송하는 객체인 ``Statement`` 객체 생성하기

	```java
	Connection c = DriverManager(url, id, password);
	Statement st = c.createStatement();
	```
	
1. 수행할 쿼리 전송하고 결과 데이터 가져오기

	```java
	ResultSet rs = st.executeQuery("쿼리문");
	```
	
	``st.executeQuery("쿼리문")``을 수행하면, 해당 쿼리가 전송되고, ``SELECT``문의 결과값을 반환한다.
	
	이 반환값은 ``ResultSet``타입이기 때문에, 위와 같이 반환값을 가져온다.
	
1. 가져온 결과 출력하기

	* ``ResultSet rs``은 DB에서 결과 테이블을 CMD에서 접근하는 방식과 동일하다.
	
	* ``rs.next()``메소드를 통해 커서를 다음 행으로 이동하여, 해당 행의 열 이름을 통해 값을 가져온다.
	
	* 주의할 점은, 쿼리의 결과를 받은 직후에는 커서가 첫번째 행이 아닌 시작점 행에 있다.
	
	* 즉, 데이터를 가리키는 것이 아니라 첫 행 이전을 가르키기 때문에, ``rs.next()``메소드로 커서를 첫 행으로 이동시킨 후, 데이터에 접근해야 한다는 것이다.
	
	* 각 열의 데이터를 읽을 경우, DB상의 자료형과 일치하는 JAVA 자료형을 사용해야 한다.
	
	```java
	int empno = rs.getInt("EMPNO");
	String ename = rs.getString("ENAME");
	```

:camel:[Top](#database_jdbc)