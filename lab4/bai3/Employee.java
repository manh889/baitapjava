package bai3;

import java.util.Scanner;

public class Employee extends Person{
private String employeeName,dateHired;

public Employee() {
	super();
}

public Employee(String employeeName, String dateHired) {
	super();
	this.employeeName = employeeName;
	this.dateHired = dateHired;
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("EmployeeName \nDateHired:");
	employeeName=sc.nextLine();
	dateHired=sc.nextLine();
}
public void xuat() {
	super.xuat();
	System.out.println("EmployeeName:"+this.employeeName+";DateHired:"+this.dateHired);
}
public String getEmployeeName() {
	return employeeName;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}

public String getDateHired() {
	return dateHired;
}

public void setDateHired(String dateHired) {
	this.dateHired = dateHired;
}

@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", dateHired=" + dateHired + "]";
}

}