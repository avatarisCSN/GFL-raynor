package second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth {
    public static boolean FirstLetter(int number1, int number2)
    {
        char symbol1 = Integer.toString(Math.abs(number1)).charAt(0);
        char symbol2 = Integer.toString(Math.abs(number2)).charAt(0);
        return (symbol1==symbol2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Введите число1");
            int number1 = scan.nextInt();
            System.out.println("Введите число2");
            int number2 = scan.nextInt();

            System.out.println(FirstLetter(number1, number2));
        } catch(InputMismatchException e)
        {
            System.out.println("Введено не число");
        }
       finally{
            scan.close();
        }

    }


}
