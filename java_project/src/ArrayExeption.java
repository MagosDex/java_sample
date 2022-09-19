public class ArrayExeption extends Exception {
    public ArrayExeption() {
    }

    public ArrayExeption(String message) {
        super(message);
    }

    public ArrayExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayExeption(Throwable cause) {
        super(cause);
    }

    public ArrayExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
