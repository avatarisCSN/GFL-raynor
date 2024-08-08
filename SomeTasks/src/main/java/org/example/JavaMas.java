package org.example;
import java.util.Random;
import java.util.Scanner;

public class JavaMas {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        boolean validInput = false;

        // Запрос на количество элементов в массиве с проверкой на ошибки
        while (!validInput) {
            try {
                System.out.println("Введите количество элементов в массиве:");
                n = Integer.parseInt(scan.nextLine());
                if (n <= 0) {
                    throw new IllegalArgumentException("Количествшаболдао элементов должно быть положительным числом.");
                }
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите корректное число.");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка:212121 " + e.getMessage());
            }
        }

        int[] array = new int[n];

        // Заполнение массива случайными числами от 0 до 100
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101); // Число от 0 до 100 включительно
        }

        // Вычисление суммы элементов массива
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        // Вывод массива и суммы его элементов
        System.out.println("Элементы массива:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nСумма элементов массива равна: " + sum);
    }
}

