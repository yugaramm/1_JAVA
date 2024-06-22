package control;

import java.util.Scanner;

public class IfTask3 {
	public static void main(String[] args) {
		//사용자에게 국영수 점수를 입력 받아 총점과 평균을 구한다. 평균(실수)
		//등급
		//90점 이상 : 'A'
		//80점 이상 90점 미만 : 'B'
		//70점 이상 80점 미만 : 'C'
		//60점 이상 70점 미만 : 'D'
		//나머지는 'F'
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		int total = 0;
		double d1 = 0.0;
		
		total = score1+score2+score3;
		System.out.println("총점: " + total);
		d1 = total / 3;
		System.out.printf("평균: %.2f\n", d1);
		
		if(d1 >= 90) {
			System.out.println("등급: A");
		}
		else if(d1 >= 80) {
			System.out.println("등급: B");
		}
		else if(d1 >= 70) {
			System.out.println("등급: C");
		}
		else if(d1 >= 60) {
			System.out.println("등급: D");
		}
		else {
			System.out.println("등급: F");
		}
	}

}
