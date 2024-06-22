package test;

public class Food {
	String name;
	int price;
	int number;
	
	public Food() {;}
	
	public Food(String name, int price, int number) {
		this.name = name;
		this.price = price;
		this.number = number;
	}
	
	public void printTotalPrice(int tip) {
		System.out.println(price + tip);
	}
}
