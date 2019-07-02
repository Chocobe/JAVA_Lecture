# Nonogram - 네모네모 로직

미지 영역 : □

정답 영역 : ■

제거 영역 : V

오답 영역 : X

---

* [New_function_1](*new_function_1) - 절대경로값 얻기

---
---

# New_function_1

* 현재 프로젝트의 절대경로값 얻기

필요 클래스 : ``Path``, ``Paths``

경로는 상대경로와 절대경로가 있는데, 절대경로를 사용하고자 한다.

```java
Path file_path = Paths.get("");
String absolute_directory = file_path.getAbsolutePath().toString();
System.out.println(absolute_directory);
```

``Paths.get("")``을 사용하여 ``Path``객체를 얻고,

``Path``객체의 ``getAbsolutePate()``메소드를 통해 절대 경로를 얻을 수 있다.

``getAbsolutePath()`` 메소드는 ``Path``객체를 반환하기 때문에, 

``toString()``메소드를 사용하여 ``String``형으로 형변환을 하게 되면, 

``String``형인 절대경로값을 얻을 수 있다.

:camel:[Top](#nonogram)

---
---

# New_function_2

* ``.txt``파일 읽기

필요 클래스 : ``File``, ``FileReader``, ``BufferedReader``

파일을 읽기 위해서는 다음의 준비가 필요하다.

1. ``String``형 파일경로

1. ``String 경로``를 가진 ``File``객체

1. ``File 객체``를 가진 ``FileReader`` 객체

1. ``FileReader 객체``를 가진 ``BufferedReader``

최종적으로 ``.txt``파일의 데이터를 반환해 주는 것은 ``BufferedReader.readLine()`` 메소드를 통해 얻을 수 있다.