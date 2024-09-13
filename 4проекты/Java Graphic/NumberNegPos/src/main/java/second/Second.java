package second;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        try {
            int number = scan.nextInt();
            String numberStr = Integer.toString(Math.abs(number));
            char symbol = numberStr.charAt(numberStr.length()-1);
            System.out.println("Последняя цифра числа: " + symbol);
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
