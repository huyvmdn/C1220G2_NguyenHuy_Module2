package commons;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
