package synchronizedTest;

public class BankBook implements Runnable{
	
	public int money;

	public BankBook() {
		this(10000);
	}
	
	public BankBook(int money) {
		this.money = money;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			withdraw(1000);
			try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	//1. 동기화를 걸어주는 첫번째 방법
	//   실제 접근하는 자원에다가 synchronized를 씌우는 방법
	
//	public void withdraw(int money) {
//		synchronized (this) {
//			this.money -= money;			
//		}
//		
//		System.out.println(Thread.currentThread().getName() + "이(가) " + money + "원 출금");
//		System.out.println("현재 잔액 : " + this.money + "원");
//	}
	
	//2. 자원에 접근하는 기능을 가진 메소드에 synchronized 키워드 추가
	public synchronized void withdraw(int money) {
		this.money -= money;			
		
		System.out.println(Thread.currentThread().getName() + "이(가) " + money + "원 출금");
		System.out.println("현재 잔액 : " + this.money + "원");
	}
}
