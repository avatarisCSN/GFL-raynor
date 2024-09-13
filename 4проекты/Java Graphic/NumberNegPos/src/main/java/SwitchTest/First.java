package SwitchTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("nomer dna");
        byte day =1;
        try{
            day = scan.nextByte();
        }
        catch(InputMismatchException e)
        {
            System.out.println("oshibka vvedite ot 1 do 7");
        }
        finally
        {
            scan.close();
        }

        String dayName;
        switch (day) {
            case 1:
                dayName = "Понедельник";
                break;
            case 2:
                dayName = "Вторник";
                break;
            case 3:
                dayName = "Среда";
                break;
            case 4:
                dayName = "Четверг";
                break;
            case 5:
                dayName = "Пятница";
                break;
            case 6:
                dayName = "Суббота";
                break;
            case 7:
                dayName = "Воскресенье";
                break;
            default:
                dayName = "Неверный номер дня недели";
                break;
        }
        System.out.println("День: " + dayName);
    }
}
