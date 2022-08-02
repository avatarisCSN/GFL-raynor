package abstracter;

public class Main {

    public static void main(String[] args)
    {
        Trees tree1 = new Poplar(1,10,220,"Skomorohi",10);
        tree1.cutBranch(3);
        System.out.println(tree1.getBranches());

    }

}
