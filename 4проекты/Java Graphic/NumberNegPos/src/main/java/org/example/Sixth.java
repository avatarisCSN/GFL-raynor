package org.example;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите слово ");

        String str = scan.next();
        if(str.charAt(str.length()-1)=='ь') System.out.println(str.charAt(str.length()-2));
        else System.out.println(str.charAt(str.length()-1));


        scan.close();
    }
}