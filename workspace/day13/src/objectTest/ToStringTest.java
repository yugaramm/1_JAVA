package objectTest;

public class ToStringTest {
	public static void main(String[] args) {
		Animal js = new Animal(1,"진순이", 1, "진돗개", "3kg");
		Animal mn = new Animal(1,"푸들푸들", 1, "진돗개", "2kg");
		Animal navi = new Animal(2,"푸들푸들", 1, "진돗개", "2kg");
	
		System.out.println(js);
		
		System.out.println(js.equals(mn));
		System.out.println(mn.equals(navi));
		
		
		
	}
}
