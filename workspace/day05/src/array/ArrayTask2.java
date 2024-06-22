package array;

public class ArrayTask2 {
	public static void main(String[] args) {
		
		//1~100까지 배열에 담은 후 짝수의 합 출력
		int[] numbers = new int[100];
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for (int i = 0; i < numbers.length; i+=2) {
			sum += numbers[i+1];
		}
		System.out.println(sum);
		
		
		
		//A~F 까지 중 C 제외하고 배열에 담은 후 출력
		char[] a = new char[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (char)(i<2 ? i+65 : i+66);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}
