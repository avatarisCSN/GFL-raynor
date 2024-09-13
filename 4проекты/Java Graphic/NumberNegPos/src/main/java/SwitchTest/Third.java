package SwitchTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время суток: ");
        int hour = -1;
        try {
            hour = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите число от 0 до 23");
            return; // Прерываем выполнение, если введено некорректное значение
        } finally {
            scan.close();
        }

        String timeOfDay;
        switch (hour) {
            case 0, 1, 2, 3, 4, 5:
                timeOfDay = "Ночь";
                break;
            case 6, 7, 8, 9, 10, 11:
                timeOfDay = "Утро";
                break;
            case 12, 13, 14, 15, 16, 17:
                timeOfDay = "День";
                break;
            case 18, 19, 20, 21, 22, 23:
                timeOfDay = "Вечер";
                break;

            default:
                timeOfDay = "Неверно указано время";
                break;
        }
        System.out.println("Время суток: " + timeOfDay);
    }
}
