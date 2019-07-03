package java_class.overloading;

public class Calc {
	public int add(int _lhs, int _rhs) {
		System.out.println("add(int _lhs, int _rhs) : ");
		return _lhs + _rhs;
	}
	
	public long add(int _lhs, long _rhs) {
		System.out.println("add(int _lhs, long _rhs) : ");
		return _lhs + _rhs;
	}
	
	public long add(long _lhs, long _rhs) {
		System.out.println("add(long _lhs, long _rhs) : ");
		return _lhs + _rhs;
	}
	
	public int add(int _lhs, int _mid, int _rhs) {
		System.out.println("add(int _lhs, int _mid, int _rhs : ");
		return _lhs + _mid + _rhs;
	}
}
