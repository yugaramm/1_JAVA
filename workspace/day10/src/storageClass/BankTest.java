package storageClass;

public class BankTest {
	public static void main(String[] args) {
		
		BankBook momCard = new BankBook();
		BankBook myCard = new BankBook();
		
		momCard.withdraw(1000);
		momCard.withdraw(1000);
		momCard.withdraw(1000);
		momCard.withdraw(1000);
		momCard.withdraw(1000);
		System.out.println(momCard.money);
		
		momCard = new BankBook();
		System.out.println("전역변수 : " + momCard.money);
		
		//정적 변수 Test
		momCard.withdraw_s(1000);
		momCard.withdraw_s(1000);
		momCard.withdraw_s(1000);
		momCard.withdraw_s(1000);
		momCard.withdraw_s(1000);
		System.out.println("정적변수 : " + momCard.money_s);
		
	
		System.out.println("엄마 정적변수 : " + momCard.money_s);
		System.out.println("나 정적변수 : " + myCard.money_s);
		
		//컴파일러가 직접 메모리에 올려주기 때문에, (프로그램이 시작되자마자)
		//객체로 접근할 필요 없이 소속만 알려주면 사용할 수 있다.
		System.out.println(BankBook.money_s);
		
		//스태틱 메소드도 컴파일러가 직접 메모리에 제일 먼저 올려준다.
		//1. 해당 클래스에 너무 많은 함수가 선언되어 있어 용량이 크다.
		//전체를 메모리에 올린 후에 하나를 사용하기 에는 부담스러울 때, 메소드 하나를 스태틱으로 선언한다.
		//ex) Integer.parseInt();
		
		//2. 자주 사용하는 메소드이기에 객체화 없이 사용하기 위해서 스태틱으로 선언한다.
		
		
	}
}
