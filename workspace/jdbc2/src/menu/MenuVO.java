package menu;

public class MenuVO {
	
	private int menuNumber;
	private String menuName;
	private int menuPrice;
	
	// 기본생성자는 무조건 만들자
	public MenuVO() {;}

	public MenuVO(int menuNumber, String menuName, int menuPrice) {
		this.menuNumber = menuNumber;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	public int getMenuNumber() {
		return menuNumber;
	}

	public String getMenuName() {
		return menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof MenuVO) {
			if(this.menuNumber == ((MenuVO)obj).menuNumber) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	

}
