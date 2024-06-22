package lambda;

public class LambdaTest {
	public static void main(String[] args) {
		
		//람다식은 항상 리턴이 있어야 한다.
		//한 줄에 끝낼 수 있을 때!
		InterA inter = (number) -> number % 2 == 0;
		
		System.out.println(inter.checkEven(10));
		
		InterA inter2 = (n) -> {
			System.out.println("짝수일까요?");
			return n % 2 == 0;
		};
		
		System.out.println(inter2.checkEven(13));
		
		
//		(int a, int b) -> {return a> b ? a: b}
//		(String name, int i) -> {System.out.println(name + "="+i);}
//		x -> x * x
//		() -> (int)(Math.random()*6)
//		(int[] arr) -> {
//			int sum = 0;
//			for (int i : arr) {
//				sum += i;
//				return sum;
//			}
//		}
	}
}
