import java.util.*;

public class calculateDuplicateNumbers {
    // calculate all duplicate letters
    public  String calculateSmall(String input)
    {

        String out="hello";
        char[] buffer = out.toCharArray();
        System.out.println(buffer[0]);
  
        return out;
    }
    public  String calculateBig(String input)
    {

        String output="";

        return output;
    }
    public static void main (String [] args)
    {
        String example="Hello my little brother, i love you very much. When are you coming to me, Charlie are waiting for you?";
        calculateDuplicateNumbers Main = new calculateDuplicateNumbers();
        Main.calculateSmall(example);
        // другая часть приложения с коробками
        HeavyBox box1= new HeavyBox(10,5,3,20);
        HeavyBox box2= new HeavyBox(20,4,5,15);
        HeavyBox box3= new HeavyBox(15,2,3,18);
        HeavyBox box4= new HeavyBox(20,5,3,14);
        HeavyBox box5= new HeavyBox(15,2,3,18);
        List<HeavyBox> list1 = new ArrayList<>(Arrays.asList(box1,box2,box3,box4,box5));
        Set<HeavyBox> set = new TreeSet<>();

        set.addAll(list1);

        for(HeavyBox b:list1)
        {
            System.out.println(b);
        }
         list1.get(0).setWeight(1);
         list1.remove(list1.size()-1);

        HeavyBox[] arr1 = list1.toArray(new HeavyBox[0]);
        System.out.println("Способ 1 (toArray(new HeavyBox[0])): " + Arrays.toString(arr1));

        // Способ 2: using stream().toArray(HeavyBox[]::new)
        HeavyBox[] arr2 = list1.stream().toArray(HeavyBox[]::new);
        System.out.println("Способ 2 (stream().toArray(HeavyBox[]::new)): " + Arrays.toString(arr2));

        // Способ 3: using manual loop to copy
        HeavyBox[] arr3 = new HeavyBox[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            arr3[i] = list1.get(i);
        }
        System.out.println("Способ 3 (ручной цикл): " + Arrays.toString(arr3));

        // Способ 4: using System.arraycopy()
        HeavyBox[] arr4 = new HeavyBox[list1.size()];
        System.arraycopy(list1.toArray(), 0, arr4, 0, list1.size());
        System.out.println("Способ 4 (System.arraycopy()): " + Arrays.toString(arr4));

        // Способ 5: using Collections.copy() (необходим List)
        HeavyBox[] arr5 = new HeavyBox[list1.size()];
        Collections.copy(Arrays.asList(arr5), list1);
        System.out.println("Способ 5 (Collections.copy()): " + Arrays.toString(arr5));

        // Способ 6: using Streams with manual array creation
        HeavyBox[] arr6 = list1.stream().toArray(i -> new HeavyBox[i]);
        System.out.println("Способ 6 (Streams with manual array creation): " + Arrays.toString(arr6));

        list1.removeAll(list1);
       // System.out.println(  list1.get(0));
        System.out.println("print SET");

        for(HeavyBox b:set)
        {
            System.out.println(b);
        }
        //SimpleTreeSet.Run();
        Set<Integer> set1 = new HashSet<>(Arrays.asList(3,2,1,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,6,8,10));


        System.out.println("SPACE");
        Set<Integer> set3=SimpleTreeSet.union(set1,set2);
        for(int a:set3){
            System.out.println(a);
        }

        System.out.println("SPACE");
        Set<Integer> set4=SimpleTreeSet.intersect(set1,set2);
        for(int a:set4){
            System.out.println(a);
        }

    }
}
