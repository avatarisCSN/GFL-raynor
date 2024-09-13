import java.util.Arrays;

public class Split {
    public static String[] spliter (String input, String regex)
    {
return input.split(regex);
    }

    public static void main(String[] args) {
        String first ="Java is a powerful language"; // probel
        String second ="Split this sentence into words"; //probel
        String third ="apple,banana,orange,grape"; // ,
        String fourth ="word1.word2.word3";//.
        String fifth ="123-456-789"; // -



            String[] result = first.split(" ");
            System.out.println(Arrays.toString(result));

        String[] result2 = second.split(" ");
        System.out.println(Arrays.toString(result2));

        String[] result3 = third.split(",");
        System.out.println(Arrays.toString(result3));

        String[] result4 = fourth.split("\\.");
        System.out.println(Arrays.toString(result4));

        String[] result5 = fifth.split("-");
        System.out.println(Arrays.toString(result5));

    }
}
