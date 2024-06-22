package method;

public class MethodTest {
	
	//메소드의 선언은 항상 클래스 내부 영역!
	//두 정수 중 큰 값이 뭔지 알려주는 메소드
	int checkBig(int num1, int num2) {
//		int bigNumber = 0;
//		if(num1 > num2) {
//			bigNumber = num1;
//		}
//		else {
//			bigNumber = num2;
//		}
//		return bigNumber;
		return num1 > num2 ? num1 : num2;
	}
	
	//두 정수를 전달 받아 작은 수를 출력하는데, 같으면 같다 출력
	void checkSmall(int num1, int num2) {
		if(num1 == num2) {
			System.out.println("두 수는 같다");
		}
		else if(num1 > num2) {
			System.out.println("작은 수 : " + num2);
		}
		else {
			System.out.println("작은 수 : " + num1);
		}
	}
	
	
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		
		//두 숫자 중 큰 값에다가 10을 더해주고 싶어요
		int a = 15;
		int b = 20;
		int result = 0;
		
		result = mt.checkBig(a, b) + 10;
		System.out.println("결과 : " + result);
		
		//두 숫자 중 뭐가 더 작은지를 콘솔창에 출력
		mt.checkSmall(a, b);
	}
}
