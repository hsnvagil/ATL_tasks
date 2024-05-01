package lesson_5;


public class Book implements IBook {
    private String title;
    private String author;
    private BookStatus status;


    Book(String title, String author, BookStatus status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public void borrowBook() {
        if (this.status == BookStatus.BORROWED) {
            throw new OutOfStockException("Book borrowed");
        }
        setStatus(BookStatus.BORROWED);
    }

    @Override
    public void returnBook() {
        setStatus(BookStatus.AVAILABLE);
    }
}
