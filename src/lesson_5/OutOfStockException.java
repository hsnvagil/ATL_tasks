package lesson_5;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String errorMessage) {
        super(errorMessage);
    }
}
