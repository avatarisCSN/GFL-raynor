package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class arraylist {
    public  void Main1() {
        //первый конструктор
        List<String> list1 = new ArrayList<>();
        //второй конструктор
        List<String> list2 = new ArrayList<>(10);
        //третий конструктор вариант  через аррай лист
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>(list3);
        //третий конструктор вариант  через линкед лист
        List<String> linkedlist1 = new LinkedList<>();
        List<String> list5 = new ArrayList<>(linkedlist1);

        //третий конструктор добавить еще вариантов через другие коллекции
        List<bigCat> cats = new ArrayList<>();
        List<Cat> list6 = new ArrayList<>(cats);

        //еще вариант
        Collection<String> list7 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));

    }
          //проверяем методы интерфейса list

        //метод add
        public void addList()
        {
            List<String> list1 = new ArrayList<>();
            System.out.println("1st");
            printList(list1);


            list1.add(0, "first-0");
            System.out.println("2nd");
            printList(list1);
            list1.add(0, "second-0");
            System.out.println("3rd");
            printList(list1);
            list1.add(2, "third-2");
            System.out.println("4th");
            printList(list1);

            //тут не сработало, ответ, возможно есть в уроке
            //IndexOutOfBoundsException
            //похоже так делать нельзя
            list1.add(3, "forth-3");
            System.out.println("5th");

            printList(list1);
        }

        //метод addAll
    public void addAllList()
    {
        List<String> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));
        list1.addAll(list2);
        printList(list2);
        printList(list1);

    }

    //метод removeAll
    public void removeAllList()
    {
        List<String> list1 = new ArrayList<>();
        Collection<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));

    }
    // метод retainAll
    public void retainAllList()
    {

    }

    //метод toArray(массив) вариант 1
    public void toArrayList()
    {
        List<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));
        String[] strings =new String[list2.size()];
        list2.toArray(strings);
        System.out.println(strings);
    }

    //метод toArray(массив) вариант 2
    public void toArrayList2()
    {
        List<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));
        String[] strings = list2.toArray(new String[0]);
      //  for (String str:strings) { System.out.println(str); } метод для принта масива

    }
   

    //метод toArray(массив) object
    public void toArrayList3()
    {
        List<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));
        Object[] obj = list2.toArray();
        System.out.println(obj);
    }

    //метод toArray(массив) object
    public void toArrayList4()
    {
        List<String> list2 = new ArrayList<>(List.of("first","second","third", "someone","someNoOne", "lastOne"));
        var obj = (String[]) list2.toArray();
        //      String[] obj = (String[]) list2.toArray(); - может вылететь ошибка
        System.out.println(obj);
    }




    public void printList(Collection<String> list)
    {
        for (String str: list) {
            System.out.println(str+" - "+(str==null ? "null": str.length()));

        }
    }
}
