# generic_collection

* [vector_1](#vector_1) - ``Vector`` 콜랙션 클래스 예제_1


* [vector_2](#vector_2) - ``Vector`` 콜랙션 클래스 예제_1


* [vector_3](#vector_3) - ``Vector`` 콜랙션 클래스 예제_1


* [arrayList](#arraylist) - ``ArrayList`` 콜랙션 클래스 예제_1


* [ieterator](#iterator) - ``Iterator``객체 생성하기 (저장된 데이터 순차 접근 방법) <몰랐던 부분>


* [hashMap_1](#hashmap_1) - ``hashMap`` 클래스 예제_1


* [hashMap_2](#hashmap_2) - ``HashMap``객체에 ``Set``과 ``Iterator`` 사용하기 <몰랐던 부분>


* [hashMap_3](#hashmap_3) - ``HashMap`` 연습 예제


* [collections_class](#collections_class) - 공부 필요


* [hashMap_4](#hashmap_4) - ``HashMap``객체에 ``Set``과 ``Iterator`` 사용하기 <몰랐던 부분>

---
---

### vector_1

콜렉션 Vector 클래스 사용하기 - 예제_1

:camel:[Top](#generic_collection)

---
---

### vector_2

콜렉션 Vector 클래스 사용하기 - 예제_2

``Vector``의 요소로 객체도 저장이 가능하다.

:camel:[Top](#generic_collection)

---
---

### vector_3

``Vector``를 매개변수로 갖는 메소드 만들기

:camel:[Top](#generic_collection)

---
---

### arrayList

``ArrayList<String> list = new ArrayList<String>()``

``Vector``와 사용법은 거의 유사하다.

:camel:[Top](#generic_collection)

---
---

### iterator
#### <몰랐던 부분>

```java
private class Itr implements Iterator<E> {
	Itr() {}
	
	// public boolean hasNext(){ 구현 }
	// public E next() { 구현 }
	// public void remove() { 구현 }
	// public void forEachRemaining(Consumer<? super E> consumer) { 구현 }
	// final void checkForComodification() { 구현 }
}
```

```java
public Iterator<E> iterator() {
    return new Itr();
}
```

위의 코드를 보면, ``Vector`` 객체의 메서드 중, ``iterator()``를 호출하게 되면,

``Iterator<E>`` 인터페이스를 구현한 ``Itr``클래스의 객체가 생성됨을 알 수 있다.

``Vector``클래스 자체에서 ``Iterator`` 인터페이스를 구현한 것이 아니라,

``Vector``클래스 내부의 클래스인 ``Itr``클래스에서 ``Iterator``인터페이스를 구현한 것을 알 수 있다.

때문에, ``Iterator``인터페이스의 추상 메서드인 ``remove()``, ``next()``, ``hasNext()`` 등의 메서드는

``Vector``클래스의 내부 클래스인 ``Itr``에서 구현하고, ``Itr``객체를 생성하는 ``iterator()`` 메소드를 사용하는 것이다.

---

요약하면,

``Iterator<E> iterator = vector.iterator()``의 실체는,

``Iterator`` 인터페이스를 구현한 ``Itr``클래스의 객체이다. (``Itr`` 클래스의 펙토리 메소드 패턴 == ``iterator()``)

:camel:[Top](#generic_collection)

---
---

### hashMap_1

``hashMap``은 ``key(키)``와 ``value(값)``의 쌍으로 이루어진 저장방식이다.

```java
HashMap<String, String> hash = new HashMap<String, String>();
```

의 형식으로 생성할 수 있다.

HashMap에 데이터를 저장하기 위해서 ``hash.put("키값", "데이터값");`` 형식을 사용하고,

데이터를 가져오기 위해서는 ``hash.get("키값");`` 형식으로 사용한다. 

:camel:[Top](#generic_collection)

---
---

### hashMap_2

``HashMap``객체에 ``Set``과 ``Iterator`` 사용하기

``HashMap``의 키값을 통해 실제 데이터를 받아 올 수 있기 때문에,

``HashMap``에 ``Iterator``를 사용하기 위해, ``Set``클래스를 거쳐야 한다.

---

``HashMap``객체의 메소드 중, ``keySet()``은 키값을 ``Set``객체로 반환하기 때문에,

``Set`` 참조변수를 통해 사용해야 한다.

---

반환받은 ``Set``객체에 ``Iterator``를 적용하면,

저장된 데이터를 순차적으로 접근할 수 있다.

:camel:[Top](#generic_collection)

---
---

### hashMap_3

``HashMap`` 연습 예제

:camel:[Top](#generic_collection)

---
---

### collections_class

공부 필요

:camel:[Top](#generic_collection)

---
---

### hashMap_4

``HashMap``객체에 ``Set``과 ``Iterator`` 사용하기 예제

hashMap_2의 예제

:camel:[Top](#generic_collection)