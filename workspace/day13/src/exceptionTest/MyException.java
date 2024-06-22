package exceptionTest;

public class MyException extends Exception {
	public MyException() {
		super("음수를 입력하지 마세요.");
	}

}
