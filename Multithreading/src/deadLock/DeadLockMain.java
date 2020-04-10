package deadLock;

public class DeadLockMain implements Runnable {

	FirstThread firstThread = new FirstThread();
	SecondThread secondThread = new SecondThread();
	
	public DeadLockMain() {
		Thread t = new Thread(this);
		t.start();
		firstThread.foo(secondThread);
	}

	@Override
	public void run() {
		secondThread.bar(firstThread);
	}
	
	public static void main(String[] args) {
		new DeadLockMain();
		
	}
}
