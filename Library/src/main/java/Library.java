import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> catalogue;
    private Integer capacity;
    private HashMap<String, Integer> genres;

    public Library(Integer capacity){
        this.catalogue = new ArrayList<>();
        this.capacity = capacity;
        this.genres = new HashMap<>();
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

    public HashMap getGenres(){

        HashMap<String, Integer> allGenres;
        allGenres = new HashMap<>();

        for (Book book : catalogue){
            Integer count = genres.get(book);
            if ( count == null ){
                allGenres.put(book.showGenre(), 1);
            }
            else {
                allGenres.put(book.showGenre(), count + 1);
            }
        }

        this.genres = allGenres;
        return genres;
    }

}

