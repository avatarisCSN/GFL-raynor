package SwitchTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите стороны треугольника: ");
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            System.out.println("Введите сторону 1: ");
            a = scan.nextInt();
            System.out.println("Введите сторону 2: ");
            b = scan.nextInt();
            System.out.println("Введите сторону 3: ");
            c = scan.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Ошибка: все стороны должны быть положительными числами");
                return; // Прерываем выполнение, если введено некорректное значение
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите корректные целые числа");
            return; // Прерываем выполнение, если введено некорректное значение
        } finally {
            scan.close();
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Не является треугольником");
        } else if (a == b && b == c) {
            System.out.println("Равносторонний треугольник");
        } else if (a == b || a == c || b == c) {
            System.out.println("Равнобедренный треугольник");
        } else {
            System.out.println("Разносторонний треугольник");
        }
    }
}