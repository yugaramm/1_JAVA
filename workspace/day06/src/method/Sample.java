package method;

import java.util.Scanner;

public class Sample {
	
	//두 정수 중 큰 값이 뭔지 알려주는 메소드
	int check(int num1, int num2) {
		return num1 > num2? num1 : num2;	
	}
	
	//1~n 까지 정수의 합을 리턴해주는 함수
	int getSum(int num) {
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
//	두 정수의 나눗셈을 해주는 메소드 (몫과 나머지를 둘 다 리턴)
	int[] divide(int num1, int num2) {
		int[] temp = new int[2];
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다");
			return temp = null;
		}
		
		temp[0] = num1 / num2;
		temp[1] = num1 % num2;
		
		return temp;
	}
	
	
//	최댓값 최솟값 구하기 (매개변수 수정!)
	void getMinMax(int[] datas, int[] minMax) {
		int min = datas[0];
		int max = datas[0];
		
		for (int i = 1; i < datas.length; i++) {
			if(min > datas[i]) {
				min = datas[i];
			}
			if(max < datas[i]) {
				max = datas[i];
			}
		}
		minMax[0] = min;
		minMax[1] = max;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sample s = new Sample();
		
		System.out.println(s.check(10, 5)+10);
		
		int num = sc.nextInt();
		
		System.out.println(s.getSum(num));
		
		int[] temp= s.divide(10, 0);

		if(temp != null) {
			System.out.println(temp[0]);
			System.out.println(temp[1]);
		}
		
		
		// 2
		int[] datas = {10, 50, 70, 60, 30};
		int[] minMax = new int[2];
		
		s.getMinMax(datas, minMax);
		
		System.out.println("최솟값 : " + minMax[0]);
		System.out.println("최댓값 : " + minMax[1]);
	}

}
