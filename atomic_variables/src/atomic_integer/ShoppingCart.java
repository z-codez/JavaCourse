package atomic_integer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart {
	
	AtomicInteger totalPrice = new AtomicInteger();

	public static void main(String[] args) throws InterruptedException {
		ShoppingCart cart = new ShoppingCart();
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		for(int i = 1; i<1001; i++) {
			exec.execute(new Item(cart, 10));
		}
		
		
		exec.shutdown();
		
		System.out.println("Total price is: " + cart.totalPrice.get() );
		
		exec.awaitTermination(1, TimeUnit.HOURS);

	}

}

class Item implements Runnable {
	ShoppingCart cart;
	int price;
	
	public Item(ShoppingCart cart, int price) {
		this.cart = cart;
		this.price = price;
		//return;
	}


	@Override
	public void run() {
		cart.totalPrice.addAndGet(price);
	}
}

