package project_convenience_store.product;

@SuppressWarnings("serial")
public class NotEnoughProductException extends RuntimeException {
	public NotEnoughProductException(String _reason) {
		super("Err] " + _reason);
	}
}
