package atomic_integer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter{
	
	AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		
		AtomicCounter counter = new AtomicCounter();
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 0; i<20000; i++) {
			executor.execute(new Runnable() {
				public void run() {
					counter.incrementCount();
					counter.decrementCount();
				}
			});
		}
		
		
		executor.shutdown();
		
		executor.awaitTermination(4, TimeUnit.MINUTES);
		
		System.out.println("Final value of count is : " + counter.count);
		
	}

	public void incrementCount() {
		count.addAndGet(5);
	}
	
	public void decrementCount() {
		count.addAndGet(-2);
	}
}
