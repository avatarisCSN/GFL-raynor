package org.example;

public class Main {
    public int uker=10;
    public int maker =18;
    public int result=uker+maker;
    public String str1="hello";
    public String str2="mother";
    public String str3="fucker";
    public String str;

    public static void main(String[] args) {
        Main main = new Main();
        main.result=main.result+2;
         main.str = main.str1+" "+main.str2+" "+main.str3;

        System.out.println("Hello world!"+main.result);
        System.out.println(main.str);

    }
    
}