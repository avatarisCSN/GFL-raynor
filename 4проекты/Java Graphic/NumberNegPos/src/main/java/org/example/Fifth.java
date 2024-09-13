package org.example;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите слово 1");

        String str = scan.next();
        System.out.println("введите слово 2");
        String str2 = scan.next();
        if(str.length()>0 && str2.length()>0) {
            char c1 = str.charAt(0);

            char c2 = str2.charAt(0);
            if (c1 == c2) System.out.println("equal");
            else System.out.println("not equal");
        } else System.out.println("Слова не должны быть пустыми");
        scan.close();
    }
}