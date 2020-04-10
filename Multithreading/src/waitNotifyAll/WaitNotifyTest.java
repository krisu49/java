package waitNotifyAll;

public class WaitNotifyTest {

	public static void main(String[] args) {
		
		Mail mail = new Mail("Mail is processing");
		MailWriter mailWriter1 = new MailWriter(mail);
		new Thread(mailWriter1,"mailWriter1").start();
		
		
		MailWriter mailWriter2 = new MailWriter(mail);
		new Thread(mailWriter2,"mailWriter2").start();
		
		MailNofier mailNofier = new MailNofier(mail);
		new Thread(mailNofier, "mailNofier").start();
		System.out.println("All threads has been started ");
		

	}

}
