package baitap5678;
import java.util.Scanner;
public class bai8 {
	public static void main(String[] args) {
	int n;
	float tbc,Tong=0,c;
	Scanner scanner= new Scanner(System.in);{
	do {
		System.out.print("Nhập số phần tử có trong dãy số: ");	
	    n = scanner.nextInt();
	} while (n<0);
	System.out.println("Nhập các số vào trong dãy số ");
	for (int i=1;i<=n;i++) {
		System.out.print("Nhập số thứ"+i+":");
		c=scanner.nextFloat();
		Tong+=c;
		
	}
	tbc=(float)Tong/n;
	System.out.printf("Trung bình cộng các số là:%.2f",tbc);
		
}
}
}
