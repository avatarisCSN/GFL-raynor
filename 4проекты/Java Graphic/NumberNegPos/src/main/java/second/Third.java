package second;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Введите число");
            int number = scan.nextInt();
            int firstDigit = Math.abs(number);
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }
            System.out.println("Первая цифра числа: " + firstDigit);

            int lastDigit = Math.abs(number % 10);
            System.out.println("Последняя цифра числа: " + lastDigit);
            System.out.println(("Результат расчета "+lastDigit+firstDigit));

        }
        catch (InputMismatchException e)
        {
            System.out.println("введено не число");
        }
        finally {
            scan.close();
        }
    }
}