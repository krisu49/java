package deadLock;

public class SecondThread {
	
	public synchronized void bar(FirstThread a) {
		System.out.println("Thread2 starts execution of bar() method");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread2 trying to call a.last90 method");
		a.last();
	}

	public synchronized void last() {
		System.out.println("inside B, this s last() metod");
	}
}
