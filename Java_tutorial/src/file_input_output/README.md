# file_input_output

* 데이터의 입력 / 출력은 무.조.건 아스키코드(ASCII code)다.

* 스트림 : 버퍼를 가지고 순차적(계속적)으로 이루어지는 입출력(흐름)을 말한다.

* 입력 스트림 : ``입력장치 <-> 응용프로그램``의 연결 객체

* 출력 스트림 : ``출력장치 <-> 응용프로그램``의 연결 객체

* 스트림은 단방향이기 때문에, 입출력을 동시에 가능한 스트림은 없다.

* 입출력 스트림 클래스는 이름에 ``stream`` 또는 ``reader/writer``가 접미사로 붙는다.
	
	* ``stream``이 접미사인 경우 : 바이트 스트림 : 1byte 전송방식
	* ``reader / writer``가 접미사인 경우 : 문자 스트림 : 2byte 전송방식
	
* 스트림은 단독으로 사용할 수 없다.

	* 원시 데이터(입력 데이터) -> 바이트 입력 스트림(System.in) 
		-> 문자 입력 스트림(InputStreamReader) -> 자바 응용 프로그램
		```java
		InputStreamReader reader = new InputStreamReader(System.in);
		int ch = reader.read();
		```
		
* 파일 전체 읽기
	* BOF(Beginning of File)부터 EOF(End of File) 까지 읽는 방식
	* ``FileReader``객체가 파일을 읽다가 EOF를 읽게 되면 문서의 끝을 알리는 ``-1``값을 반환해 준다.
	* 즉, ``FileReader`` 객체의 ``read()``메소드를 통해 파일을 읽다가 ``-1``값이 나오면 파일 내용이 끝난것이다.
	
