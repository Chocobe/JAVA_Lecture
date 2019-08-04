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
		
1. URL 설정하기

	* URL (Uniform Resource Locator) : 자원 위치 지정자
		
			

:camel:[Top](#database_jdbc)

---
---

### select_test

JDBC를 이용하여 ``SELECT``쿼리 사용하기

:camel:[Top](#database_jdbc)