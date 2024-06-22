package foreach;

import java.util.Scanner;

public class ForeachTask {
   public static void main(String[] args) {
      
//      실습
//      두 학생의 점수가 배열에 담겨있다.
//      각 학생의 총점과 평균을 출력하세요.
      int[][] scores = {{100, 80, 65}, {40, 77, 30}};
      int num = 1;
      
//      for (int[] is : scores) {
//         // 큰 반복이 돌 때 마다 0으로 만들어줘야한다.
//         int total = 0;
//         double avg = 0.0;
//         for (int score : is) {
//            total += score;
//         }
//         
//         avg = total / (double)is.length;
//         avg = Double.parseDouble(String.format("%.2f", avg));
//         
//         System.out.println(++num + "번 학생");
//         System.out.println("총점 : " + total);
//         System.out.println("평균 : " + avg);
//         System.out.println();
//         
//      }
      
      
//      for (int[] is : scores) {
//    	  int total = 0;
//		for (int is2 : is) {
//			total += is2;
//		}
//		System.out.println(num++ + "번 학생");
//		System.out.println("총점 : " + total);
//		System.out.printf("평균 : " + "%.2f",total/3.0);
//		System.out.println();
//	}
      
      
      
      //2차원 배열에 학년별로 1,2학기 성적을 저장하고, 4년 전체 평점 평균을 출력하라. 에서
      //for each문을 이용하여 각 학년별로 평점을 구하고, 4년 전체 평점을 구하는 방법
      Scanner sc = new Scanner(System.in);
      double[][] datas = {{3.0,4.0},{3.5,4.0},{4.5,4.0},{3.5,4.0}};
	  double sum, total = 0.0;
      
      
      for (double[] ds : datas) {
    	  sum = 0.0;
		for (double ds2 : ds) {
			sum += ds2;
		}
		System.out.println(num++ + "학기 평균");
		System.out.println(sum/2);
		System.out.println();
		total += sum/8;
	}
      System.out.printf("총 평균 : %.2f", total);
      
      
      
      
      
      
   }
}









