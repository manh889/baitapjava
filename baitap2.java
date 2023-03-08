package baitap;

import java.util.Scanner;

public class baitap2 {
	public static void main(String[] args) 
	{
		Scanner Scanner=new Scanner (System.in);
        System.out.println("Nhập a=: ");
        int a = Scanner.nextInt();
        
        if(a % 2==0)
        {
        	System.out.println("số này là chẵn");
        }
        else
        {
        	System.out.println("số này là lẻ");
        }
	

}
	}