package threadTest;

public class Main2 {
	public static void main(String[] args) {
		
//		Thread1 t1 = new Thread1("유가람");
//		Thread t2 = new Thread(new Thread2("유가람"));
//		
//		t1.start();
//		t2.start();
		
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(500);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "유가람");
		Thread t2 = new Thread(target, "짱");
		
		
		t1.start();
		t2.start();
		
		//join() : 사용한 객체의 쓰레드가 모두 종료되어야 다른 쓰레드가 실행된다.
				// 이미 start()된 쓰레드에 영향을 끼치지 않는다.

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
	}
}
