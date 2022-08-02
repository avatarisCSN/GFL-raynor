package imutable;

import java.util.Arrays;

public final class Person { // example of a bad immutability
    private final String name;
    private final String surname;
    private String[] likedColors;//обход 1
    private final int[] numbers; //обход 2
    private final int[] numbers2; //clone 3 не обойти способом 2

    public Person(String name, String surname, int[] numbers, int[] numbers2) {
        this.name = name;
        this.surname = surname;
        this.numbers = numbers;
        this.numbers2 = numbers2.clone();
    }
    public Person(String name, String surname, int[] numbers) {
        this.name = name;
        this.surname = surname;
        this.numbers = numbers;
        numbers2 = new int[0];
    }
    public Person(String name) {
        this.name = name;
        surname = null;
        numbers = new int[0];
        numbers2 = new int[0];
    }

    public int[] getNumbers() {
        return numbers;
    }
    public int[] getNumbers2() {
        return numbers.clone();
    }
    public String getName() { return name;}
    public String getSurname(){return surname;}
  //  public void setSurname(String surname) { this.surname = surname; }
  public String[] getLikedColors() {
      return likedColors;
  }

    public void setLikedColors(String[] likedColors) {
        this.likedColors = likedColors;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", likedColors=" + Arrays.toString(likedColors) +
                ", numbers=" + Arrays.toString(numbers) +
                ", numbers2=" + Arrays.toString(numbers2) +
                '}';
    }

}