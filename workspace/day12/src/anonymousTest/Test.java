package anonymousTest;

public class Test {
	public static void main(String[] args) {
		
		//Human 타입의 객체를 만드는데
		//추상메소드가 구현되지 않은 상태에서는 객체가 만들어질 수 없기 때문에
		//Human 클래스 내에 추상 메소드를 구현하기 위해
		//일회성으로 열리는 클래스 <- 익명 클래스 or 익명 내부 클래스
		Human yu = new Human() { // 일회성
			
			@Override
			public void talk() {
				System.out.println("수다떨기 좋아하는 류호근 강사");
			}
			
			@Override
			public void eat() {
				System.out.println("우리 할머니가 만든 갈비를 가장 맛있게 먹을 수 있다.");
			}
		};
		
		yu.talk();
		
		//익명 클래스에서 재정의된 내용은 해당 객체에서만 메모리에 존재
		Human sim = new Human() {
			
			@Override
			public void talk() {
				
			}
			
			@Override
			public void eat() {
				
			}
		};

		//인터페이스도 객체를 만들 수 있다.
		//무조건 익명 내부 클래스가 열린다.
		Animal ani = new Animal() {
			
			@Override
			public void sleep() {
				
			}
			
			@Override
			public void eat() {
				
			}
		};
		
		
	}
}
