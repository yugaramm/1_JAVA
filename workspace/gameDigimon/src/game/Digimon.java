package game;

import java.util.Random;

public class Digimon {
   
   String[] rank = {"아구몬", "그레이몬", "메탈그레이몬", "워그레이몬"};
   
   String name;
   int hp;
   int exp;
   int feedCount;
   int rankNumber;
   
   Digimon(String name) {
      this.name = name;
      hp = 11;
      feedCount = 10;
   }
   
   void printInfo() {
	   System.out.println("이름 : " + name);
	   System.out.println("진화 상태 : " + rank[rankNumber]);
	   System.out.println("hp : " + hp);
	   System.out.println("exp : " + exp);
	   System.out.println("보유 먹이 수 : " + feedCount);
   }
   
   
   void fight() {
      if(hp <= 5) {
         System.out.println("먹기나 잠자기를 통해서 hp를 회복해주세요!\n");
      }
      else {
         Random r = new Random();
         int[] percent = new int[100];
         int rating = 55;
         
         for (int i = 0; i < rating; i++) {
            percent[i] = 1;
         }
         
         System.out.println("한 번 놀아볼까?");
         
         //악의 무리 대승리
         if(percent[r.nextInt(percent.length)] == 1) {
        	 System.out.println("★★★대승리★★★");
            exp += 20;
         }
         else {
        	 System.out.println("...힘든 싸움이었다...");
        	 hp -= 5;
        	 exp += 10;
         }
      }
   } //fight 끝
   
   void sleep() {
	   if(exp >= 5) {
		   System.out.print(this.name + "이(가) 자는 중");
		   for (int i = 0; i < 3; i++) {
			   try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			   System.out.print("... ");
		   }
		   System.out.println("\n아이고 잘잤다!\n");
		   hp += 10; 
		   exp -= 5;
	   }
	   else {
		   System.out.println("악의 무리를 무찌르고 exp를 획득하자!");
		   System.out.println("tip : 먹이를 먹어도 hp는 회복 할 수 있다.\n");
	   }
   } // sleep 끝
   
   void eat() {
	   if(feedCount <= 0) {
		   System.out.println("음식을 전부 소진했네요...");
		   return;
	   }
	   System.out.println("냠냠~");
	   feedCount--;
	   hp += 10;
   } // eat 끝
   
   void doEvolution() {
	   int needExp = 30;
	   if(rankNumber == 3) {
		   System.out.println("이미 최종 단계입니다!\n");
		   return;
	   }
	   
	   if(exp < needExp) {
		   System.out.println("경험치 더 채우고 와!");
	   }
	   else {
		   System.out.println(rank[rankNumber] + "진화!!!");
		   for (int i = 0; i < 3; i++) {
			   try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			   System.out.print("!!! ");
		   }
		   exp -= needExp;
		   if(hp < 11) {
			   hp = 11;
		   }
		   System.out.println("\n" + rank[++rankNumber] + "등장!!!\n");
	   }
   } // 진화 끝
   
   boolean lastFight() { // 최후의 전투 승패 결과
	      Random r = new Random();
	      int[] percent = new int[100];
	      int rating = 0;
	      
	      switch(rankNumber) {
	      case 3:
	         rating = 80;
	         break;
	      case 2:
	         rating = 60;
	         break;
	      case 1:
	         rating = 40;
	         break;
	      case 0:
	         rating = 20;
	         break;
	      default:
	         System.out.println("오류 발생!");
	      }

	      for (int i = 0; i < rating; i++) {
	         percent[i] = 1;
	      }
	      
	      if(percent[r.nextInt(percent.length)] == 1) { // 확률을 뚫었다면
	         return true;
	      }
	      return false;
	   }
	   
	   void end() { // 최후의 전투 승리시 실행할 함수
	      System.out.println("히어로 이름 : " + name);
	      System.out.println("히어로 등급 : " + rank[rankNumber]);
	      System.out.println("♡♥♡♥♡♥♡♥♡♥ 너무 고마워 ♡♥♡♥♡♥♡♥♡♥");
	   }
	   
	   Digimon reset() { // 최후의 전투 패배시 실행할 함수
	      return new Digimon(name);
	   }
   
}