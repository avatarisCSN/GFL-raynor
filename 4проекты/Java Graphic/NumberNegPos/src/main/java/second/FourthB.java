package second;

import java.util.InputMismatchException;
import java.util.Scanner;



public class FourthB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число:");
            int number = scan.nextInt();
            int numberAbs = Math.abs(number);
            int digitCount = (numberAbs == 0) ? 1 : 0; // Специальный случай для нуля
            while (numberAbs>0)
            {
                numberAbs /=10;
                digitCount++;
            }
            System.out.println("Количество цифр: " + digitCount);
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        } finally {
            scan.close();
        }
    }
}