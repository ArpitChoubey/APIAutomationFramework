package SRCTest;

public class PrintNumberRecursion {

	public static void main(String[] args) {
		
		int n= 10;
		PrintNumber(n);
			
	}
	public static void PrintNumber(int n) {
		
		if(n<1)
			return;
		PrintNumber(n-1);
		
	System.out.println(n);
	}

}
