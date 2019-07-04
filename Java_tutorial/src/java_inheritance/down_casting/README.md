# down_casting

업 케스팅과 반대방향 형변환

다운 케스팅은 부모 클래스 형인 객체를 자식 클래스 형으로 형변환 하는 것을 말한다.

중요한 조건이 있는데,

다운 케스팅 하려는 객체는 **업케스팅 됬었던 객체만 가능**하다는 점이다.

(원래 부모 클래스의 형으로 생성된 객체는 다운 케스팅 자체가 안된다는 점이다.)

```java
Person person = new Student();
Student student = (Student)person;
```

위의 다운 케스팅은 정상 동작이 된다.

하지만, 업케스팅 된 것이 아니라 원래 부모 클래스 형인 객체는 다운 케스팅이 불가능 하다.

```java
Person person = new Person();
Student student = (Student)person;
```

위의 코드는 불가능한 코드이다.