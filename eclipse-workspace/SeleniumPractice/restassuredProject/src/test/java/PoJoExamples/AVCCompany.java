package PoJoExamples;

public class AVCCompany {

	public static void main(String[] args) {
		
		Employees ram = new Employees();
		ram.id =7;
		ram.gender = "male";
		ram.deptid = 248;
		ram.address = "KA";
		ram.mobilenumber = "987655661266";
		
		
		Employees Sita = new Employees();
		Sita.id =72;
		Sita.gender = "female";
		Sita.deptid = 28;
		Sita.address = "Delhi";
		Sita.mobilenumber = "9855661266";
		
		System.out.println(ram.id);
		System.out.println(Sita.id);
	}

}
