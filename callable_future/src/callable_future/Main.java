package callable_future;

import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class Task implements Callable<String> {
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		System.out.println(name + " executed on: " + LocalDateTime.now());
		return name;
	}
	
}


public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i = 1; i<4; i++) {
			Future<String> future1 = executor.submit(new Task("Task"+i));
			
			System.out.println(future1.get());
		}
		
		executor.shutdown();
		
		executor.awaitTermination(4, TimeUnit.MINUTES);

	}

}
