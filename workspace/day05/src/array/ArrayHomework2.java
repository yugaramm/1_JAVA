package array;

import java.util.Scanner;

public class ArrayHomework2 {
	public static void main(String[] args) {
		//사용자가 입력한 정수의 갯수만큼 배열을 만든 후 그 갯수만큼 정수를 입력 받아 요소를 채운 후, 그 요소들의 평균 구하기
		//평균은 소수점 둘째자리까지 출력
		Scanner sc = new Scanner(System.in);
		int[] datas = null;
		int sum = 0;
		
		datas = new int[sc.nextInt()];
		
		for (int i = 0; i < datas.length; i++) {
			datas[i] = sc.nextInt();
		}
		
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		System.out.printf("평균은 : %.2f",(double)(sum/datas.length));
		
		
		
		
		
	}
}
