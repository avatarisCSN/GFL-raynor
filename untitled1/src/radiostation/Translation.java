package radiostation;


import java.util.List;

public class Translation {
    private int length;
    private List<Parts> parts;
    private boolean isComplete;
    private int price;
    // может использовать билдер? но он тут не нужен


    public Translation( int length, List<Parts> parts){
if(checkPrice( length,  parts)) {
    this.length = length;
    this.parts = parts;
    this.price =calculatePrice(  parts);
    if(checkLength( length,  parts)) {
        this.isComplete = true;
    }
    else this.isComplete = false;
    //проверка на правильность
    //если неправильно - не создавать
    //проверка на полную заполненость трансляции
}
    };

    public  boolean addToList( Parts part)
    {
        int price=0;
        int partsLength=0;
        int priceLength=0;
        int partPriceLength=0;
        for(int i=0;i<parts.size();i++)
        {
            if(parts.get(i).calculate()>0) {
                priceLength +=parts.get(i).getLength();
            }
            price +=   parts.get(i).calculate();
            partsLength +=parts.get(i).getLength();
        }

        int length2=part.getLength();
        // test
        System.out.println(priceLength+" priceLength");
        if(part.calculate()>0) {
            partPriceLength +=part.getLength();
        }
        System.out.println(partPriceLength+"partPriceLength");
        System.out.println(length/2 +"length/2");
        System.out.println(part.getLength()+partsLength +"part.getLength()+partsLength" );
        System.out.println(length+"length" );



        if(priceLength+partPriceLength<=length/2 && part.getLength()+partsLength<=length)
        {
            parts.add(part);
            System.out.println(" ");
            System.out.println("Part is added");
            return true;
        }
        else
        {
            System.out.println( " ");
            System.out.println("error : you cant add more  content");
            return false;
        }

    }

public static boolean checkPrice(int length, List<Parts> parts)
{
    int price=0;
    for(int i=0;i<parts.size();i++)
    {
     price +=   parts.get(i).calculate();
    }
    if(price<=length/2)
    {
        return true;
    }
    else   return false;
}

    public static boolean checkLength(int length, List<Parts> parts)
    {
        int lengthTotal=0;
        for(int i=0;i<parts.size();i++)
        {
            lengthTotal +=   parts.get(i).getLength();
        }
        if(lengthTotal==length)
        {
            return true;
        }
        else   return false;
    }
    public static int calculatePrice( List<Parts> parts)
    {
        int price=0;
        for(int i=0;i<parts.size();i++)
        {
            price +=   parts.get(i).calculate();
        }
        return price;
    }



    public int getPrice() {
        return price;
    }

    public void printParts(){
        for(int i=0;i<parts.size();i++)
        {
            System.out.println(parts.get(i).toString()+"\n");
        }
    };







}
