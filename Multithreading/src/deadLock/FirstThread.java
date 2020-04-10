package deadLock;

public class FirstThread {

	public synchronized void foo(SecondThread b) {
		System.out.println("Thread1 starts execution of foo() method");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread 1 trying to call b.last() method");
		b.last();
		
	}
	
	public synchronized void last() {
		System.out.println("inside A, this s last() metod");
	}
}
