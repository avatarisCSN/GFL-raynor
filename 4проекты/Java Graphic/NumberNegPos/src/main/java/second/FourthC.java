package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FourthC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число:");
            int number = scan.nextInt();
            int absNumber = Math.abs(number);
            int digitCount = (absNumber == 0) ? 1 : (int) Math.log10(absNumber) + 1; // Определение количества цифр
            System.out.println("Количество цифр: " + digitCount);
        } catch (InputMismatchException e) {
            System.out.println("Введено не число");
        } finally {
            scan.close();
        }
    }
}