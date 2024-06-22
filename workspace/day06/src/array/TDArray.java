package array;

public class TDArray {
	public static void main(String[] args) {
		int[][] datas = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

		for (int i = 0; i < datas.length; i++) {
			for (int j = 0; j < datas[i].length; j++) {
				System.out.print(datas[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				for (int k = 2; k < 10; k++) {
					System.out.print("=="+k+"단=="+"\t");
				}
				System.out.println();
				continue;
			}
			for (int j = 2; j < 10; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
