package javarush5;

public class Cat {
	public Cat(String name, int age, int weight, int strength) {
	
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.strength = strength;
	}
	public Cat(String name, int age, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.weight=1;
	}
	public Cat(String name) {
		super();
		this.name = name;
		this.age = 1;
		this.weight = 1;
	}

	public Cat(int weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
		this.age = 1;

	
	}
	
	public Cat(int weight, String color, String address) {
		super();
		this.weight = weight;
		this.color = color;
		this.address = address;
		this.age = 1;

	}
		private String name;
	private int age;
	private int weight;
	private int strength;
	private String color;
	private String address;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public boolean fight (Cat anotherCat)
	{	
		if(this.getStrength()>anotherCat.getStrength())
		{
			if(this.getWeight()>anotherCat.getWeight())
			{
				if(this.getAge()>anotherCat.getAge())
				{
					return true;
				}
			}
		}
		return false;
	}
}
