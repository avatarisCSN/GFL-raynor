package example;

public class Main {
    // Метод для нахождения первого вхождения символа в строку
    public static int number(String str, char c) {
        return str.indexOf(c);
    }

    public static void main(String[] args) {
        // Примеры вызова метода и вывода результата
        int res = number("Hello World", 'o');
        int res2 = number("Hello World", 'z');

        System.out.println(res);  // Ожидаемый результат: 4
        System.out.println(res2); // Ожидаемый результат: -1
    }
}