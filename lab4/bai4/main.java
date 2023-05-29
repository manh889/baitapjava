package bai4;

public class main {

	public static void main(String[] args) {
		HocvienDH hdh =new HocvienDH();
		HocvienLT hlt=new HocvienLT();
        System.out.println("Hoc phi dn:");	
		hdh.nhap();
	    hdh.hocphi();
		hdh.in();
		
		System.out.println("Hoc phi lt:");
		hlt.nhap();
		hlt.hocphi();
		hlt.in();
	}
        
}
