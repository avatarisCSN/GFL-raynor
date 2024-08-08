package org.example;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        int fact=1;
        int number;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите число от 2 до 20:");
            number = scan.nextInt();

            if (number < 2 || number > 20) {
                System.out.println("Число должно быть от 2 до 20. Попробуйте еще раз.");
            }
        } while (number < 2 || number > 20);



        for (int i=1;i<number;i++)
        {
        fact *=(i+1);
        }
        System.out.println(fact);
    }

}
