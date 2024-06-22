package storageClass;

public class BankBook {
	
	public int money = 10000;
	
	public static int money_s = 20000;
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void withdraw_s(int money) {
		money_s -= money;
	}
	
	
}
