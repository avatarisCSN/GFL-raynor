package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();

        // Неправильное использование итератора
        // Сначала вызываем next(), а затем remove()
        // Это вызовет IllegalStateException
        iterator.next();
        iterator.remove();  // Works fine
        iterator.remove();  // Throws IllegalStateException because remove() is called twice without next()
    }
}