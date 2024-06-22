package synchronizedTest;

public class MultiTest {
	public static void main(String[] args) {
		
		BankBook bankbook = new BankBook();
		
		//쓰레드를 두개 만들어서 돌림
		Thread me = new Thread(bankbook, "가람");
		Thread mom = new Thread(bankbook, "엄마");
		
		me.start();
		mom.start();
		
	}
}
