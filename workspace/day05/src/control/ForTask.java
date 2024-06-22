package control;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		정수를 하나 입력 받고 그 숫자만큼의 누적합을 구하기
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			sum += i+1;
		}
		System.out.println(sum);
		
	      // 정수를 하나 입력 받고 그 숫자만큼의 누적합을 구하기
	      // 1 ~ n까지의 합 구하기!
//	      Scanner sc = new Scanner(System.in);
//	      int num = 0, total = 0;
//	      
//	      System.out.print("정수 입력 >> ");
//	      num = sc.nextInt();
//	      
//	      for (int i = 0; i < num; i++) {
//	         total += i+1;
//	      }
//	      
//	      System.out.println("1부터 " + num + "까지의 합은 : " + total);
		
		//A~F까지 출력
		for(char c1 = 65; c1 <= 70; c1++) {
			System.out.print(c1);
		}
		
		System.out.println();
		//A~F 까지 중 C 제외하고 출력
		for (int i = 0; i < 5; i++) {
			System.out.print(i > 1? (char)(i+66): (char)(i+65));
		}
		
	}

}
