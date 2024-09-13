package OOP.harder;

public class Main {
    public static void main(String[] args) {
        
        Vehicle[] vehicles = {
                new Bike(25),
                new Car(100),
                new Vehicle(10)
        };
        for (Vehicle v : vehicles) {


            // Проверка с использованием instanceof и обработка ClassCastException
            try {
                if (v instanceof Car) {
                    ((Car) v).playMusic();  // Приведение к Car
                } else if (v instanceof Bike) {
                    ((Bike) v).ringBell();  // Приведение к Bike
                } else {
                    // Попробуем сделать неправильное приведение типа для теста
                    // (приведение Vehicle к Car или Bike, что вызовет исключение)
                    Car car = (Car) v;  // Это может вызвать ClassCastException
                }
            } catch (ClassCastException e) {
                System.out.println("Ошибка приведения типа: " + e.getMessage());
            }
        }
    }
}

