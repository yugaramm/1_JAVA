package access2;

import access1.Access1;

public class Access2 {
	public static void main(String[] args) {
		Access1 a = new Access1();
		
		//public에서만 접근 가능
		System.out.println(a.data2);
		
		//private 메소드로 접근 테스트
		System.out.println(a.getData4());
		a.setData4(4000);
		System.out.println(a.getData4());
		
		
	}

}
