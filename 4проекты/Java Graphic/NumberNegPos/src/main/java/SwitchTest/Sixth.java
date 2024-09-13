package SwitchTest;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = 0;
        int height = 0;

        try {
            System.out.println("Введите ширину: ");
            width = scan.nextInt();
            System.out.println("Введите высоту: ");
            height = scan.nextInt();

            if (width <= 0 || height <= 0) {
                System.out.println("Ошибка: ширина и высота должны быть положительными числами");
                return;
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите положительные числа");
            return;
        } finally {
            scan.close();
        }

        if (width == height) {
            System.out.println("Это квадрат.");
        } else {
            System.out.println("Это не квадрат.");
        }

        int area = width * height;
        int perimeter = 2 * (width + height);

        System.out.println("Площадь: " + area);
        System.out.println("Периметр: " + perimeter);
    }
}