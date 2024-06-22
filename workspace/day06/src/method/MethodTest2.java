package method;

import java.util.Scanner;

public class MethodTest2 {
	
	//1~n 까지 정수의 합을 리턴해주는 함수
	int getTotal(int num) {
		int total = 0;
		
		for (int i = 1; 1 <= num; i++) {
			total += i;
		}
		return total;
	}
	
	int getSum() {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int n = 0;
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	
	}
	
	int getPlus(Scanner sc) {
		int total = 0;
		int n = 0;
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
		MethodTest2 mt = new MethodTest2();
		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		
//		System.out.print("몇 까지의 합 >> ");
//		num = sc.nextInt();
//		System.out.println("총합 : " + mt.getTotal(num));
		
		int result = mt.getSum();
		System.out.println(result);
		
		int result2 = mt.getPlus(sc);
		System.out.println(result2);
		
		
		
	}
}
