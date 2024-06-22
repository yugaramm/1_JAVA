package operator;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
		// 두 정수를 입력 받아서 두 수의 차이를 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
//		System.out.println(num1 > num2 ? num1 - num2 : num2 - num1);
		
		//두 수를 입력 받아서 어떤 수가 더 큰지를 출력, 같다면 같습니다 출력
		System.out.println(num1 > num2 ? num1 : num1 == num2 ? "두 수가 같습니다." : num2);
		
	}

}