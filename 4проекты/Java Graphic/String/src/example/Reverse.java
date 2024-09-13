package example;

public class Reverse {
    public static  String reverse (String str)
    {

        String[] mass = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String i:mass)
        {
            System.out.println(i.toString());

        }
         for(int i = mass.length-1;i>=0;i--)
         {
             builder.append(mass[i]);
             if (i > 0) {
                 builder.append(" "); // Добавляем пробел только между словами
             }
         }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello world this is Java"));
    }
}
