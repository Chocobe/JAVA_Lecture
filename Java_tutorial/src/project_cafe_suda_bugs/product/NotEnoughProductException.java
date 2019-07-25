package project_cafe_suda_bugs.product;

@SuppressWarnings("serial")
public class NotEnoughProductException extends RuntimeException {
	public NotEnoughProductException(String _reason) {
		super("Err] " + _reason);
	}
}
