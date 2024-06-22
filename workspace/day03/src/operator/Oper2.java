package operator;

import java.util.Scanner;

public class Oper2 {
   public static void main(String[] args) {
//      [강사 예제]
//      사용자에게 키를 입력받고
//      정수라면 정수로 출력, 실수라면 실수로 출력
//      삼항 연산자를 사용한다.
//      nextDouble() 사용!
      
//      예)  183 -> 183 출력
//         183.5 -> 183.5 출력
      
//      내가 입력한 값이 정수인지, 실수인지를 판단하는 게 문제!
//      전체에서 진수부를 뺐을 때 0인지 아닌지 판단
      double height = 0.0;
      String msg = "키를 입력 >> ", result = null;
      boolean check = false;
      Scanner sc = new Scanner(System.in);
      
      System.out.print(msg);
      height = sc.nextDouble();
      
      check = height - (int)height == 0;
      result = check ? (int)height + "cm" : height + "cm";
      
      System.out.println("결과 : " + result);
      
      
      
      
      
      
      
      
      
      
   }
}













