package class_interface.interface_test_1;

public class Smart_phone_tester {
	public static void main(String[] args) {
		Smart_phone smart_phone = new Smart_phone();
		
		smart_phone.send_call();
		smart_phone.receive_call();
		smart_phone.send_message();
		smart_phone.receive_message();
		smart_phone.play();
		smart_phone.stop();
	}
}
