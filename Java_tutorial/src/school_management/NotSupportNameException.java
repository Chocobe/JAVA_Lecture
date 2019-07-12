package school_management;

@SuppressWarnings("serial")
public class NotSupportNameException extends Exception {
	public NotSupportNameException() {
		super("지원되지 않는 이름입니다.");
	}
	
	public NotSupportNameException(String _message) {
		super(_message);
	}
}
