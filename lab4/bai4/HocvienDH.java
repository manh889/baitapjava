package bai4;

import java.util.Scanner;

public class HocvienDH extends Hocvien {
 private int sobuoi,dongiadh;



public HocvienDH() {
	super();
}

public HocvienDH(String hoten, String diachi, String loaichuongtrinh, String loai, int sobuoi, int dongiadh) {
	super(hoten, diachi, loaichuongtrinh, loai);
	this.sobuoi = sobuoi;
	this.dongiadh = dongiadh;
}

public int getSobuoi() {
	return sobuoi;
}
public void setSobuoi(int sobuoi) {
	this.sobuoi = sobuoi;
}
public int getDongiadh() {
	return dongiadh;
}
public void setDongiadh(int dongiadh) {
	this.dongiadh = dongiadh;
}

@Override
public String toString() {
	return "HVDH [sobuoi=" + sobuoi + ", dongiadh=" + dongiadh + "]";
}
public void nhap() {
	super.nhap();
	Scanner sc=new Scanner(System.in);
	System.out.println("So buoi \nDon gia DH:");
	sobuoi=sc.nextInt();
	dongiadh=sc.nextInt();
}public void in() {
	super.in();
	System.out.println("So buoi:"+this.sobuoi+";Don gia DH:"+this.dongiadh);
}

@Override
public int hocphi() {
		System.out.print("Loai uu tien:");
		Scanner sc=new Scanner(System.in);
		String loai=sc.nextLine();
		int iloai=Integer.parseInt(loai);
		switch(iloai) {
		case 1:
			System.out.println(" Hoc phi = So buoi* Don gia DH -1000000=" +((this.sobuoi*this.dongiadh) -1000000));
			break;
		case 2:
			System.out.println(" Hoc phi = So buoi* Don gia DH -500000="+((this.sobuoi*this.dongiadh )-500000));
			break;
		}
	return 0;
}
 
}
