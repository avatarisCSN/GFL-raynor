import java.util.*;

public class someHashSet {

    Book book1 = new Book("poter", "kipling", 500);
    Book book2 = new Book("homo", "burkas", 699);
    Book book3 = new Book("sama", "sapkas", 799);
    Book book4 = new Book("krimo", "simkoko", 476);
    Map<String, Book> books = Map.of("poter",book1,"homo",book2,"sama",book3, "krimo", book4);
    HashMap<String, Book> books1 = new HashMap<>(books);
    public static void main(String[] args) {
        someHashSet some = new someHashSet();
        Set<String> set = some.books1.keySet();
        for(String s: set){
            System.out.println(s);
        }
        List<Book> booksArray = new ArrayList<>(some.books1.values());
        System.out.println("SPACE");
        for(Book b:booksArray){
            System.out.println(b.getAuthor()+" "+b.getCost());
        }
        System.out.println("SPACE");
        for(Map.Entry<String, Book> s:some.books1.entrySet()){
            System.out.println(s.getKey()+" - "+s.getValue());
        }
    }
}
