import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        borrower = new Borrower("Jake");
    }

    @Test
    public void borrowerStartsWithNoBooks(){
        assertEquals(0, borrower.booksCheckedOut());
    }

    @Test
    public void canCheckoutBook(){
        assertEquals(0, borrower.booksCheckedOut());
        library.addBook(book1);
        assertEquals(0, borrower.booksCheckedOut());
        borrower.checkout(book1);
        assertEquals(1, borrower.booksCheckedOut());
    }
}
