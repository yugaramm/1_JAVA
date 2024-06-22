package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) throws IOException {
      
//      BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
//      bw.write("류호근\n");
//      bw.newLine(); // 엔터를 때려라!
//      bw.write("짱이야");
////      bw.flush(); 버퍼를 비움
//      bw.close(); // 통로를 닫음, 버퍼를 비우는 기능도 함께 존재.
      
      
      // 입력 테스트
//      File file = new File("test.txt");
//      BufferedReader br = new BufferedReader(new FileReader(file));
      
      File file = new File("test1.txt");
      BufferedReader br;
      try {
         br = new BufferedReader(new FileReader(file));
         String line = null;
         while((line = br.readLine()) != null) {
            System.out.println(line);
         }
         
         
         br.close();
      } catch (FileNotFoundException e) {
         System.out.println("해당 경로가 존재하지 않습니다." + e.getMessage());
      }
      
//      System.out.println(br.readLine());
//      System.out.println(br.readLine());
//      System.out.println(br.readLine());
      
      // 파일에 있는 모든 텍스트를 출력해보기.
//      String line = null;
//      while((line = br.readLine()) != null) {
//         System.out.println(line);
//      }
//      
//      
//      br.close();
      
      
      
 
   }
}