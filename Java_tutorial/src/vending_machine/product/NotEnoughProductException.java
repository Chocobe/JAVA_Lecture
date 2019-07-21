package vending_machine.product;

@SuppressWarnings("serial")
public class NotEnoughProductException extends RuntimeException {
	public NotEnoughProductException(String _reason) {
		super("Err] " + _reason);
	}
}
