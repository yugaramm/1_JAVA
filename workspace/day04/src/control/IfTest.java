package control;

public class IfTest {
	public static void main(String[] args) {
		int num = 49;
		
//		if(num >= 30) {
//			System.out.println("num은 30 이상이다.");
//		}
//		if(num >= 20) {
//			System.out.println("num은 20 이상이다.");
//		}
//		if(num >= 50) {
//			System.out.println("num은 50 이상이다.");
//		}
		
		if(num >= 50) {
			System.out.println("num은 50 이상이다.");
		}
		else if(num >= 30) {
			System.out.println("num은 30 이상이다.");
		}
		else if(num >= 20) {
			System.out.println("num은 20 이상이다.");
		}//조건식 모두 false 일 때 실행할 구문이 따로 없다면, else는 작성하지 않아도 문법상 문제는 없다.
	}

}
