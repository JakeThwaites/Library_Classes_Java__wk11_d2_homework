import java.lang.reflect.Array;
import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> books;

    public Borrower(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public int booksCheckedOut(){
        return books.size();
    }

    public void checkout(Book book){
        books.add(book);
    }


}
