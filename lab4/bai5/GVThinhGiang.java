package bai5;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
 private int sotietday,dongia;


public GVThinhGiang(int sotietday, int dongia) {
	super();
	this.sotietday = sotietday;
	this.dongia = dongia;
}

public GVThinhGiang() {
	super();
}

public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("So tiet day \nDon gia:");
	sotietday=sc.nextInt();
	dongia=sc.nextInt();
}
public void in() {
	super.in();
	System.out.println("So tiet day:"+this.sotietday+";Don gia:"+this.dongia);
}
public int getSotietday() {
	return sotietday;
}

public void setSotietday(int sotietday) {
	this.sotietday = sotietday;
}

public int getDongia() {
	return dongia;
}

public void setDongia(int dongia) {
	this.dongia = dongia;
}



@Override
public String toString() {
	return "GVThinhGiang [sotietday=" + sotietday + ", dongia=" + dongia + "]";
}

@Override
public int tinhluong() {
	System.out.println("Luong thang="+((this.sotietday*this.dongia)-(0.15*(this.sotietday*this.dongia))));
	return 0;
}
 
}