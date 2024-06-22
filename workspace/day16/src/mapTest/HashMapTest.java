package mapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		//put, get
		map.put("유가람", 100);
		map.put("홍길동", 95);
		map.put("수원이", 85);
		map.put("하모", 90);
		
		System.out.println(map);
		
		//값 수정
		//put 메소드를 그대로 사용
		//이미 존재하는 키값이 put으로 넘어왔다면, value를 수정
		map.put("유가람", 0);
		System.out.println(map);
		
		//값 조회
		System.out.println("유가람 점수 : " + map.get("유가람"));
		
		//toString을 이용하지 않고 전체 항목 출력
		System.out.println("모든 항목 출력");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		//키 값이 존재하는지 확인
		String name = "유가람";
		if(map.containsKey("유가람")) {
			System.out.println("네 존재합니다!");
			System.out.println(name + " : " + map.get(name));
		}
		else {
			System.out.println("아니요 존재하지 않습니다!");
		}
		
		//삭제
		//키 값만 전달해주면 삭제 가능!
		map.remove("홍길동");
		System.out.println(map);
		
		
		
		
		
		
		
		
	}
}
