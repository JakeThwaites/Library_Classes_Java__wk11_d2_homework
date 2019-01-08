import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalogue;
    private Integer capacity;

    public Library(Integer capacity){
        this.catalogue = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCount(){
        return catalogue.size();
    }

    public void addBook(Book book){
        if (stockCount() < capacity() ){
            catalogue.add(book);
        }

    }

    public int capacity(){
        return capacity;
    }

    public Book checkout(Book book){
        int bookRequested = catalogue.indexOf(book);
        return catalogue.remove(bookRequested);
    }
}

