package bai4;

import java.util.Scanner;

public class HocvienLT extends Hocvien{
 private int sobuoi,dongialt;



public HocvienLT() {
	super();
}

public HocvienLT(String hoten, String diachi, String loaichuongtrinh, String loai, int sobuoi, int dongialt) {
	super(hoten, diachi, loaichuongtrinh, loai);
	this.sobuoi = sobuoi;
	this.dongialt = dongialt;
}

public int getSobuoi() {
	return sobuoi;
}
public void setSobuoi(int sobuoi) {
	this.sobuoi = sobuoi;
}
public int getDongialt() {
	return dongialt;
}
public void setDongialt(int dongialt) {
	this.dongialt = dongialt;
}
@Override
public String toString() {
	return "HVLT [sobuoi=" + sobuoi + ", dongialt=" + dongialt + "]";
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("So buoi \nDon gia LT:");
	sobuoi=sc.nextInt();
	dongialt=sc.nextInt();
}
public void in() {
	super.in();
	System.out.println("So buoi:"+this.sobuoi+";Don gia LT:"+this.dongialt);
}
@Override
public int hocphi() {
	System.out.print("Loai uu tien:");
	Scanner sc=new Scanner(System.in);
	String loai=sc.nextLine();
	int iloai=Integer.parseInt(loai);
	switch(iloai) {
	case 1:
		System.out.println(" Hoc phi = So buoi* Don gia LT -1000000=" +((this.sobuoi*this.dongialt) -1000000));
		break;
	case 2:
		System.out.println(" Hoc phi = So buoi* Don gia LT -800000=" +((this.sobuoi*this.dongialt) -800000));
		break;
	}
	return 0;
}
 
}