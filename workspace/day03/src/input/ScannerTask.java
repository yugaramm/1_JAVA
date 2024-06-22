package input;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		// 자동 import 단축키 -> ctrl + shift + o
		
//		Scanner sc = new Scanner(System.in);
//		String num1 = null;
//		String num2 = null;
//		
//		System.out.print("첫번째 정수 : ");
//		num1 = sc.next();
//		
//		System.out.print("두번째 정수 : ");
//		num2 = sc.next();
//		
//		System.out.print("두 정수의 합 : ");
//		System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("첫번째 정수 : ");
		num1 = Integer.parseInt(sc.next());
		
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(sc.next());
		
		System.out.print("두 정수의 합 : ");
		System.out.printf("%d + %d = %d", num1, num2, num1+num2);
		
		
		
	}

}
