package streamTest;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		//range(1 ,100) : 1~99까지
		//rangeClosed(1 ,100) : 1~100까지
		//1 부터 100까지의 숫자들 중에서 짝수만 출력해주세요
		IntStream.rangeClosed(1, 100).forEach((e) -> {
			if(e % 2 ==0) {
				System.out.println(e);
			}
		});
		
		//filter() : 조건식을 작성하여 false일 경우 제외시킨다.
		//전달받은 매개변수를 그대로 메소드에 사용할 경우에는 참조형 문법을 사용할 수 있다.
		//소속::메소드명 --> 전달받은 값을 메소드의 매개변수로 바로 전달해준다.
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));
		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).forEach(System.out::println);
		
		//map() : 기존 값을 원하는 값으로 변경
		String data = "ABC";
		data.chars().map(c -> c+3).forEach((c) -> System.out.println((char)c));
		
		//인트스트림을 통해서 나온 데이터를 arrayList로 저장!
		//1~100까지 숫자 중 짝수만 저장하는 arrayList를 만들고 싶어요
		List<Integer> list = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
		System.out.println(list);
		
		//100부터 1까지 짝수만 담겨있는 arrayList
		List<Integer> list2 = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(list2);
		
		Set<Integer> set = IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 0).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toSet());
		System.out.println(set);
		
	}
}
