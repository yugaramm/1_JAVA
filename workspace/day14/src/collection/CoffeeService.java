package collection;

import java.util.ArrayList;
import java.util.List;

//Coffee 클래스를 이용한 프로젝트를 진행하는데 있어
//필요한 기능들을 정의할 클래스!
public class CoffeeService {
	
	//coffee 메뉴들을 저장할 DB 선언하기!
	public static List<Coffee> coffees = new ArrayList<>();
	
//  coffee 메뉴 추가, 수정을 합쳐보자.
//  즉, 이미 있는 메뉴가 매개변수로 넘어온다면, 수정!
//  없는 메뉴가 넘어온다면, 추가!
  public void addMenu(Coffee newCoffee) {
     for (Coffee coffee : coffees) {
        if(coffee.equals(newCoffee)) { // Coffee 클래스에서 equals 재정의
           // 추가가 아닌 수정.
           coffees.set(coffees.indexOf(coffee), newCoffee);
           return;
        }
     }
     // 같은 이름을 가진 메뉴가 없다면,
     coffees.add(newCoffee);
  }
	
	//coffee 메뉴 삭제
	//메뉴의 이름으로 삭제
	public void removeMenu(String name) {
		
	      // 일반 for문
//      for (int i = 0; i < coffees.size(); i++) {
//         if(coffees.get(i).getName().equals(name)) {
//            coffees.remove(i);
//            return true;
//         }
//      }
//      return false;
		
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) { // 매개변수로 넘어온 이름을 가진 커피 객체를 찾음!
				coffees.remove(coffee);
				return;
			}
		}
		
	}
	
	//메뉴 판매
	//1. 이름을 받아와서, 가격을 리턴하는 메소드
	//2. 만약 sale 이 true 라면 10% 차감한 금액을 리턴
	
	public int sellMenu(String name) {
		int price = 0;
		
		for (Coffee coffee : coffees) {
			if(coffee.getName().equals(name)) {
				if(coffee.isSale()) {
					price = (int)(coffee.getPrice() * 0.9);
				}
				else {
					price = coffee.getPrice();
				}
				break; // 불필요한 반복을 제거!
			}
		}
		return price;
	}
	
	//메뉴 카테고리 검색
	//빙수 매개변수로 넘어오면, 빙수 카테고리의 모든 메뉴를 리턴
	public ArrayList<Coffee> searchKind(String kind){
		ArrayList<Coffee> result = new ArrayList<>();
		
		for (Coffee coffee : coffees) {
			if(coffee.getKind().equals(kind)) {
				result.add(coffee);
			}
		}
		return result;
	}
	
	   // 매개변수로 받은 메뉴들의 할인유무를
	   // 전부 true 로 변경하기
	   public void changeTrue(ArrayList<Coffee> searchKind) {
	      for (Coffee coffee : searchKind) {
	         for (Coffee coffee2 : coffees) {
	            if(coffee.equals(coffee2)) {
	               coffee2.setSale(true);
	               break;
	            }
	         }
	      }
	      
	      // 순수 자바에서는 값이 아닌 주소가 복사되면서 들어가기 때문에
	      // 검색결과 객체를 바로 수정해준다하더라도 
	      // 본래 ArrayList 도 수정이된다.
	      // 하지만, JDBC 에서는, 검색결과는 JAVA, 실제 데이터는 DB 에 존재하기에
	      // 이런 식으로 로직을 짜면 안된다.
//	      for (Coffee coffee : searchKind) {
//	         coffee.setSale(true);
//	      }
	   }
	
	
	
	

}
