package bai3;

import java.util.Scanner;

public class Person {
private String name,gender;
private int age;
public Person() {
	super();
}
public Person(String name, String gender, int age) {
	super();
	this.name = name;
	this.gender = gender;
	this.age = age;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Name \nGender \nAge:");
	name=sc.nextLine();
	gender=sc.nextLine();
	age=sc.nextInt();
}
public void xuat() {
	System.out.println("Name:"+this.name+";Gender:"+this.gender+";Age:"+this.age);
}
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
@Override
public String toString() {
	return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
}
}
