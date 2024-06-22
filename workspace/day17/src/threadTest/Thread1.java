package threadTest;

public class Thread1 extends Thread {
	
	public String name;
	
	
	public Thread1(String name) {
		this.name = name;
	}


	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
	
}
