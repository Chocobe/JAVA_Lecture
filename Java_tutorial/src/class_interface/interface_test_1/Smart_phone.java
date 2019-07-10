package class_interface.interface_test_1;

public class Smart_phone extends PDA implements IPhone, IMobile_phone, IMp3 {

// IMp3------------------------------------------------------------
	@Override
	public void play() {
		System.out.println("음악 재생");
	}

	@Override
	public void stop() {
		System.out.println("재생 중지");
	}
// IMp3------------------------------------------------------------
	
	
	
// IMobile_phone---------------------------------------------------
	@Override
	public void send_message() {
		System.out.println("메시지 보내기");
	}

	@Override
	public void receive_message() {
		System.out.println("메시지 받기");
	}
// IMobile_phone---------------------------------------------------
	
	
	
// IPhone----------------------------------------------------------
	@Override
	public void send_call() {
		System.out.println("전화 걸기");
	}

	@Override
	public void receive_call() {
		System.out.println("전화 받기");
	}
// IPhone----------------------------------------------------------
}
