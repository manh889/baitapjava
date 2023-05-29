package bai6;

import java.util.Scanner;

public class CNTCN extends CongNhan{
private int lcb,hsl,ngaylamviec;
	public CNTCN() {
	super();
}
	
	public CNTCN(int lcb, int hsl, int ngaylamviec) {
		super();
		this.lcb = lcb;
		this.hsl = hsl;
		this.ngaylamviec = ngaylamviec;
	}
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Luong co ban \nHe so luong \nNgay lam viec:");
		lcb=sc.nextInt();
		hsl=sc.nextInt();
		ngaylamviec=sc.nextInt();
	}
	public void in() {
		super.in();
		System.out.println("Luong co ban:"+this.lcb+";He so luong:"+this.hsl+";Ngay lam viec:"+this.ngaylamviec);
	}

	public int getLcb() {
		return lcb;
	}

	public void setLcb(int lcb) {
		this.lcb = lcb;
	}

	public int getHsl() {
		return hsl;
	}

	public void setHsl(int hsl) {
		this.hsl = hsl;
	}

	public int getNgaylamviec() {
		return ngaylamviec;
	}

	public void setNgaylamviec(int ngaylamviec) {
		this.ngaylamviec = ngaylamviec;
	}

	@Override
	public String toString() {
		return "CNTCN [lcb=" + lcb + ", hsl=" + hsl + ", ngaylamviec=" + ngaylamviec + "]";
	}

	@Override
	public int tinhluong() {
            if(ngaylamviec<20) {
            	System.out.println("Luong thang="+(this.lcb*this.hsl));
            }else if(ngaylamviec>=20) {
            	System.out.println("Luong thang="+((this.lcb*this.hsl)+(1.2*this.lcb)));
            }
		return 0;
	}

}