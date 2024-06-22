package threadTest;

public class Thread2 implements Runnable{

	String name;
	
	
	public Thread2(String name) {
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
