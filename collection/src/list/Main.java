package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        arraylist listOne = new arraylist();
        listOne.addAllList();
        listOne.toArrayList();
listOne.toArrayList2();
        listOne.toArrayList3();
        List<Integer> listNum = new ArrayList<>(List.of(5,10,20,14,6));
        listNum.add(10);
        listNum.remove(Integer.valueOf(20));
        System.out.println(listNum);
        List<String> lister = Arrays.asList("hola","muchacho", "el capuchino");
        for (String s:lister
             ) {
            System.out.println(s+" ispano");
        }

    }
}
