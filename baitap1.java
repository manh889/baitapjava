package baitap;

import java.util.Scanner;

public class baitap1 {
	
		public static void main(String[] args) 
		{
			Scanner Scanner=new Scanner (System.in);
	        System.out.println("Nhập a=: ");
	        int a = Scanner.nextInt();
	        System.out.println("Nhập b=: ");
	        int b = Scanner.nextInt();


	        int tong = a + b;
	        System.out.println(a + " + " + b + " = " + tong);
	         
	        int hieu = a - b;
	        System.out.println(a + " - " + b + " = " + hieu);
	         
	        int tich = a * b;
	        System.out.println(a + " * " + b + " = " + tich);
	         
	        float thuong = (float) a / b;
	        System.out.println(a + " / " + b + " = " + thuong);
	             
	         
            int phanDu = a % b;
	        System.out.println(a + " % " + b + " = " + phanDu);
	}
	}
