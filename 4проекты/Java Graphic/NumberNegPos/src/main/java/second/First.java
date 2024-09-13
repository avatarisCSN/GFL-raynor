package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        try {
            int number = scan.nextInt();
            String numberStr = Integer.toString(Math.abs(number));
            char symbol = numberStr.charAt(0);
            System.out.println("Первая цифра числа: " + symbol);
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
