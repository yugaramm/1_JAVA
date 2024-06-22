package access1;

public class Access1 {
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;
	
	//private 변수를 값으로써 활용하는 메소드
	public int getData4() {
		return data4;
	}
	
	public void setData4(int data) {
		data4 = data;
	}
	
	public static void main(String[] args) {
		Access1 a = new Access1();
		
		//private은 같은 클래스에서만 접근 가능하다
		System.out.println(a.data4);
	}

}
