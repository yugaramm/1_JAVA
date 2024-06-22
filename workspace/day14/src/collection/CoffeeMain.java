package collection;

public class CoffeeMain {
	public static void main(String[] args) {
		
		
		CoffeeService cf = new CoffeeService();
		
		Coffee c1 = new Coffee("아메리카노", "커피", 3500, false);
		Coffee c2 = new Coffee("플레인스무디", "논커피", 4500, true);
	    Coffee c3 = new Coffee("돌체라떼", "커피", 5500, false);
	    Coffee c4 = new Coffee("오레오 빙수", "빙수", 12000, true);
	    Coffee c5 = new Coffee("캐모마일 티", "논커피", 3500, true);
	    Coffee c6 = new Coffee("망고 빙수", "빙수", 13500, false);
	    Coffee c7 = new Coffee("오레오 빙수", "빙수", 18000, true);
	      
		cf.addMenu(c1);
		cf.addMenu(c2);
		cf.addMenu(c3);
		cf.addMenu(c4);
		cf.addMenu(c5);
		cf.addMenu(c6);
		
		System.out.println(cf.coffees);
		
		System.out.println(cf.sellMenu("플레인스무디"));
		System.out.println(cf.sellMenu("망고 빙수"));
		System.out.println(cf.sellMenu("돌체라떼"));
		
		System.out.println(cf.searchKind("빙수"));
		
		cf.addMenu(c7);
		System.out.println(CoffeeService.coffees);
	}
}
