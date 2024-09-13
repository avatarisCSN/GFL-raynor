package third;

public class Second {
    public static char  beforeLast(String str)
    {

        if(str.length()>1)
        {
             return   str.charAt(str.length()-2);
        }
        else throw new RuntimeException("Произошла ошибка");
    }
    public static void main(String[] args) {
        String[] strings = { "Hello world", "s", "" };

        for (String str : strings) {
            try {
                System.out.println(beforeLast(str));
            } catch (RuntimeException e) {
                System.out.println("Не удалось обработать строку: " + str);
            }
        }
    }
}
