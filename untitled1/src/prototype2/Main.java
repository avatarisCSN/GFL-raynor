package prototype2;

public class Main {
public static void main(String[] args) {
    Cloner clonik = (Cloner) Cache.accountCacheMap.get("IMBA").clone();
    clonik.accountType();
    System.out.println( clonik.getName());
    clonik.setName("Ursa");
    System.out.println( clonik.getName());
    System.out.println(Cache.accountCacheMap.get("IMBA").getName());



}
}
