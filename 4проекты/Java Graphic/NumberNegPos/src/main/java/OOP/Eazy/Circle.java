package OOP.Eazy;

public class Circle {
    private int Radius;

    public Circle(int radius) {
        Radius = radius;
    }
    public double  SquareCalc()
    {
        return  Math.PI*Math.pow(Radius, 2);
    }
    public double calculateCircumference()
    {
        return  Math.PI*2*Radius;
    }

}
