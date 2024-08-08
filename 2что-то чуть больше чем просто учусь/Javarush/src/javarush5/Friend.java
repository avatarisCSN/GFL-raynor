package javarush5;

public class Friend {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Friend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Friend(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	private String name;
	public Friend(String name) {
		super();
		this.name = name;
	}
	private String gender;
	private int age;
	

}
