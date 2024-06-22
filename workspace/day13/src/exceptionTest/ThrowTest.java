package exceptionTest;

import java.util.Scanner;

public class ThrowTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		while(true) {
			System.out.print("양수 입력 >> ");
			choice = sc.nextInt();
			
			if(choice < 0) {
				try {
					throw new MyException();
				} catch (MyException e) {
					e.printStackTrace();
					break;
				}
			}
			
			
		}
		
	}

}
