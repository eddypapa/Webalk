package hu.iit.uni.miskolc.exception;

public class InvalidIssueException extends Exception {
    public InvalidIssueException() {
    }

    public InvalidIssueException(String message) {
        super(message);
    }

    public InvalidIssueException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidIssueException(Throwable cause) {
        super(cause);
    }

    public InvalidIssueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
