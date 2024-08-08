package org.example;

public class MathUtils {
    // Статический метод для вычисления суммы массива чисел
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Вызов статического метода утилитарного класса
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = MathUtils.sumArray(numbers);

        System.out.println("Сумма массива: " + sum);
    }
}