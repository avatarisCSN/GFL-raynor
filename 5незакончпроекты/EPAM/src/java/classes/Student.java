package java.classes;

import java.util.Date;

public class Student {
	private int id;
	private String surname;
	private String name;
	private String fatherName;
	private Date birthdayDate;
	private String address;
	private String phoneNumber;
	private String faculty;
	private String course;
	private String group;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Date getBirthdayDate() {
		return birthdayDate;
	}
	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

	public Student(int id, String surname, String name, String fatherName, Date birthdayDate, String address,
			String phoneNumber, String faculty, String course, String group) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.fatherName = fatherName;
		this.birthdayDate = birthdayDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.faculty = faculty;
		this.course = course;
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", surname=" + surname + ", name=" + name + ", fatherName=" + fatherName
				+ ", birthdayDate=" + birthdayDate + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", faculty=" + faculty + ", course=" + course + ", group=" + group + "]";
	}
	
	
	

}
