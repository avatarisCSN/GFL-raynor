public class Reverse {
    public static  String reverse (String str)
    {
        String str2 = "Hello world this is Java";
        String[] mass = str2.split(" ");
        Stringbuilder builder = new Stringbuilder();
        for(String i:mass)
        {
            System.out.println(i.toString());

        }
         for(int i = mass.length;i>0;i--)
         {

         }
        return str2;
    }

    public static void main(String[] args) {
        reverse("Hello");
    }
}
