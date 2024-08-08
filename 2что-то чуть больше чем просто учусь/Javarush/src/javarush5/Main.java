package javarush5;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("Boris", 50, 20, 30);
		Cat cat2 = new Cat("Ivan", 22, 33, 48);
		Cat cat3 = new Cat("Dmitriy", 11, 17, 78);
		System.out.println("1-2"+cat1.fight(cat2));
		System.out.println("1-3"+cat1.fight(cat3));
		System.out.println("2-3"+cat2.fight(cat3));
		
		Cat cat4 = new Cat("Fedor");
		System.out.println(cat4.getAge());
	}

}
