package bai1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class bai1 {
	 public static int DEC_10 = 10;
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Nhập số tự nhiên n = ");
	        int n = sc.nextInt();
	        System.out.println(n + " là số thuận nghịch: " + isThuanNghich(n));
	 }
	 public static boolean isThuanNghich(int n) {
	        List<Integer> listNumbers = new ArrayList<>();
	        do {
	            listNumbers.add(n % DEC_10);
	            n = n / DEC_10;
	        } while (n > 0);
	        int size = listNumbers.size();
	        for (int i = 0; i < (size/2); i++) {
	            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
}
