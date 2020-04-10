package waitNotifyAll;

public class MailNofier implements Runnable {

	private Mail mail;

	public MailNofier(Mail mail) {
		this.mail = mail;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
		try {
			Thread.sleep(1000);
			synchronized (mail) {
				mail.setMessage(name + " Notifier work done");
				//mail.notify();
				 mail.notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
