package array;

import java.util.Scanner;

public class ArrayTask3 {
	public static void main(String[] args) {
	
		//사용자에게 배열의 칸 수를 입력 받고, 하나하나에 들어갈 값들도 전부 입력 받아 배열을 만들어라.
		
		int[] datas = null;
		int number = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 칸 짜리? ");
		
		datas = new int[sc.nextInt()];
		
		for (int i = 0; i < datas.length; i++) {
			System.out.print(i+1 +"번째 정수 입력>>");
			datas[i] = sc.nextInt();
		}
		
		for (int i = 0; i < datas.length; i++) {
			System.out.print(datas[i] + " ");
		}
		
		
		
	}
}
