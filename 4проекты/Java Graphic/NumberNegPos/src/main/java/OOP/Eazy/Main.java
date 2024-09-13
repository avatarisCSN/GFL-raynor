package OOP.Eazy;

import OOP.harder.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Кольцо Тьмы", "Ник перумов", 2000);
        book.display();
        Circle circle = new Circle(10);
        System.out.println("круг радиусом 10 имеет площадь и длину окружности: " + circle.SquareCalc() + " " + circle.calculateCircumference());

        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Accord", 2019);

        car1.displayInfo();
        car2.displayInfo();

        Student student = new Student("John", 20, 3.5);
        student.displayInfo();

        student.setGpa(3.9);
        System.out.println("Новый средний балл:");
        student.displayInfo();

        Student student1 = new Student("sasasa", 5, 6);
        student1.displayInfo();
        student1.setGpa(6.5);
        System.out.println("Новый средний балл:");
        student1.displayInfo();

        Computer comp = new Computer();
        comp.on();
        comp.off();
    }
}
