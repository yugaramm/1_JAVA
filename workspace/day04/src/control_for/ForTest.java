package control_for;

public class ForTest {
	public static void main(String[] args) {
		//본인의 이름을 10번 출력하는 구문을 작성
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "유가람");
		}
		
		//1부터 10까지의 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
