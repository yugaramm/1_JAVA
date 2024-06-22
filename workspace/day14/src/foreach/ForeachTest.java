package foreach;

import java.util.Iterator;

public class ForeachTest {
	public static void main(String[] args) {
		
		int[][] datas = {{50,70,100},{1,8,6}};
		
		for(int[] i : datas) {
			for (int j : i) {
				System.out.println(j);
			}
		}
		
		
	}

}
