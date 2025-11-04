package StreamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberwithParallelStream {

	public static void main(String[] args) {
		
		// System.out.println(isPrime(5));
		
		long t1,t2;
		
		t1 = System.currentTimeMillis();
		
		long count = Stream.iterate(0, n -> n + 1)
		        .limit(1000000)
		        .filter(PrimeNumberwithParallelStream::isPrime)
		        .peek(System.out::println)
		        .count();
		
		System.out.println("totalprimenumber:" +count);
		
		t2 = System.currentTimeMillis();
		
		System.out.println("total time taken:" +(t2-t1)/1000);

	}
	
	public static boolean isPrime(int number) {
		
		if(number <=1)return false;
		
		return ! IntStream.rangeClosed(2, number/2).anyMatch(x -> number%x ==0);
	}

}
