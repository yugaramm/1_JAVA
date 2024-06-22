package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileTask {
   public static void main(String[] args) throws IOException {
      
      List<String> foods = Arrays.asList("잡채", "치킨", "뿌링클", "짜파게티");
      File file = new File("foods.txt");
      // 리스트에 있는 값들을 해당 파일에 저장하고 콘솔창에 출력해보기.
      // 저장을 할 때는 값 하나당 엔터로 구분한다.
//      BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//      
//      for (String food : foods) {
//         bw.write(food);
//         bw.newLine();
//      }
//      bw.close();
//      
//      BufferedReader br;
//      try {
//         br = new BufferedReader(new FileReader(file));
//         String line = null;
//         while((line = br.readLine()) != null) {
//            System.out.println(line);
//         }
//         br.close();
//      } catch (FileNotFoundException e) {
//         System.out.println("해당 경로가 존재하지 않습니다.");
//      }
      
      // 수정 (치킨 -> 옛날통닭)
//      BufferedReader br;
//      try {
//         br = new BufferedReader(new FileReader(file));
//         String temp = "", line = null;
//         
//         while((line = br.readLine()) != null) {
//            if(line.equals("치킨")) {
//               temp += "옛날통닭\n";
//               continue;
//            }
//            temp += line + '\n';
//         }
//         br.close();
//         
//         BufferedWriter bw = new BufferedWriter(new FileWriter(file));
//         bw.write(temp);
//         bw.close();
//      } catch (FileNotFoundException e) {
//         System.out.println("해당 경로가 존재하지 않습니다.");
//      }
      
      // 삭제 (잡채 삭제)
      BufferedReader br;
      try {
         br = new BufferedReader(new FileReader(file));
         String temp = "", line = null;
         
         while((line = br.readLine()) != null) {
            if(line.equals("잡채")) {
               continue;
            }
            temp += line + '\n';
         }
         br.close();
         
         BufferedWriter bw = new BufferedWriter(new FileWriter(file));
         bw.write(temp);
         bw.close();
      } catch (FileNotFoundException e) {
         System.out.println("해당 경로가 존재하지 않습니다.");
      }
      
   }
}
