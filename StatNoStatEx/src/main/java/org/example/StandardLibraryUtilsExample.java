package org.example;

import java.util.Arrays;

public class StandardLibraryUtilsExample {
    public static void main(String[] args) {
        // Массив чисел
        int[] numbers = {1, 2, 3, 4, 5};

        // Использование Arrays.stream для суммирования элементов массива
        int sum = Arrays.stream(numbers).sum();

        // Пример использования Math для других математических операций
        int max = Math.max(10, 20);
        double sqrt = Math.sqrt(16);

        System.out.println("Сумма массива: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Квадратный корень: " + sqrt);
    }
}
