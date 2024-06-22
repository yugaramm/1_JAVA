package ambiguityTest;

public class Test1 implements InterA, InterB{
	//두 인터페이스에 같은 이름, 같은 매개변수 종류인 디폴트 메소드가 선언되어있다면
	//무조건 재정의 후 사용해야 한다.
	
	
	@Override
	public void printName() {
		
		//부모에 선언된 메소드 호출
		InterA.super.printName();
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		
		t.printName();
	}

}
