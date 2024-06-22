package cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CoffeeService cs = new CoffeeService();
		
		int choice = 0, price = 0;
		String menu = null;
		
		while(true) {
			System.out.println("1. 메뉴추가 및 수정\n2. 전체 메뉴 조회\n3.종료");
			System.out.print("선택 >> ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.print("추가하고픈 메뉴 입력 >> ");
				menu = sc.next();
				System.out.print("가격 입력 >> ");
				price = sc.nextInt();
				
				if(CoffeeService.coffees.containsKey(menu)) {
					System.out.println("이미 존재하는 메뉴입니다. 가격을 수정합니다.");
					cs.addMenu(new Coffee(menu, price));
				}
				else {
					System.out.println("메뉴를 추가합니다.");
					cs.addMenu(new Coffee(menu, price));
				}
				
				
				break;
			case 2:
				List<String> keys = new ArrayList<>(CoffeeService.coffees.keySet());
				List<Coffee> values = new ArrayList<>(CoffeeService.coffees.values());
				
				for (int i = 0; i < keys.size(); i++) {
					System.out.println(i+1 + "번째 메뉴 이름 : " + keys.get(i));
					System.out.println(i+1 + "번째 메뉴 가격 : " + values.get(i).getPrice());
				}
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
				break;
			default:
				System.out.println("번호 확인!");
				break;
			}
		}
		
		
	}
}
