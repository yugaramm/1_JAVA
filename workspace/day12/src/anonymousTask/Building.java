package anonymousTask;

public class Building { // 테스트
	public static void main(String[] args) {
		
		// 강남점
		// 본사에서 정해준 양식대로 보고 후에 오픈하자.
		Hollys gn = new Hollys();
		
		Form gnForm = new Form() {
			
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "스무디", "돌체라떼"};
				return menus;
			}
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(order.equals(menus[i])) {
						System.out.println("판매 완료");
						return; // 함수 종료
					}
				}
				System.out.println("메뉴가 없습니다.");
			}
		};
		
		gn.register(gnForm);
		
		// 신림점
		// 신림점은 무료 나눔 행사를 진행할 예정이다.
		// 본사에 제출할 양식에서 판매 방식은 구현할 필요가 없습니다.
		// 본사에는 전달 받는 양식을 검사할 때
		// 무료 나눔 행사 중인 매장이라면, "무료 나눔 행사중" 출력하고 검사 끝
		Hollys sl = new Hollys();
		
		FormAdapter slForm = new FormAdapter() {
			@Override
			public String[] getMenu() {
				String[] menus = {"아메리카노", "망고빙수", "돌체라떼"};
				return menus;
			}
		};
		
		sl.register(slForm);
		
		
		
		
		
		
	}
}
