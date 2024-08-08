package org.example;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число:");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println("Вы ввели число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное число.");
        } finally {
            scanner.close();
            System.out.println("Ресурсы закрыты.");
        }




    }
}
