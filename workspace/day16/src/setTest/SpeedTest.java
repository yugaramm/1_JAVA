package setTest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class SpeedTest {
	public static void main(String[] args) {
		
		//List와 Set의 속도 비교
		
		int size = 10_000_000;
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		IntStream.range(0, size).forEach(value -> {
			list.add(value);
			set.add(value);
		});
		
		Instant start = Instant.now();
		list.contains(71000000);
		Instant end = Instant.now();
		long time =  Duration.between(start, end).toMillis();
		System.out.println("arrayList : " + time * 0.001 + "초");

		start = Instant.now();
		set.contains(71000000);
		end = Instant.now();
		time =  Duration.between(start, end).toMillis();
		System.out.println("set : " + time * 0.001 + "초");
	}
}
