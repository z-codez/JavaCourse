package intStream_interface;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		IntStream ordered = IntStream.range(1, 11);
		
		ordered.forEach(System.out::println);
		
		var ordered2 = random.ints(11);
		
		// Generates an infinite stream of integers
		var unordered = IntStream.generate(() -> random.nextInt(100));
		System.out.println(unordered.isParallel());
		//unordered.forEach(System.out::println);
		
		System.out.println(ordered2.isParallel());
		
		ordered2.forEach(System.out::println);
		
		

	}

}
