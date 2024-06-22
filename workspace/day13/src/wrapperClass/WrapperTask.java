package wrapperClass;

public class WrapperTask {
	public static void main(String[] args) {
		
		//49,82.5,77.7F,'H',"유가람짱",true
		//위 6개의 값을 6칸 배열에 담기
		
		//for문을 사용하여 배열에 담긴 값 출력하기
		Object[] obj = {49,82.5,77.7F,'H',"유가람짱",true};
		
		for (int i = 0; i < 6; i++) {
			System.out.println(obj[i]);
		}
		
		
	}

}
