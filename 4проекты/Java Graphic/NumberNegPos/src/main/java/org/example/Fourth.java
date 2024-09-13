package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        try {
            int number = scan.nextInt();
            if(number%2==0)
            {
                System.out.println("Четное");
            } else System.out.println("Нечетное");
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