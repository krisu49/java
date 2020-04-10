package synchronize;

public class Display {

	public synchronized void wish(String name) {

		for (int i = 0; i < 5; i++) {
			System.out.print("Good Morning : ");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}

}
