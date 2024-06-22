package array;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] datas = {1, 3, 5, 7, 9};
		System.out.println(datas); // 시작 주소
		System.out.println(datas[0]); // 값 하나 가져오기
		
		//배열의 칸수를 알 수 있다.
		System.out.println(datas.length);
		
		// for문과의 콜라보
		//datas 안에 저장되어 있는 정수 값의 총합과 평균을 출력
		int sum = 0;
		for (int i = 0; i < datas.length; i++) {
			sum += datas[i];
		}
		System.out.println(sum);
		System.out.println(sum/datas.length);
		
		System.out.println("=========================================");
		
		//배열을 하나 선언 하고, 5 ~ 1 까지 데이터를 넣고 출력.
		int[] numbers = new int[5];
		
		//배열에 값을 넣어주는 반복문 따로
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = 5 - i;
		}
		
		//배열의 값을 출력하는 반복문 따로
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		
	}

}
