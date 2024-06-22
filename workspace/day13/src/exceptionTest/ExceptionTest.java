package exceptionTest;

public class ExceptionTest {
	
	public void sleep() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		
		try {
			e.sleep();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		//throw
		
		throw new ArithmeticException();
	}
}
