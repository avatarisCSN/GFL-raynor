package imutable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        objecto obj = new objecto();
        System.out.println(obj.getDelta());
        System.out.println(obj);
        objectoNonStatic obj2 = new objectoNonStatic("change");  // no setter, so i cant change  String field "delta" after creation

        System.out.println(obj2.getDelta());
        System.out.println(obj2);
        objectoNonStatic obj3 = new objectoNonStatic("change");  // the same "delta" value

        System.out.println(obj3);
        Person pers = new Person("denis");
        System.out.println(pers.getName()+" "+pers.getSurname()); // выдаст имя и фамилию - нулл

        Person pers2 = new Person("ivan", "Sidorov", new int[]{5,10,20,40} );
        System.out.println(pers2.getName()+" " +pers2.getSurname()+" "+pers2.getLikedColors());
       // pers2.setName("sasha")   //error
        //pers2.setSurname("petrov")  //error

// обход 1
        String[] colors =  {"red", "green", "yellow", "blue", "pink"};
        pers2.setLikedColors(colors);
        System.out.println(pers2);
         colors[0] = "black";
        System.out.println(pers2);
// обход 2
        //imutability is not working ее можно обойти
  int[] numb={100,200,1000,4000};
        Person pers3 = new Person("Petr", "Konovalov", numb );
        System.out.println(pers3);
        numb[0]=1;
        System.out.println(pers3);

        //clone3
        Person pers4 = new Person("ivan", "Sidorov", new int[]{5,10,20,40} , new int[]{1,12,123,1234}  );
        int[] clone3 = pers4.getNumbers2();
        System.out.println(Arrays.toString(clone3));




    }
}
