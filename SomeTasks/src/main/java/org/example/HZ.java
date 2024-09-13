package org.example;



import java.util.InputMismatchException;
import java.util.Scanner;

public class HZ {


        public static String greet (String name) {
            return "Hello " + name;
        }


    public static void main(String[] args) {
        System.out.println(greet("Bob"));
        Scanner scan = new Scanner(System.in);
        double number = 0;
        boolean validInput = false;
        do {
            try {
                System.out.println("введите число");
                number = scan.nextDouble();
                validInput = true; // Ввод корректен
            } catch (InputMismatchException e) {
                System.out.println("oshibka-InputMismatch неправильный тип, введите число");
                scan.next(); // Сбрасываем некорректный ввод
            }

        } while(!validInput);

        System.out.println("Введенное число: " + number);

        try {
            double result = 10 / number; // Попытка выполнить деление
            System.out.println("Результат деления (double): " +result);
            int numerator = (int) number ; // Преобразование в int
            int result2 = 10/numerator;
            System.out.println("Результат деления (int): "+result2);
        }catch (ArithmeticException e){
            System.out.println("ошибка: ArithmeticException, делить на  0 нельзя ");
        }finally {
            scan.close();
        }


    }
}