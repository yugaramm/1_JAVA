package array;

import java.util.Scanner;

public class ArrayHomework1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//5개의 정수를 입력받고 배열에 담은 후 최댓값과 최솟값을 출력
		int[] numbers = new int[5];
		int max = 0;
		int min = 0;

		
		System.out.print("5개의 숫자를 입력하세요:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}

		max = numbers[0];
		min = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);

		
		
	}
}
