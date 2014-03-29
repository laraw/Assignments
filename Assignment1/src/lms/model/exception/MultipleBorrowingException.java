package lms.model.exception;

public class MultipleBorrowingException extends LMSException {

	public MultipleBorrowingException() {
		super("Default InsufficientCreditException");
	}

	public MultipleBorrowingException(String message) {
		super(message);
		
	}

}
