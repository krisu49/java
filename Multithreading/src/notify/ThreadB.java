package notify;

public class ThreadB extends Thread {

	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("Child thread starts calculataion");
			for (int i = 0; i < 100; i++) {
				total += i;

			}
			System.out.println("child thread giving notification call");
			this.notify();
		}
	}
}
