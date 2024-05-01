package lesson_5;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book("42", "Agil", BookStatus.AVAILABLE);
        book.borrowBook();
        book.borrowBook();

    }
}