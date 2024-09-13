package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FifthB {
    public static int getFirstDigit(int number) {
        number = Math.abs(number);
        while (number >= 10) {  // Пока число не станет однозначным
            number /= 10;       // Делим число на 10
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Введите число1");
            int number1 = getFirstDigit(scan.nextInt());
            System.out.println("Введите число2");
            int number2 = getFirstDigit(scan.nextInt());
            System.out.println(number1==number2);
        } catch(InputMismatchException e)
        {
            System.out.println("Введено не число");
        }
        finally{
            scan.close();
        }
    }
}


