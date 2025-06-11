package org.example;

public class Main {
  public void printName(Shape shape){
      System.out.println(shape.getName());
}

    public static void main(String[] args) {

      Triangle trian = new Triangle();
      Paralelegram paral = new Paralelegram();
      Cylinder cylinder = new Cylinder();
      Trapezoid trap = new Trapezoid();
      Circle circ = new Circle();
      System.out.println("triangle is "+trian.getName()+" Paralelegram is "+paral.getName()+" Cylinder is "
              +cylinder.getName()+" trapezoid is "+trap.getName()+" Circle is "+circ.getName());

      Main mey = new Main();
      mey.printName(paral);
      mey.printName(trian);

      ShapeWriter writer = new ShapeWriter(trian);
      ShapeWriter writer2 = new ShapeWriter(paral);
      ShapeWriter writer3 = new ShapeWriter(cylinder);
      System.out.println(writer.getName());
      System.out.println(writer2.getName());
      System.out.println(writer3.getName());
    }
}