package interfacer;

public class Main {
    public static  void main(String[] args)
    {
       // нужно знать тип класса и тип данного
        Person owner1 = new Person("Boris", 25);
        Home home1 = new Home("green",10,"round",2,"Fedor");
        home1.setOwner(owner1.getName()); // почему велью офф?
        System.out.println(home1.getOwner());

        // нужно знать тип класса
        Person owner2 = new Person("Ivan", 36);
        //а вот тут надо знать имя типа данных, чтобы использовать геттер
        Home2 home2 = new Home2("black",20,"round",4, "Aleksandr");
        home2.setOwner(owner2); // почему велью офф?
        System.out.println(home2.getOwner());


        // нужно знать только тип интерфейса, который реализует все подобные классы
        //попытка связи через интерфейс
        Home3 home3 = new Home3("green",10,"round",2,"Mariya");
        Owner owner3 = new Person("Dmitriy",27);
        Owner owner33 = new OtherPerson("Peter");

        //получаем в обьекте Home3 данные, задавая только тип интерфейса, который поддерживают Person и OtherPerson
        home3.setOwner(owner3); // почему велью офф?
        System.out.println(home3.getOwner());

        home3.setOwner(owner33);
        System.out.println(home3.getOwner());


    }

}
