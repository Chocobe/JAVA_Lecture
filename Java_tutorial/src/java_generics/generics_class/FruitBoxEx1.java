package java_generics.generics_class;

import java.util.ArrayList;

class Fruit {
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit {
	public String toString() { return "Apple"; }
}

class Grape extends Fruit {
	public String toString() { return "Grape"; }
}

class Toy {
	public String toString() { return "Toy"; }
}


class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T _item) {
		list.add(_item);
	}
	
	T get(int _num) {
		return list.get(_num);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}


public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		// 객체 생성 시, 타입변수가 다르면 에러
		// Box<Grape> grapeBox = new Box<Fruit>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		// 에러. Toy는 Apple타입과 상속관계가 아니다.
		// appleBox.add(new Toy());
		
		toyBox.add(new Toy());
		
		// Apple은 Toy타입과 상속관계가 아니다.
		// toyBox.add(new Apple());
		
		System.out.println(fruitBox.toString());
		System.out.println(appleBox.toString());
		System.out.println(toyBox.toString());
	}
}
