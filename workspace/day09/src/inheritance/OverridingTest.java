package inheritance;

class Animal{
	String name;
	int age;
	
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}

class Dog extends Animal{
	String species;
	
	public Dog(String name, int age, String species) {
		this.name = name;
		this.age = age;
		this.species = species;
	}

	@Override
	void printInfo() {
//		super.printInfo(); 많이 사용하지 않는 모양!
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종은 : " + species);
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Dog js = new Dog("진순이", 1, "족보있는 진돗개");
		
		js.printInfo();
		
		
		
		
	}

}
