package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Digimon player = null;
		
		String startMsg = "★★★★★ 디지몬 세계를 구해줘 ★★★★★";
		String nameInputMsg = "함께할 아구몬의 이름을 정해줘 >> ";
		String menuMsg = "1.상태 확인 창\n2.악의 무리 무찌르기\n3.잠자기\n"
				+ "4.먹기\n5.진화하기\n6.최후의 전투\n7.게임 종료";
		String choiceMsg = "메뉴 선택 >> ";
		String exitChoiceMsg = "정말... 우리를 버릴거야...?\n1.미안해...\n2.다시 한 번 해볼게!";
		String finalFight = "최후의 전투 시작! 결과는?!";
		String name = null;
		int choice = 0, exitChoice = 0;
		boolean exitFlag = false;
		
		System.out.println(startMsg);
		
		System.out.print(nameInputMsg);
		name = sc.nextLine();
		
		player = new Digimon(name);
		while(!exitFlag) {
			System.out.println(menuMsg);
			System.out.print(choiceMsg);
			choice = sc.nextInt();
			
			if(choice == 7) {
				
				while(true) {
					System.out.println(exitChoiceMsg);
					exitChoice = sc.nextInt();
					if(exitChoice == 1) {
						exitFlag = true;
						break; // while문 탈출
					}
					else if(exitChoice == 2) {
						break;
					}
					else {
						System.out.println("다시 한 번 입력해주세요!");
					}
					
				}
				
				if(exitFlag) {
					System.out.println("안녕...");
					break;
				}
				else {
					System.out.println("고마워!" + player.name);
					System.out.println("다시 한 번 힘을 내보자구!");
					continue;
				}

			} // 종료하기 if닫는 중괄호
			
			switch(choice) {
			case 1:
				player.printInfo();
				break;
			case 2:
				player.fight();
				break;
			case 3:
				player.sleep();
				break;
			case 4:
				player.eat();
				break;
			case 5:
				player.doEvolution();
				break;
			case 6:
				System.out.println(finalFight);
				
				if(player.lastFight()) {
					player.end();
					exitFlag = true;
				}
				else {
					player = player.reset();
				}
				break;
			default:
				System.out.println("메뉴를 제대로 선택하세요!");
			}
			
		}// 큰 while문 닫는 중괄호
		
		sc.close();
	}
}
