package castring;

public class StringCasting {
	public static void main(String[] args) {
		String num = "123";
		System.out.println(num + 100); // 연결
		System.out.println(Integer.parseInt(num)); // 연산
		
		int result = Integer.parseInt(num) * 10;
		System.out.println(result);
		
		System.out.println(Double.parseDouble("3.14") + 10);
		
		// 자료형 초기값
		int data = 0;
		double weight = 0.0;
		char input = ' ';
		String name = "";
		// null 은 모든 클래스의 초기값
		String hometown = null;
		
		System.out.println(name + "가람");
		System.out.println(hometown + "광주");
		
	}

}
