import java.util.Random;
import java.util.Scanner;

public class chmoki {
    public static void main(String[] args) {
        // Создаем объект Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести строку
        System.out.print("Мне еще ждать и сколько?");

        // Читаем введенную строку
        String userInput = scanner.nextLine();

        // Проверяем, соответствует ли введенная строка конкретной строке "да!"
        if (userInput.equals("да")) {
            System.out.println("Вы ввели правильную строку: 'и я жду, лови число'");
            // Генерируем случайное число от 0 до 100
            int randomNumber = random.nextInt(101); // 101 исключает 100 из диапазона

            // Выводим сгенерированное число
            System.out.println("Случайное число от 0 до 100 дней: " + randomNumber+"днейд");
        }


        // Закрываем Scanner
        scanner.close();
    }


}