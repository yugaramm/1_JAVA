package game;

import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"java", "programming", "computer", "hangman", "code", "algorithm"};
    private static final int MAX_TRIES = 6;

    private String secretWord;
    private StringBuilder currentGuess;
    private int triesLeft;

    public HangmanGame() {
        secretWord = WORDS[(int) (Math.random() * WORDS.length)];
        currentGuess = new StringBuilder("_".repeat(secretWord.length()));
        triesLeft = MAX_TRIES;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word. You have " + triesLeft + " tries left.");
        while (triesLeft > 0 && currentGuess.indexOf("_") != -1) {
            System.out.println("Current guess: " + currentGuess);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().charAt(0);
            if (!updateCurrentGuess(guess)) {
                triesLeft--;
                System.out.println("Incorrect guess. " + triesLeft + " tries left.");
            }
        }
        scanner.close();
        if (triesLeft == 0) {
            System.out.println("You lose! The word was: " + secretWord);
        } else {
            System.out.println("Congratulations! You guessed the word: " + secretWord);
        }
    }

    private boolean updateCurrentGuess(char guess) {
        boolean found = false;
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWord.charAt(i) == guess) {
                currentGuess.setCharAt(i, guess);
                found = true;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        HangmanGame hangman = new HangmanGame();
        hangman.play();
    }
}