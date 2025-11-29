package JacksonAnnontationExample;

import PojoClasses.Book;
import tools.jackson.databind.ObjectMapper;

public class BookWithAllData {

	public static void main(String[] args) {
		  
		Book B = new Book();
		
		B.setBookName("Rest Assured");
		B.setAuthorName("Michael Jackson");
		
		ObjectMapper mapper = new ObjectMapper();
		String Jsonformat2 = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(B);
		System.out.println(Jsonformat2);
		
		
		Book b1 = mapper.readValue(Jsonformat2, Book.class);
		System.out.println(b1.getAuthorName());
		System.out.println(b1.getBookName());

		
	
	}

}
