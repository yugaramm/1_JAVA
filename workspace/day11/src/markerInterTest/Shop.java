package markerInterTest;

public class Shop {
	
	//북3,4
	//s23, s24
	//한 번에 업캐스팅 할 수 있도록 구현
	//북3,4 객체가 업캐스팅 되어 들어왔다면
	//워치를 사은품으로 드립니다! 출력
	//s23,s24 객체가 업캐스팅 되어 들어왔다면
	//버즈를 사은품으로 드립니다! 출력
	public void checkType(SamsungStuff samsung) {
		if(samsung instanceof LaptopMarker) {
			System.out.println("워치를 사은품으로 드립니다!");
		}
		else if(samsung instanceof MoblieMarker) {
			System.out.println("버즈를 사은품으로 드립니다!");
		}
		else {
			System.out.println("사은품은 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		Shop s = new Shop();
		
		s.checkType(new GalaxyBook3());
		s.checkType(new GalaxyS23());
	}

}
