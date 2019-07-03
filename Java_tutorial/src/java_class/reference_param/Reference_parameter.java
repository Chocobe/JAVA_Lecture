package java_class.reference_param;

class Data {
	int x;
}

public class Reference_parameter {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 1000;
		
		System.out.println("main() x = " + d.x);
		
		changed(d);
		System.out.println("변경 후 = " + d.x);
	}
	
	
	public static void changed(Data _d) {
		_d.x = 10;
	}
	
	
	public static Data copy(Data _d) {
		Data temp = new Data();
		temp.x = _d.x;
		
		return temp;
	}
}
