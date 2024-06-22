package control_for;

public class ForTask {
	public static void main(String[] args) {
		//1~100까지 출력
		//100~1 까지 출력
		//1~100까지 중 짝수만 출력
		//1~100까지 중 홀수들의 합만 구해보기
		
		for(int i = 1; i<=100; i++) {
			System.out.println(i);
		}
		
		for(int i = 100; i>=1; i--) {
			System.out.println(i);
		}
		
		for(int i = 2; i<=100; i+=2) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i = 1; i<=100; i+=2) {
			sum+=i;
		}
			System.out.println(sum);
	}

}
