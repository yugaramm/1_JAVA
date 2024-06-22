package method;

import java.util.Scanner;

public class Sample2 {
    // 1 ~ 사용자가 입력한 n까지의 합 구하기!
	int getSum(int num) {
		int total = 0;
		
		for (int i = 1; i <= num; i++) {
			total += i;
		}
		return total;
	}
	
	//A~F 까지 중 C 제외하고 출력
	void alphabet() {
		for (int i = 0; i < 5; i++) {
			System.out.print(i > 1? (char)(i+66)+ " ": (char)(i+65)+ " ");
		}
	}
	
//	최댓값 최솟값 구하기 (매개변수 수정!)
	int[] getMinMax(int[] datas) {
		int[] minMax = new int[2];
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
		
		return minMax;
	}
	
	
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(s.getSum(num));
		
		s.alphabet();
		
		int[] datas = {100,30,20,90,70};
		int[] minMax = null;
		
		minMax = s.getMinMax(datas);
		System.out.println(minMax[0] +" "+ minMax[1]);
		
	}
}
