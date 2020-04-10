package waitNotifyAll;

public class MailWriter implements Runnable {

	private Mail mail;

	public MailWriter(Mail mail) {

		this.mail = mail;

	}

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		synchronized (mail) {
			try {
				System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
				mail.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(name + " waiter thread got notified at time:" + System.currentTimeMillis());
			System.out.println(name + " processed: " + mail.getMessage());

		}

	}

}
