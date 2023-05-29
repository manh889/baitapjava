package bai6;

public class main {

	public static void main(String[] args) {
	CNKSP ksp=new CNKSP();
	CNTCN tcn=new CNTCN();
	
	System.out.println("Luong CNKSP:");
	ksp.nhap();
	ksp.tinhluong();
	ksp.in();
	
	System.out.println("Luong CNTCN:");
	tcn.nhap();
	tcn.tinhluong();
	tcn.in();

	}

}
