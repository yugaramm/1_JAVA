package abstractTest;

public class Two_G extends Sellphone {

	@Override
	public void call() {
		System.out.println("2G 전용 광대역 사용!");
	}

	@Override
	public void sendSMS() {
		System.out.println("2G는 문자 전화 공짜 아님!");
	}

}
