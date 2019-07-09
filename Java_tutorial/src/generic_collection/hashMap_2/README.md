# hashMap_2

``HashMap``객체에 ``Set``과 ``Iterator`` 사용하기

``HashMap``의 키값을 통해 실제 데이터를 받아 올 수 있기 때문에,

``HashMap``에 ``Iterator``를 사용하기 위해, ``Set``클래스를 거쳐야 한다.

---

``HashMap``객체의 메소드 중, ``keySet()``은 키값을 ``Set``객체로 반환하기 때문에,

``Set`` 참조변수를 통해 사용해야 한다.

---

반환받은 ``Set``객체에 ``Iterator``를 적용하면,

저장된 데이터를 순차적으로 접근할 수 있다.