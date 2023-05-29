package bai3;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
private int hoursPerWeek;

public PartTimeEmployee() {
	super();
}

public PartTimeEmployee(int hoursPerWeek) {
	super();
	this.hoursPerWeek = hoursPerWeek;
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("HoursPerWeek:");
	hoursPerWeek=sc.nextInt();
}
public void xuat() {
	super.xuat();
	System.out.println("HoursPerWeek:"+this.hoursPerWeek);
}
public int getHoursPerWeek() {
	return hoursPerWeek;
}

public void setHoursPerWeek(int hoursPerWeek) {
	this.hoursPerWeek = hoursPerWeek;
}

@Override
public String toString() {
	return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
}

}