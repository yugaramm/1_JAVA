package streamTest;

import java.util.*;
import java.util.stream.*;

public class StreamTask {
	public static void main(String[] args) {
		
		//1~10까지 ArrayList에 담고 해당 리스트를 출력
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		//ABCDEF를 출력
		IntStream.rangeClosed(65, 70).forEach(e -> System.out.print((char)e));
		
		System.out.println();
		//A~F까지 중 D제외하고 ArrayList에 담고 출력
		List<Character> list2 = IntStream.rangeClosed(65, 70).filter(c -> c != 68).mapToObj(c -> (char)c).collect(Collectors.toList());
		System.out.println(list2);
		
		//한글을 정수로 변경
		//문자열.indexOf() 문자열 공이 저장되어있는 곳은 0번째 인덱스
		//문자열.charAt() 인덱스 번호를 넣으면 그 값을 반환
		String num1 = "공일이삼사오육칠팔구";
		String data1 = "공팔이구";
		data1.chars().map(n -> num1.indexOf(data1.charAt(data1.indexOf(n)))).forEach(System.out::print);
		
		System.out.println();
		//정수를 한글로 변경
		String num2 = "공일이삼사오육칠팔구";
		String data2 = "0829";
		data2.chars().map(c -> c - 48).forEach(c -> System.out.print(num2.charAt(c)));
	}
}
