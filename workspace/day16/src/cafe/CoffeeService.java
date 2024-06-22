package cafe;

import java.util.HashMap;
import java.util.Map;

public class CoffeeService {
	
	public static Map<String, Coffee> coffees = new HashMap<>();
	
	public void addMenu(Coffee coffee) {
		coffees.put(coffee.getName(), coffee);
	}
	
	

}
