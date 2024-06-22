package array;

public class ArrayTask {
	public static void main(String[] args) {
		//1~100 까지 배열에 담은 후 짝수만 출력
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for (int i = 0; i < 50; i++) {
			System.out.println(numbers[i*2+1]);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if(i % 2 == 0) {
				continue; // 즉시 다음 반복 실행
			}
			System.out.println(numbers[i]);
		}
		
		

	}
}
