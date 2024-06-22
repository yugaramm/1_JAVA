package game;

import java.util.Scanner;

public class Hangman {
	
	boolean running = true; //게임 실행 또는 종료
	Word w = new Word();
	Scanner sc = new Scanner(System.in);
	
	//게임 실행 메서드!
	public void run() {
		while(running){
			displayWord(); //단어표시
			getUserInput(); //입력받음
			checkUserInput();//맞는지 체크
			System.out.println("남은 기회 : " + w.count);
		}
	}
	
	private void displayWord() {
		System.out.println(w);
	}
	private void getUserInput() {
		System.out.print("알파벳 하나를 입력하세요 >> ");
		String guess = sc.nextLine();
		w.addGuess(guess.charAt(0));
		
		if(w.count <= 0) {
			running = false;
			System.out.println("기회를 모두 소진하였습니다");
			System.out.println("정답은 : " + w.selectWord);
		}
	}
	private void checkUserInput() {
		if(w.isCompleted()) {
			running = false;
			System.out.println("정답입니다!");
			System.out.println("정답은 : " + w.selectWord);
			
		}
	}

}
