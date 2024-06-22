package abstractTest;

public abstract class Sellphone {
	
	public String phoneNumber;
	
	//추상메소드 선언 가능
	//나머지는 일반 클래스와 동일
	public abstract void call();
	public abstract void sendSMS();
	
	public void printNum() {
		System.out.println("폰 번호는 : " + phoneNumber);
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
