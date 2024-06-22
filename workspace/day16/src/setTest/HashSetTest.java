package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> animalSet = new HashSet<>();
		
		animalSet.add("호랑이");
		animalSet.add("강아지");
		animalSet.add("토끼");
		animalSet.add("용");
		animalSet.add("양");
		
		System.out.println(animalSet);
		
		System.out.println(animalSet.add("판다"));
		System.out.println(animalSet.add("용"));
		
		Iterator<String> aniIter = animalSet.iterator();
		
//		System.out.println(aniIter.next());
//		System.out.println(aniIter.next());

		while(aniIter.hasNext()) {
		System.out.print(aniIter.next() + " ");
			
		}
		
		
	}
}
