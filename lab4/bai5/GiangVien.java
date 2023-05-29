package bai5;

import java.util.Scanner;

public abstract class GiangVien {
protected String hoten,diachi,loaigiangvien;


public GiangVien() {
	super();
}
public GiangVien(String hoten, String diachi, String loaigiangvien) {
	super();
	this.hoten = hoten;
	this.diachi = diachi;
	this.loaigiangvien = loaigiangvien;
}
public void nhap() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Ho ten \nDia chi \nLoai giang vien:");
	hoten=sc.nextLine();
	diachi=sc.nextLine();
	loaigiangvien=sc.nextLine();
}
public void in() {
	System.out.println("Ho ten:"+this.hoten+";Dia chi:"+this.diachi+";Loai giang vien:"+this.loaigiangvien);
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

public String getLoaigiangvien() {
	return loaigiangvien;
}

public void setLoaigiangvien(String loaigiangvien) {
	this.loaigiangvien = loaigiangvien;
}

@Override
public String toString() {
	return "GiangVien [hoten=" + hoten + ", diachi=" + diachi + ", loaigiangvien=" + loaigiangvien + "]";
}


}
