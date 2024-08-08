package org.example;

public class ArraySumCalculator {
    // Нестатический метод для вычисления суммы массива чисел
    public int sumArray(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Создание объекта класса
        ArraySumCalculator object = new ArraySumCalculator();

        // Вызов нестатического метода
        int[] array = {1, 2, 3, 4, 5};
        int result = object.sumArray(array);

        System.out.println("Сумма массива: " + result);
    }
}