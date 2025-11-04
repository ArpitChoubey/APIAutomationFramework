package StreamAPI;

public class ConsMain {

	public static void main(String[] args) {

      System.out.println("Learning Constructors References ");
      
      StreamAPI.provider provider = Student::new;
      
      Student student = provider.getStudent();
      
      student.display();
	}

}
