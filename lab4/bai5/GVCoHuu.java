package bai5;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
private int lcb,hesoluong,namcongtac;

public GVCoHuu() {
	super();
}

public GVCoHuu(int lcb, int hesoluong, int namcongtac) {
	super();
	this.lcb = lcb;
	this.hesoluong = hesoluong;
	this.namcongtac = namcongtac;
}



public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("Luong co ban \nHe so luong \nNam cong tac:");
	lcb=sc.nextInt();
	hesoluong=sc.nextInt();
	namcongtac=sc.nextInt();
}
public void in () {
	super.in();
	System.out.println("Luong co ban:"+this.lcb+";He so luong:"+this.hesoluong+";Nam cong tac:"+this.namcongtac);
}


public int getLcb() {
	return lcb;
}


public void setLcb(int lcb) {
	this.lcb = lcb;
}


public int getHesoluong() {
	return hesoluong;
}


public void setHesoluong(int hesoluong) {
	this.hesoluong = hesoluong;
}


public int getNamcongtac() {
	return namcongtac;
}


public void setNamcongtac(int namcongtac) {
	this.namcongtac = namcongtac;
}


@Override
public String toString() {
	return "GVCoHuu [lcb=" + lcb + ", hesoluong=" + hesoluong  + ", namcongtac=" + namcongtac	+ "]";
}


@Override
public int tinhluong() {
	if (namcongtac<5) {
		System.out.println("Luong thang="+(this.lcb*this.hesoluong+this.lcb));
	}else if(namcongtac==5) {
		System.out.println("Luong thang="+(this.lcb*this.hesoluong+(0.05*(this.lcb))));
	}else if(namcongtac>5) {
		System.out.println("luong thang="+(this.lcb*this.hesoluong+((this.namcongtac*0.01*this.lcb))));
	}
	return 0;
}

}
