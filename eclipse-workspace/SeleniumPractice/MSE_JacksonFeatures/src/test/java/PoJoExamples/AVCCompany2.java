package PoJoExamples;

public class AVCCompany2 {

	public static void main(String[] args) {
	
		
		Employees2 ram = new Employees2();
		ram.setId(10);
		ram.setGender("male"); 
		ram.setDeptid(248); 
		ram.setAddress("KA");
		ram.setMobilenumber("987655661266");
		
		Employees2 Sita = new Employees2();
		Sita.setId(25);
		Sita.setGender("female"); 
		Sita.setDeptid(24); 
		Sita.setAddress("Delhi");
		Sita.setMobilenumber("98765523466");
		
		
		System.out.println(ram.getId());
		System.out.println(Sita.getId());

	}

}
