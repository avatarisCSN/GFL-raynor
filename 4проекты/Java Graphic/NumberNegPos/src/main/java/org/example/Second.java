package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");

            String str = scan.next();
            System.out.println("длина строки "+str.length());



            scan.close();




    }
}