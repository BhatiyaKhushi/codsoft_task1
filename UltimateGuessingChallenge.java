package com.codsoft.game;

import java.util.Random;
import java.util.Scanner;

public class UltimateGuessingChallenge {

	    private static final int MAX_ATTEMPTS = 5;
	    private static final int MIN_RANGE = 1;
	    private static final int MAX_RANGE = 100;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int totalScore = 0;
	        int roundsPlayed = 0;

	        boolean playAgain;

	        do {
	            int randomNumber = random.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
	            int attemptsLeft = MAX_ATTEMPTS;
	            boolean roundWon = false;

	            System.out.println("Welcome to UltimateGuessingchallenge!");
	            System.out.println("Guess the number between " + MIN_RANGE + " and " + MAX_RANGE + ".");

	            while (attemptsLeft > 0) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();

	                if (userGuess == randomNumber) {
	                    System.out.println("Congratulations! You've guessed the correct number.");
	                    roundWon = true;
	                    totalScore += attemptsLeft;
	                    break;
	                } else if (userGuess > randomNumber) {
	                    System.out.println("Your number is too high! Try again.");
	                } else {
	                    System.out.println("Your number is too low! Try again.");
	                }

	                attemptsLeft--;
	                System.out.println("Attempts left: " + attemptsLeft);
	            }

	            if (!roundWon) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was " + randomNumber + ".");
	            }

	            roundsPlayed++;
	            System.out.println("Your current score: " + totalScore);
	            System.out.print("Do you want to play another round? (yes/no): ");
	            playAgain = scanner.next().equalsIgnoreCase("yes");

	        } while (playAgain);

	        System.out.println("Thanks for playing UltimateGuessingchallenge!");
	        System.out.println("Total rounds played: " + roundsPlayed);
	        System.out.println("Your final score: " + totalScore);
	    }
}
