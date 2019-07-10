package class_interface.abstract_test_1;

public class Good_calc extends Calculator {
	@Override
	public int add(int _lhs, int _rhs) {
		return _lhs + _rhs;
	}
	
	@Override
	public int subtract(int _lhs, int _rhs) {
		return _lhs - _rhs;
	}
	
	@Override
	public double average(int[] _arr) {
		double total_sum = 0;
		
		for(int i = 0; i < _arr.length; i++) {
			total_sum += _arr[i];
		}
		
		return total_sum / _arr.length;
	}
}
