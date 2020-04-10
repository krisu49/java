package notify;

public class ThreadA {
	
	public static void main(String[] args) {
		ThreadB threadB = new ThreadB();
		threadB.start();
		synchronized (threadB) {
			System.out.println("main thread calling wait() method");
			try {
				threadB.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main thread got notification call");
			System.out.println(threadB.total);
		}
	}

}
