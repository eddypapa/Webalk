package hu.iit.uni.miskolc.exception;

public class NewspaperNotFoundException extends Exception {
    public NewspaperNotFoundException() {
    }

    public NewspaperNotFoundException(String message) {
        super(message);
    }

    public NewspaperNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NewspaperNotFoundException(Throwable cause) {
        super(cause);
    }

    public NewspaperNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
