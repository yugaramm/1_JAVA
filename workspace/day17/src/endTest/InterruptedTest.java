package endTest;

import java.util.Iterator;

class T1 implements Runnable{

	@Override
	public void run() {
		//System.out.println(Thread.interrupted());
		for (int i = 0; i < 10; i++) {
			
			if(Thread.interrupted()) {
				System.out.println("인트럽트 발생!!");
				break;
			}
			
			System.out.println(i);
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

public class InterruptedTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new T1());
		
		t1.start();
		t1.interrupt();
				
				
	}
}
