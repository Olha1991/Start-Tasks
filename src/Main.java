public class Main {
    public static void main(String[] args) {

        //Task
        //Write a small library reference book that stores information about books.
        //1. Create a Book class that will contain data about the title, author, and year of publication of the book. Make
        //sure that the fields of the Book class are of the correct types: String, Author, and int.
        //2. Create an Author class that contains data about the author's first and last name.
        //3. Write constructors for both classes that populate all the fields.
        //4. Create getters for all the author fields and all the book fields.
        //5. Create a setter for the "Year of Publication" field of the book.
        //6. In the main method, create several Book objects (two is enough) and several Author objects (also two are enough)
        //and initialize them. Remember that authors are required, and books cannot be created without authors.
        //The main method should not be in the Book and Author classes.
        //Create a separate class to run the application and declare the main method in it.
        //7. In the same main method, change the publication year of one of the books using a setter.

        Book book1 = new Book("Misery", 1987);
        Author author1 = new Author ("Stephen ", "King");
        System.out.println("book1 - " + book1.getBookTitle() + " " + book1.getYearOfPublication() + "; author1 - " +
                author1.getFirstName()+ " " + author1.getLastName());
        Book book2 = new Book("Pride and Prejudice", 1813);
        Author author2 = new Author ("Jane ", "Austen");
        System.out.println("book2 - " + book2.getBookTitle() + book2.getYearOfPublication() + "; author2 - " +
                author2.getFirstName() + " " + author2.getLastName());

        book1.setYearOfPublication(1989);
        System.out.println("book1 - " + book1.getBookTitle() + " " + book1.getYearOfPublication() + "; author1 - " +
                author1.getFirstName()+ " " + author1.getLastName());
    }
}