package method;

public class MethodTask {
//	int[] divide(int num1, int num2) {
//		int[] temp = new int[2];
//		
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			return null; // 함수의 종료
//		}
//		temp[0] = num1 / num2;
//		temp[1] = num1 % num2;
//		
//		return temp;
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		MethodTask mt = new MethodTask();
//		int[] temp = null;
//		temp = mt.divide(10, 5);
//		System.out.println(temp[0]);
//		System.out.println(temp[1]);
//		
//		
//	}
	
	
	
//	두 정수의 나눗셈을 해주는 메소드 (몫과 나머지를 둘 다 리턴)
	int[] divide(int num1, int num2) {
		int[] temp = new int[2];
		
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return null; // 함수의 종료.
		}
		temp[0] = num1 / num2;
		temp[1] = num1 % num2;
		
		return temp;
	}
	
//	최댓값 최솟값 구하기 (매개변수 수정!)
	void getMinMax(int[] datas, int[] minMax) {
		int max = datas[0];
		int min = datas[0];
		for (int i = 1; i < datas.length; i++) {
			if (max < datas[i]) {
				max = datas[i];
			}

			if (min > datas[i]) {
				min = datas[i];
			}
		}
		minMax[0] = min;
		minMax[1] = max;
	}
	
	
	public static void main(String[] args) {
		MethodTask mt = new MethodTask();
		// 1
		int[] temp = null;
		temp = mt.divide(10, 3);
		if(temp != null) {
			System.out.println("몫 : " + temp[0]);
			System.out.println("나머지 : " + temp[1]);
		}
		
		// 2
		int[] datas = {10, 50, 70, 60, 30};
		int[] minMax = new int[2];
		
		mt.getMinMax(datas, minMax);
		
		System.out.println("최솟값 : " + minMax[0]);
		System.out.println("최댓값 : " + minMax[1]);
		

	}
}
