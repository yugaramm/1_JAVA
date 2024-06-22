package access1;

public class Access3 {
	public static void main(String[] args) {
		Access1 a = new Access1();
		
		//default는 다른 패키지에서 접근 불가
		System.out.println(a.data1);
		System.out.println(a.data2);
		
		//protected는 다른 패키지에서 접근 불가
		//즉, 같은 패키지에서는 접근 가능
		System.out.println(a.data3);
		
		//private은 다른 클래스에서 접근 불가
		//System.out.println(a.data4);
	}

}
