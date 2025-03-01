public class Book {
    private String bookTitle;
    private int yearOfPublication;

    public  Book (String bookTitle, int yearOfPublication) {
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }
    public String getBookTitle() {
        return this.bookTitle;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public int setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        return yearOfPublication;
    }
}
