package SwitchTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Введите тип билета (взрослый, детский, пенсионер): ");
                String ticketType = scanner.nextLine().trim().toLowerCase();

                System.out.println("Введите количество билетов: ");
                int numberOfTickets = 0;
                try {
                    numberOfTickets = scanner.nextInt();
                    if (numberOfTickets <= 0) {
                        System.out.println("Количество билетов должно быть положительным числом.");
                        return;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: введите корректное количество билетов.");
                    return;
                } finally {
                    scanner.close();
                }

                int pricePerTicket;

                switch (ticketType) {
                    case "взрослый":
                        pricePerTicket = 100;
                        break;
                    case "детский":
                        pricePerTicket = 50;
                        break;
                    case "пенсионер":
                        pricePerTicket = 70;
                        break;
                    default:
                        System.out.println("Ошибка: неверный тип билета.");
                        return;
                }

                int totalPrice = pricePerTicket * numberOfTickets;
                System.out.println("Общая стоимость: " + totalPrice + " рублей");
            }
        }
        


