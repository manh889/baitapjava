package baitap;

import java.util.Scanner;

public class Baitap3 {
	public static void main(String[] args) {
	int tuoi, nam;
	String ten, nhom;
	Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập tên: ");
	ten = scanner.nextLine();
	System.out.println("Nhập năm sinh: ");
    nam = scanner.nextInt();
	tuoi=2023-nam;
	if (tuoi < 16) 
	{
        nhom = "tuổi vị thành niên";
    } 
	else if (tuoi >= 16 || tuoi < 18)
	{
        nhom = "trưởng thành";
    } 
	else 
	{
        nhom = "già ";
    }
		System.out.println("Bạn " + ten + " thuộc nhóm tuổi " + nhom);
	}
	}
	    

	  

