package abstractTest;

public class Three_G extends Sellphone {

	@Override
	public void call() {
		System.out.println("입맛대로!");
	}

	@Override
	public void sendSMS() {
		System.out.println("재정의해서 사용할 수 있다!");
	}
	
	public static void main(String[] args) {
		Three_G t = new Three_G();
		
	}
}
