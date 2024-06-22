package control;

import java.util.Scanner;

public class IfTask2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1);
		}
		else if(num2 > num1) {
			System.out.println(num2);
		}
		else {
			System.out.println("두 수가 같습니다.");
		}
	}

}
