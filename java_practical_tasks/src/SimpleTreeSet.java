import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SimpleTreeSet {
    public static void Run(){
        Set<Integer> set = new LinkedHashSet<>();
        Scanner scan = new Scanner(System.in);
         String input = scan.nextLine();
        String[] mass = input.split(",\\s*");

        for(String str:mass)
        {
            set.add(Integer.valueOf(str.trim()));
        }
        for(int str:set){
            System.out.println(str);
        }
    }
    public static<T> Set<T> union(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
             result.addAll(set2);
        return result;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
return result;
    }
    public static void ArrayDeque(){

    }
}
