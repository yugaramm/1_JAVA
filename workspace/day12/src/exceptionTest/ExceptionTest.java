package exceptionTest;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] datas = new int[5];
		ExceptionTest test = null;
		
		try {
//			System.out.println(10/0);
//			System.out.println(datas[5]);
			System.out.println(test.toString());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch(Exception e) { // 모든 예외의 부모
			System.out.println(e);
			System.out.println("예상하지 못한 에러가 발생했습니다.");
		}
		
		System.out.println("프로그램 정상 종료");
		
		
	}
}
