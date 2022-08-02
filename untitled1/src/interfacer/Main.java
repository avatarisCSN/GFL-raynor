package interfacer;

public class Main {
    public static  void main(String[] args)
    {
        Person owner1 = new Person("Boris", 25);
        //а вот тут надо знать имя типа данных, чтобы использовать геттер
        Home home1 = new Home("green",10,"round",2,owner1.getName());
        Person owner2 = new Person("Ivan", 36);
        //а вот тут надо знать имя типа данных, чтобы использовать геттер
        home1.setOwner(owner2.getName());

        //попытка связи через интерфейс
        Home3 home2 = new Home3("green",10,"round",2,"Mariya");
        Owner owner3 = new Person("Dmitriy",27);
        home2.setOwner(owner3); // почему велью офф?
        System.out.println(home2.getOwner());


    }

}
