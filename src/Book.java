import java.util.Objects;

public class Book {
    private String bookTitle;
    private int yearOfPublication;
    private Author author;

    public  Book (String bookTitle, int yearOfPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublication == book.yearOfPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearOfPublication, author);
    }

    @Override
    public String toString() {
        return bookTitle + " " + yearOfPublication + " " + author;
    }
}
