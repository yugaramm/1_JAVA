package collection;

//카페 메뉴의 틀
public class Coffee {
	
	private String name;
	private String kind;
	private int price;
	private boolean sale; // 세일 유무
	
	public Coffee() {;}
	
	public Coffee(String name, String kind, int price, boolean sale) {
		this.name = name;
		this.kind = kind;
		this.price = price;
		this.sale = sale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isSale() {
		return sale;
	}

	public void setSale(boolean sale) {
		this.sale = sale;
	}

   @Override
   public String toString() {
      return "\nCoffee [name=" + name + ", kind=" + kind + ", price=" + price + ", sale=" + sale + "]";
   }
   
   // 객체간 메뉴 이름이 같다면, true
   @Override
   public boolean equals(Object obj) {
      if(this == obj) { // 주소값 비교
         return true;
      }
      
      if(obj instanceof Coffee) {
         return this.getName().equals(((Coffee)obj).getName());
      }
      
      return false;
   }

	
	

	
}
