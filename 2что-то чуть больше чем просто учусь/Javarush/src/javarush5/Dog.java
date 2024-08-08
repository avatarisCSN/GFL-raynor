package javarush5;

public class Dog {

public Dog(String name, int height, String color) {
	super();
	this.name = name;
	this.height = height;
	this.color = color;
	this.age=1;
}
public Dog(String name, int height) {
	super();
	this.name = name;
	this.height = height;
	this.age=1;
}
public Dog(String name) {
	super();
	this.name = name;
	this.height = 1;
	this.age=1;
}

private String name;
private int age;
private int height;
private String color;

public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
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


}
