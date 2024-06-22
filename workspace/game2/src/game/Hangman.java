package game;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true; //게임 실행 또는 종료
	private RandomWord randomWord = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	//게임 실행 메서드!
	public void run() {
		do {
			displayWord(); //단어표시
			getUserInput(); //입력받음
			checkUserInput(); //맞을시 게임종료
		} while (running);
	}
	
	private void displayWord() {
		System.out.println(randomWord); //toString 생략가능
	}
	private void getUserInput() {
		System.out.print("한 문자 입력: ");
		String guess = scanner.nextLine(); //문자열 입력
		//입력받은 문자가 선택된 단어에 있는지 확인해서 있으면 문자배열에 넣기..!
		randomWord.addGuess(guess.charAt(0));
		//입력한 문자중에 첫번재출력 charAt(0)
		}
	
	private void checkUserInput() {
		// 다 맞추면 true 아니면 false리턴 메서드
		if(randomWord.isCompleted()) {
			running = false; // 반복문 종료
			System.out.println("정답입니다!");
			System.out.println("정답은: " + randomWord);
		}

	}

}