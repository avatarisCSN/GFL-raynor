package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите строку");

        String str = scan.nextLine();
        System.out.println(str.charAt(str.length()-1));



        scan.close();




    }
}