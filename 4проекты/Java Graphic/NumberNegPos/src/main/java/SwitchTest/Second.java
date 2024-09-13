package SwitchTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество сторон: ");
        byte number = 1;
        try {
            number = scan.nextByte();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите число от 3 до 8");
            return; // Прерываем выполнение, если введено некорректное значение
        } finally {
            scan.close();
        }

        String figureName;
        switch (number) {
            case 3:
                figureName = "Треугольник";
                break;
            case 4:
                figureName = "Четырёхугольник";
                break;
            case 5:
                figureName = "Пятиугольник";
                break;
            case 6:
                figureName = "Шестиугольник";
                break;
            case 7:
                figureName = "Семиугольник";
                break;
            case 8:
                figureName = "Восьмиугольник";
                break;
            default:
                figureName = "Неверное количество сторон";
                break;
        }
        System.out.println("Фигура: " + figureName);
    }
}
