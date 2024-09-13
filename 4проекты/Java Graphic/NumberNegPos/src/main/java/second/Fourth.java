package second;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число:");
            int number = scan.nextInt();
            String string = Integer.toString(number);
            int digitCount = string.length();
            System.out.println("Количество цифр: " + digitCount);
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        } finally {
            scan.close();
        }
    }
}