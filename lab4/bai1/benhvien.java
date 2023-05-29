package bai1;


	import java.util.Scanner;

	public class benhvien extends benhnhan  {
	  private String ten,diachi,giamdoc;

	public benhvien() {
		super();
	}

	public benhvien(String ten, String diachi, String giamdoc) {
		super();
		this.ten = ten;
		this.diachi = diachi;
		this.giamdoc = giamdoc;
	}
	public void nhap() {
		super.nhap();
		Scanner sc=new Scanner(System.in);
		System.out.println("Ten,\nDia chi,\nGiam doc:");
		ten=sc.nextLine();
		diachi=sc.nextLine();
		giamdoc=sc.nextLine();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ten:"+this.ten+";Dia chi:"+this.diachi+";Giam đoc:"+this.giamdoc);
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getGiamdoc() {
		return giamdoc;
	}

	public void setGiamdoc(String giamdoc) {
		this.giamdoc = giamdoc;
	}

	@Override
	public String toString() {
		return "BenhVien [ten=" + ten + ", diachi=" + diachi + ", giamdoc=" + giamdoc + "]";
	}

	}

