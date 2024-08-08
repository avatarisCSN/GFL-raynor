package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List tasks = new ArrayList();
        tasks.add("Hello");
        tasks.add("Hello1");
        tasks.add("Hello2");
        TaskManager ex1 = new TaskManager(tasks);
        System.out.println(ex1.toString());

    }
}