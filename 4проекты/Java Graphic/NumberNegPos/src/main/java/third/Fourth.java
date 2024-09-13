package third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fourth {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("nomer mesaca");
            byte month =1;
            try{
            month = scan.nextByte();
            }
            catch(InputMismatchException e)
            {
                System.out.println("oshibka vvedite ot 1 do 12");
            }
            finally
            {
                scan.close();
            }

            String season;

            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;
                default:
                    season = "Неверный номер месяца";
                    break;
            }

            System.out.println("Этот месяц относится к сезону: " + season);
        }
    }

