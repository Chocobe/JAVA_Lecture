# HashMap_1

키와 값을 갖는 콜랙션 클래스 이다.

값을 찾기 위해서는 키 값을 이용하는 것이 다른 콜랙션과 차이점이다.

즉, 키 값이 찾고자 하는 인덱스값이 되는 것이다.

---

``hashMap``은 ``key(키)``와 ``value(값)``의 쌍으로 이루어진 저장방식이다.

```java
HashMap<String, String> hash = new HashMap<String, String>();
```

의 형식으로 생성할 수 있다.

HashMap에 데이터를 저장하기 위해서 ``hash.put("키값", "데이터값");`` 형식을 사용하고,

데이터를 가져오기 위해서는 ``hash.get("키값");`` 형식으로 사용한다. 