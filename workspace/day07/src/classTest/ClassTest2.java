package classTest;

class Fruit{
	String name;
	int price;
	String homeTown = "거창";
	
	//기본 생성자
	Fruit(){;}
	
	//생성자
	//매개변수로 원산지를 전달해주지 않았을 때 실행되는 생성자
	Fruit(String name, int price){
		//this : 접근하는 객체의 주소를 담고있다.
		this.name = name;
		this.price = price;
		this.homeTown = "원산지 입력 필요";
	}

	//초기화 생성자
	public Fruit(String name, int price, String homeTown) {
		this.name = name;
		this.price = price;
		this.homeTown = homeTown;
	}
	
	
}

public class ClassTest2 {
	public static void main(String[] args) {
		//객체를 만들 때 생성자가 실행된다.
		Fruit apple = new Fruit("사과", 5000);
		System.out.println(apple.name);
		System.out.println(apple.price);
		System.out.println(apple.homeTown);

		Fruit mandarin = new Fruit("귤", 9900, "제주도");
		System.out.println(mandarin.name);
		System.out.println(mandarin.price);
		System.out.println(mandarin.homeTown);
		
		
		
	}
}
