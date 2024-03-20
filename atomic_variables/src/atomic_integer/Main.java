package atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {
	
	AtomicInteger count;
	
	public Counter() {
		count = new AtomicInteger();
	}
	

	@Override
	public void run() {
		
		for(int i = 0; i<30000; i++) {
			count.incrementAndGet(); // count.andAndGet(1);
		}
		
	}

}

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(counter, "Thread1");
		Thread thread2 = new Thread(counter, "Thread2");
		
		thread1.start();
		thread2.start();
		
		Thread.sleep(200);
		
		System.out.println(counter.count);
	}
}
