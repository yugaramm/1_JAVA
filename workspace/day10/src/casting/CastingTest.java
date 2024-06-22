package casting;

class Car{
	void engineStart() {
		System.out.println("부르릉~~");
	}
	
}

class Sonata extends Car{
	@Override
	void engineStart() {
		System.out.println("뽀로로롱~~");
	}
	
	void runNavi() {
		System.out.println("목적지를 입력하세요!");
	}
}


public class CastingTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		Sonata s1 = new Sonata();
		
		//up casting
		Car upC = new Sonata();
		//up casting이 된다 하더라도
		//자식에서 재정의한 메소드가 실행이 된다.
		upC.engineStart();
		//upC.runNavi(); 플러스 알파는 잘린다!
		
		//down casting
		//up casting이 된 객체만 down casting됨.
		Sonata downC = (Sonata)upC;
		downC.engineStart();
		downC.runNavi();
		
		//살려줄 +알파가 없기 때문에
		//Sonata 에 메모리 공간을 다 채울 수 없기 때문에 에러!
//		Sonata test = (Sonata) c1; 
		
	      // instanceof 테스트!
//      c1 s1 upC downC
      
//      c1 instanceof Car : true
      System.out.println(c1 instanceof Car);
//      c1 instanceof Sonata : false
      System.out.println(c1 instanceof Sonata);
//      s1 instanceof Car : true
      System.out.println(s1 instanceof Car);
//      s1 instanceof Sonata : true
      System.out.println(s1 instanceof Sonata);
//      upC instanceof Car : true
      System.out.println(upC instanceof Car);
//      upC instanceof Sonata : true
      System.out.println(upC instanceof Sonata);
//      downC instanceof Car : true
      System.out.println(downC instanceof Car);
//      downC instanceof Sonata : true
      System.out.println(downC instanceof Sonata);
		
		
		
		
		
		
		
		
	}
}
