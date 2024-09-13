package org.example;

public class Main {
    public static  String reverse (String str)
    {
        String str2 = "Hello world this is Java";
        String[] mass = str2.split(" ");
        StringBuilder builder = new StringBuilder();
        for(String i:mass)
        {
            System.out.println(i.toString());

        }
        for(int i = mass.length;i>0;i--)
        {
            builder.append();
        }
        return str2;
    }

    public static void main(String[] args) {
        reverse("Hello");
    }
}
