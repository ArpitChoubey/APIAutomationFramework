package StreamAPI;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreams {

	public static void main(String[] args) {
		
		List<Integer> collect = IntStream.iterate(0, n -> n + 2)
		        .mapToObj(Integer::valueOf)
		        .limit(10)
		        .collect(Collectors.toList());

		System.out.println(collect);
		
		List<Integer> collect2 = Stream.generate(() -> new Random().nextInt(100))
                .limit(100)
                .collect(Collectors.toList());
		
		
		System.out.println(collect2);
		


	}

}
