package inheritance;

class Animals{
	String name;
	int age;
	String species;
	
	void printInfo(){
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종 : " + species);
	}
}

class SickAnimal extends Animals{
	String disease;
	
	public SickAnimal(String name, int age, String species, String disease) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.disease = disease;
	}
	
	@Override
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종 : " + species);
		System.out.println("병명 : " + disease);
	}
	
	void cure() {
		System.out.println(name + "의 " + disease + " 이(가) 잘 치유되었습니다.");
	}
}


public class Task {
	public static void main(String[] args) {
		SickAnimal sa = new SickAnimal("푸들푸들", 10, "푸들", "감기");
		
		sa.printInfo();
		sa.cure();
		
		
		
	}
}
