package control;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		while(true) {
//			System.out.println("내일은 우리 강의 없어요!");
//		}
		
//		for( ; ;) {
//			System.out.println("내일은 우리 강의 없어요!");
//		}
		
		//while문을 for문 처럼 사용해보기
//		int count = 0;
		
//		while(count != 10) {
//			count++;
//			System.out.println(count + "유가람");
//		}
		Scanner sc = new Scanner(System.in);
		int count = 0, num = 0;
		
		count = sc.nextInt();
		
		while(true) {
			num++;
			System.out.println(num+"유가람");
			if(num == count) {
				break;
			}
		}
	}

}
