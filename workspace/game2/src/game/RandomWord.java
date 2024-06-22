package game;

import java.util.Random;

public class RandomWord {
	// https://randomwordgenerator.com/
	// https://www.browserling.com/tools/newlines-to-spaces

	//변수는 보통 private 메소드는 public
	private String books="requirement knowledge strategy situation application administration marketing response literature customer economics location refrigerator complaint philosophy combination judgment homework audience assignment";
	private String[] words = books.split(" "); // split : ()안의 문자로 잘라내서 배열로 리턴 => 엑셀에서 문자나누기랑 비슷
	private Random random = new Random(); // 랜덤 클래스 객체
	private String selectWord; //랜덤선택 단어
	private char[] characters; //문자배열
	
	public RandomWord() {
		// 생성자는 리턴타입이 없고 클래스와 이름이 같다
		selectWord = words[random.nextInt(words.length)]; //랜덤으로 선택됨
		characters = new char[selectWord.length()]; //배열의 크기는 단어의 길이
		
	}
	
	
	public String toString() {
		//기본은 주소값을 리턴하는데 새로 만들면 만든 문자열이 리턴
		
		String text = ""; //빈문자열
		for(char c : characters) {
			text += c=='\u0000'?'_':c; //삼항조건연산자
			text += ' '; // 한칸띄움
		}
		//System.out.println(selectWord); //미리보기
		return text; //'_' 리턴
	}

	public void addGuess(char c) {
		// 입력받은 문자가 선택된 단어에 있는지 확인하고 있으면 문자배열에 넣기
		for (int i = 0; i < selectWord.length(); i++) {
			if (c==selectWord.charAt(i)) {
				characters[i] = c; //해당 인덱스번호의 배열칸에 문자 넣어주기
			}
			
		}
		
	}
	public boolean isCompleted() {
		for (char c : characters) {
			if(c=='\u0000') {
				return false;// 하나라도 못맞춘 철자가 있으면 false 리턴
			}
		}
		return true; //반복문 전체에서 한번도 return false가 안됬으므로 다 맞췄음!
	}
	
}