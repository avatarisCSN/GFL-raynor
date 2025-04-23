import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;

public class MyArrayTest {
    public static void main(String[] args) {
        ArrayDeque<String> array = new ArrayDeque<>(Arrays.asList("brr","sasa","sds"));
        array.addFirst("hello");
        System.out.println(array.size());
        for (String s:array)
        {
            System.out.println(s);
        }
        System.out.println("SPACE");
        array.addFirst("hello1");
        array.addFirst("hello2");
        System.out.println(array.size());
        for (String s:array)
        {
            System.out.println(s);
        }
        System.out.println("SPACE");
        array.removeFirst();
        array.removeLast();
        System.out.println(array.size());
        for (String s:array)
        {
            System.out.println(s);
        }
        String element = array.element();

    }
}
