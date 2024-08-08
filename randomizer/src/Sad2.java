import java.util.Random;
import java.util.Scanner;

public class Sad2 {
    public static void main(String[] args) {

        Variables var = new Variables();

        // Создаем объект Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести строку
        System.out.print("Мне грустно");



        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (!input.trim().isEmpty()) {
                System.out.println(" 'и я жду, лови  смайлик'");
                System.out.println(var.message);
            } else {
                System.out.println("Ввод пуст.");
            }
        } else {
            System.out.println("Нет ввода.");
        }


        // Закрываем Scanner
        scanner.close();
    }


}