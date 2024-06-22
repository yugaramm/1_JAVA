package collection;

import java.util.ArrayList;

public class CoffeeMain_15 {
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
		cf.addMenu(c7);
		
      // 메뉴 카테고리 검색을 실행해서, 해당 메뉴들의 할인유무를 전부 true 로 바꾸기.
      System.out.println(cf.sellMenu("아메리카노") + "원");
      System.out.println(cf.sellMenu("돌체라떼") + "원");
      
      ArrayList<Coffee> searchKind = cf.searchKind("커피");
      cf.changeTrue(searchKind);
      
      System.out.println(cf.sellMenu("아메리카노") + "원");
      System.out.println(cf.sellMenu("돌체라떼") + "원");
		
		
		
		
	}
}
