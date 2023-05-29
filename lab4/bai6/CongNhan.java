package bai6;

import java.util.Scanner;

public abstract class CongNhan {
protected String hoten,diachi,loaicongnhan;

public CongNhan() {
	super();
}

public CongNhan(String hoten, String diachi, String loaicongnhan) {
	super();
	this.hoten = hoten;
	this.diachi = diachi;
	this.loaicongnhan = loaicongnhan;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ho ten \nDia chi \nLoai cong nhan:");
	hoten=sc.nextLine();
	diachi=sc.nextLine();
	loaicongnhan=sc.nextLine();
}
public void in() {
	System.out.println("Ho ten:"+this.hoten+";Dia chi:"+this.diachi+";Loai cong nhan:"+this.loaicongnhan);
}
public abstract int tinhluong();

public String getHoten() {
	return hoten;
}

public void setHoten(String hoten) {
	this.hoten = hoten;
}

public String getDiachi() {
	return diachi;
}

public void setDiachi(String diachi) {
	this.diachi = diachi;
}

public String getLoaicongnhan() {
	return loaicongnhan;
}

public void setLoaicongnhan(String loaicongnhan) {
	this.loaicongnhan = loaicongnhan;
}

@Override
public String toString() {
	return "CongNhan [hoten=" + hoten + ", diachi=" + diachi + ", loaicongnhan=" + loaicongnhan + "]";
}

}
