package classTask;

import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car driver = null;
		
		String startMsg = "차를 구매했습니다";
		String nameInputMsg = "차의 이름은 >> ";
		String menuMsg = "1.문 열기\n2.문 닫기\n3.시동 걸기\n4.시동 끄기\n0.차 팔기";
		String choiceMsg = "메뉴 선택 >> ";
		String name = null;
		boolean exitFlag = false;
		int choice = 0, pw = 0, count = 0;
		
		System.out.println(startMsg);
		
		System.out.print(nameInputMsg);
		name = sc.nextLine();
		
		System.out.print("자동차 비밀번호를 입력하세요 >> ");
		pw = sc.nextInt();
		
		driver = new Car(name, pw);
		
		while(!exitFlag) {
			System.out.println(menuMsg);
			System.out.print(choiceMsg);
			choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("차를 팔았습니다");
				break;
			}
			
			switch(choice) {
			case 1:
				if(driver.door) {
					System.out.println("이미 문이 열려 있습니다.");
				}
				else {
					for (int i = 0; i < 3; i++) {
						System.out.print(i+1+"번째 비밀번호를 입력하세요 >> ");
						pw = sc.nextInt();
						if(driver.openDoor(pw)) {
							System.out.println("문 열림");
							break;
						}
						count++;
					}
					if(count == 3) {
						System.out.println("경찰 출동!");
						exitFlag = true;
					}
				}
				
				break;
			case 2:
				if(driver.door) {
					driver.closeDoor();
					System.out.println("잠금.");
				}
				else {
					System.out.println("이미 잠겨 있습니다.");
					break;
				}
				break;
			case 3:
				if(driver.door) {
					if(!driver.engine) {
						driver.engineStart();
						System.out.println("시동 켜짐");
					}
					else {
						System.out.println("이미 켜져있습니다.");
					}
				}
				else {
					System.out.println("문을 먼저 여세요");
				}
				break;
			case 4:
				if(driver.engine) {
					driver.engineStop();
					System.out.println("시동 꺼짐");
				}
				else {
					System.out.println("이미 꺼져있습니다.");
				}
				break;
			default:
			}
		}
		
		
	}
}
