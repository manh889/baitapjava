package baitap5678;
import java.util.Scanner;
public class bai6 {
	public static void main(String[] args) {
	int b, temp = 1;
	long giaiThua = 1;
	Scanner scanner = new Scanner(System.in);{
	do {
		System.out.println("Nhập vào 1 số bất kỳ: ");
		b = scanner.nextInt();
	} while ((b <= 0) || (b > 10));
	
	
	while (temp <= b) {
		giaiThua *= temp;
		temp++;
	}
	
	System.out.println(b + "! = " + giaiThua);
}

}
}




