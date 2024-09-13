package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        try {
            int number = scan.nextInt();
            if(number>=0)
            {
                System.out.println("positive");
            } else System.out.println("negative");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Ошибка: Введено не число.");
        }
        finally
        {
            scan.close();
        }



    }
}