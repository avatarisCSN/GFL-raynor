package OOP.Eazy;

public class Student {
    private String name;
    private int age;
    private  double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public void displayInfo()
    {

        System.out.println("Имя: " + name + ", Возраст: " + age + ", Средний балл: " + gpa);

    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
