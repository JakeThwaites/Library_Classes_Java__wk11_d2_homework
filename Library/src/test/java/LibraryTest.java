import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(3);
        book1 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book2 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book3 = new Book("HarryPotter2", "JK Rowling", "Horror");
    }

    @Test
    public void startsWithZeroBook(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBooks(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void libraryHasCapacity(){
        assertEquals(2, library.capacity());
    }

    @Test
    public void cannotAddBookIfCapacityFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.stockCount());
        library.addBook(book3);
        assertEquals(2, library.stockCount());
    }

    @Test
    public void canCheckoutBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.stockCount());
        library.checkout(book1);
        assertEquals(1, library.stockCount());
    }
//
//    @Test
//    public void storesBooksOfGenre(){
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        assertEquals(2, library.showBooksOfGenre("Fantasy"));
//    }

    @Test
    public void canShowAllGenres(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        assertEquals("{Horror=1, Fantasy=1}", library.getGenres());
    }
}
