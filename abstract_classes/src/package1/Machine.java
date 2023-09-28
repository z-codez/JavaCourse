package package1;


// Abstract classes hide the implementation details
abstract class Machine {
	
	/*
	 * 1. An abstract class must be declared with the abstract keyword;
	 * 2. Abstract classes cannot be instantiated.
	 * 3. It can have abstract and non-abstract methods
	 * 4. It can have static methods and constructors as well
	 * 5. It can have final methods which will force the subclass not to change the body of the method
	 * 
	 * */
	
	// Abstract methods forces the subclass to override it. Just like interfaces
	abstract void on(); // there is no method body in abstract methods.
	
	public void greet() {
		System.out.println("running...");
	}
}
