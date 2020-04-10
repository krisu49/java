package synchronize;

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display display = new Display();
		MyThread myThread1 = new MyThread(display, "KRISHNA");
		MyThread myThread2 = new MyThread(display, "AJAY");
		myThread1.start();
		myThread2.start();
	}

}
