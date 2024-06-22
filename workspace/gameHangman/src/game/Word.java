package game;

import java.util.Random;

public class Word {
	
	String books = "mood thing emphasis thought child enthusiasm replacement charity girl product player throat girlfriend role birthday environment promotion direction manager improvement";
	String[] words = books.split(" ");
	String selectWord = null;
	char[] characters;
	int count = 10;
	
	public Word() {
		Random random = new Random();
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];
	}
	
	
	public String toString() {
		String text = "";
		
		for(char c : characters) {
			text += c == '\u0000' ? '_' : c;
			text += ' ';
		}
//		System.out.println(selectWord);		
		return text;
	}
	
	
	void addGuess(char c) {
		boolean wrongGuess = true;
		for (int i = 0; i < selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
				wrongGuess = false;
			}
		}
		if(wrongGuess) {
			count--;
		}
	}
	
	
	boolean isCompleted() {
		for(char c : characters) {
			if(c == '\u0000') {
				return false;
			}
		}
		return true;
	}
	
	

}
