# iterator


```java
public class Vector<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, java.io.Serializable 
{
	// Vector 클래스의 내부 클래스인 Itr
	private class Itr implements Iterator<E> {
		Itr() {}
		
		// public boolean hasNext(){ 구현 }
		// public E next() { 구현 }
		// public void remove() { 구현 }
		// public void forEachRemaining(Consumer<? super E> consumer) { 구현 }
		// final void checkForComodification() { 구현 }
	}
	
	// Itr 클래스의 팩토리 메소드 패턴
	public Iterator<E> iterator() {
	    return new Itr();
	}
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