package classTest;

import java.util.Scanner;

class Rocker {
   String pw;
   
   Rocker(){
      pw = "0000";
   }
   
   Rocker(String pw){
      this.pw = pw;
   }
   
   // 비밀번호 변경
   void updatePw(String newPw) {
      pw = newPw;
   }
}

class RockerService {
   Rocker choiceNewRocker(Scanner sc) {
      String pw = null;
      System.out.print("비밀번호 설정 >> ");
      pw = sc.next();
      return new Rocker(pw);
   }
   
   boolean choiceUsingRocker(String password, Scanner sc) {
      String pw = null;
      System.out.print("물건을 꺼내기 위해 비밀번호를 입력해주세요 >> ");
      pw = sc.next();
      return password.equals(pw);
   }
}

public class ClassTask {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      RockerService service = new RockerService();
      
      Rocker[] rockers = new Rocker[5];
      String mainMsg  = "사물함을 이용해봅시다!";
      String choiceMsg = "사물함 선택 (0번 종료) >> ";
      String choiceMenuMsg = "1. 물건 꺼내기\n2. 비밀번호 변경";
      int choice = 0;
      String pw = null;
      
      while(true) {
         System.out.println(mainMsg);
         System.out.print(choiceMsg);
         
         choice = sc.nextInt();
         
         if(choice == 0) {
            System.out.println("프로그램 종료");
            break;
         }
         
         switch(choice) {
         case 1:
            if(rockers[0] != null) {
               System.out.print(choiceMenuMsg);
               choice = sc.nextInt();
               if(choice == 1) {
                  if(service.choiceUsingRocker(rockers[0].pw, sc)) {
                     System.out.println("이용해주셔서 감사합니다.");
                     rockers[0] = null;
                  }
                  else {
                     System.out.println("비밀번호가 올바르지 않습니다.");
                  }
               }
               else {
                  System.out.print("변경하고픈 비밀번호 >> ");
                  pw = sc.next();
                  rockers[0].updatePw(pw);
               }
            }
            else {
               rockers[0] = service.choiceNewRocker(sc);
               System.out.println("설정 완료");
            }
            break;
            
         case 2:
            if(rockers[1] != null) {
            	System.out.print(choiceMenuMsg);
                choice = sc.nextInt();
                if(choice == 1) {                	
                	if(service.choiceUsingRocker(rockers[1].pw, sc)) {
                		System.out.println("이용해주셔서 감사합니다.");
                		rockers[1] = null;
                	}
                	else {
                		System.out.println("비밀번호가 올바르지 않습니다.");
                	}
                }
                else {
                    System.out.print("변경하고픈 비밀번호 >> ");
                    pw = sc.next();
                    rockers[1].updatePw(pw);
                 }
            }
            else {
               rockers[1] = service.choiceNewRocker(sc);
               System.out.println("설정 완료");
            }
            break;
            
         case 3:
        	 if(rockers[2] != null) {
             	System.out.print(choiceMenuMsg);
                 choice = sc.nextInt();
                 if(choice == 1) {                	
                 	if(service.choiceUsingRocker(rockers[2].pw, sc)) {
                 		System.out.println("이용해주셔서 감사합니다.");
                 		rockers[2] = null;
                 	}
                 	else {
                 		System.out.println("비밀번호가 올바르지 않습니다.");
                 	}
                 }
                 else {
                     System.out.print("변경하고픈 비밀번호 >> ");
                     pw = sc.next();
                     rockers[2].updatePw(pw);
                  }
             }
             else {
                rockers[2] = service.choiceNewRocker(sc);
                System.out.println("설정 완료");
             }
             break;
            
         case 4:
        	 if(rockers[3] != null) {
             	System.out.print(choiceMenuMsg);
                 choice = sc.nextInt();
                 if(choice == 1) {                	
                 	if(service.choiceUsingRocker(rockers[3].pw, sc)) {
                 		System.out.println("이용해주셔서 감사합니다.");
                 		rockers[3] = null;
                 	}
                 	else {
                 		System.out.println("비밀번호가 올바르지 않습니다.");
                 	}
                 }
                 else {
                     System.out.print("변경하고픈 비밀번호 >> ");
                     pw = sc.next();
                     rockers[3].updatePw(pw);
                  }
             }
             else {
                rockers[3] = service.choiceNewRocker(sc);
                System.out.println("설정 완료");
             }
             break;
            
         case 5:
        	 if(rockers[4] != null) {
             	System.out.print(choiceMenuMsg);
                 choice = sc.nextInt();
                 if(choice == 1) {                	
                 	if(service.choiceUsingRocker(rockers[4].pw, sc)) {
                 		System.out.println("이용해주셔서 감사합니다.");
                 		rockers[4] = null;
                 	}
                 	else {
                 		System.out.println("비밀번호가 올바르지 않습니다.");
                 	}
                 }
                 else {
                     System.out.print("변경하고픈 비밀번호 >> ");
                     pw = sc.next();
                     rockers[4].updatePw(pw);
                  }
             }
             else {
                rockers[4] = service.choiceNewRocker(sc);
                System.out.println("설정 완료");
             }
             break;
            
         default:
            System.out.println("번호를 다시 확인하세요.");
         }
      }
  
   }
}