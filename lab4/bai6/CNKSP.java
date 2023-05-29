package bai6;

import java.util.Scanner;

public class CNKSP extends CongNhan {
private int sosanpham,dongiasanpham;

	public CNKSP() {
	super();
}

	public CNKSP(int sosanpham, int dongiasanpham) {
		super();
		this.sosanpham = sosanpham;
		this.dongiasanpham = dongiasanpham;
	}
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("So san pham \nDon gia san pham:");
		sosanpham=sc.nextInt();
		dongiasanpham=sc.nextInt();
	}
	public void in() {
		super.in();
		System.out.println("So san pham:"+this.sosanpham+";Don gia san pham:"+this.dongiasanpham);
	}
	

	public int getSosanpham() {
		return sosanpham;
	}

	public void setSosanpham(int sosanpham) {
		this.sosanpham = sosanpham;
	}

	public int getDongiasanpham() {
		return dongiasanpham;
	}

	public void setDongiasanpham(int dongiasanpham) {
		this.dongiasanpham = dongiasanpham;
	}
	

	@Override
	public String toString() {
		return "CNKSP [sosanpham=" + sosanpham + ", dongiasanpham=" + dongiasanpham + "]";
	}

	@Override
	public int tinhluong() {
		if (sosanpham<=1000) {
			System.out.println("Luong thang="+(this.sosanpham*this.dongiasanpham));
		}else if(sosanpham<=1100) {
			System.out.println("Luong thang="+((this.sosanpham*this.dongiasanpham)+1000000));
		}else if(sosanpham<=1150) {
			System.out.println("Luong thang="+((this.sosanpham*this.dongiasanpham)+1500000));
		}
		return 0;
	}

}