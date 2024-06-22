package objectTest;

public class HashCodeTest {
	public static void main(String[] args) {
		
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		//new를 사용해서 객체를 만들어줬기에 HashCode도 달라야하지만
		//String 클래스에서 재정의를 해서 필드 안에 값의 해쉬코드를 가져오도록 했다.
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		
		
		
	}
}
