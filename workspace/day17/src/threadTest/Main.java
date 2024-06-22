package threadTest;

public class Main {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1("유가람");
		Thread1 t2 = new Thread1("♥");

		//run에 재정의해놓은 코드가 그냥 실행됐을 뿐
		//쓰레드가 새롭게 만들어진 건 아니다.
//		t1.run();
//		t2.run();
		
		t1.start();
		t2.start();
		
		
	}
}
