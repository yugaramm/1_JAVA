package threadTask;

public class ThreadTask{
	public static void main(String[] args) {
		
		//영화관에 3편의 영화를 상영할려고 한다.
		//영화 두 편은, 동시에 상영할거고 영화 한 편은 모든 영화가 끝나고 난 후에 상영할 예정이다.
		//상영 중인 영화는 제목 + 상영 중... 을 10번 출력하는 걸로 구현
		//Runnable 인터페이스를 이용해서 멀티 쓰레드를 구현하고 반드시 join()을 사용하세요
		
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " 상영 중...");
				try {Thread.sleep(500);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "1번 영화");
		Thread t2 = new Thread(target, "2번 영화");
		Thread t3 = new Thread(target, "3번 영화");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		
		
	}

}
