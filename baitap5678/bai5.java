package baitap5678;
import java.util.Scanner;
public class bai5 {
	public static void main(String[] args) {
		int a, sum =0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("nhập vào số nguyên bất kì: ");
			a = scanner.nextInt();
			sum += a;
		}while (sum<100);
		System.out.println("tổng các số nguyên vừa nhập ="+sum);
	}

}
