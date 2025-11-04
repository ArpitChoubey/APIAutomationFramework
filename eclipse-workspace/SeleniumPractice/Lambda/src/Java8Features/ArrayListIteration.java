package Java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvSeries = new ArrayList<String>();
		
		tvSeries.add("Games of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Walking Dead");
		tvSeries.add("The Big Bank Theory");
		tvSeries.add("Prison Break");
		
		//1. Using Java8 with for Each loop and Lambda Expression
		
		System.out.println("Using Java8 with for Each loop and Lambda Expression");
		
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
		//2. Using Iterator 
		
		System.out.println("Using Iterator");
		
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()){
			String shows = it.next();
			System.out.println("shows");
			
		}
		//3. Using iterator and java 8 for Each Remaining() method 
		
		System.out.println("Using Iterator and java 8 for Each Remaining() method ");
		
		it = tvSeries.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		
		//4. Using for Each loop
		System.out.println("Using for Each loop");
		
		for(String show : tvSeries ) {
			System.out.println(show);
		}
		
		//5. Using for loop with order/Index 
		
		System.out.println("Using for loop with order/Index ");
		
		for(int i =0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//6. Using a listIterator() to traverse in both the direction 
		System.out.println("Using a listIterator() to traverse in both the direction ");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
			
		}
		
		
		
		
		
		
		
		
		

	}

}
