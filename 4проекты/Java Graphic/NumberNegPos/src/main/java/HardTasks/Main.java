package HardTasks;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice Johnson", 20, 4.7));
        students.add(new Student("Bob Smith", 22, 3.9));
        students.add(new Student("Charlie Brown", 19, 4.3));
        students.add(new Student("Diana Prince", 21, 4.8));
        students.add(new Student("Ethan Hunt", 23, 3.6));
        students.add(new Student("Fiona Gallagher", 20, 4.2));
        for (Student str:students)
        {
            System.out.println(str);
        }

    }
}
