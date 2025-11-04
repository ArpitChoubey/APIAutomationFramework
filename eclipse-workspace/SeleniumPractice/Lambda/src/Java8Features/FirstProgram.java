package Java8Features;

public class FirstProgram {

	public static void main(String[] args) {
		
		
		System.out.println("My System Starts .....");
		
          MyInter myInter = new MyInterImpl();
		
		myInter.sayhello();
		
		MyInter  i = () -> 
        	System.out.println(" This is my first time I am using lambda ");

	
	
		i.sayhello();
		
		SumInteger Sum = (int a , int b)-> {
			return a + b;
		};
		
		System.out.println(" This is my Second  time I am using lambda ");
		
		System.out.println(Sum.sum(23, 24));
		System.out.println(Sum.sum(2, 4));
		
		LengthInter LI = str -> str.length();
		
		System.out.println(LI.getlength("str:Arpit Choubey"));
		
	}
}

                    
         
	