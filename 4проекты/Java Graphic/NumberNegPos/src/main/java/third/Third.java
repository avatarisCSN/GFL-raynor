package third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите число 1:");
            int first = Math.abs(scan.nextInt());
            System.out.println("Введите число 2:");
            int second = Math.abs(scan.nextInt());

            if (first == 0) {
                System.out.println("Первое число не должно быть равно нулю.");
            } else {
                int ost = second % first;
                System.out.println(String.format("Остаток от деления: %d", ost));
            }
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите целое число.");
        } finally {
            scan.close();
        }
    }
}