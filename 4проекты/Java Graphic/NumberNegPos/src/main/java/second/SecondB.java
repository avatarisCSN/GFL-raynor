package second;


import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        try {
            int number = scan.nextInt();
            int lastDigit = Math.abs(number % 10);
            System.out.println("Последняя цифра числа: " + lastDigit);
        }
        catch (InputMismatchException e)
        {
            System.out.println("введено не число");
        }
        finally {
            scan.close();
        }
    }
}