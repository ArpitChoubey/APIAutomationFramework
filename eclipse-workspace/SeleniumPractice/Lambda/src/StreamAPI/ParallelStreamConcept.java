package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		
		ForkJoinPool corepools = ForkJoinPool.commonPool();
		
		System.out.println(corepools.getParallelism());
		
		Stream stream  = Stream.of("Arpit","Tom","Steve", "Peter","Anil", "Ram", "Ankit");
		
		Stream.of("Arpit","Tom","Steve", "Peter","Anil", "Ram", "Ankit").forEach(System.out::println);
		
		System.out.println("*********************************");
		
		Stream.of("Arpit","Tom","Steve", "Peter","Anil", "Ram", "Ankit").parallel().forEach(System.out::println);
		
		System.out.println("*********************************");
		
		Arrays.asList("Arpit","Tom","Steve", "Peter","Anil", "Ram", "Ankit").parallelStream().forEach(System.out::println);
		
		System.out.println("*************Normal Stream***************");
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		System.out.println("*************Parallel Stream***************");
		
		IntStream.rangeClosed(1, 10).parallel().forEach(System.out::println);
		
		// System.out.println(getAlphabeslist());
			
		System.out.println("************* Stream***************");
		
		getAlphabeslist().stream().forEach(System.out::println);
		
		System.out.println("*************Parallel Stream***************");
		
		getAlphabeslist().parallelStream().forEach(System.out::println);
		
		
		IntStream range = IntStream.rangeClosed(1, 10);
		
		 System.out.println(range.isParallel());
		 
		 IntStream range1 = IntStream.rangeClosed(1, 10);
		 
		 range1.parallel();
		 
		 System.out.println(range.isParallel());
		
		}
	
	
	public static List<String> getAlphabeslist(){
		
		List<String> alpha = new ArrayList<String>();
		
		int n = 97;
		while(n<=122) {
			char c =(char)n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
		
	}

}
