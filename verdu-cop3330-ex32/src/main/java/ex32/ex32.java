package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;
import java.util.Random;

public class ex32 {

    public static void main (String[] Args){

          Scanner scanner = new Scanner(System.in);

          String repeat_game = "y";

          System.out.println("Let's play Guess the Number! \n");

          while (repeat_game.equals("y")) {
              System.out.print("Enter the difficulty level (1, 2, or 3): ");
              String difficulty = scanner.nextLine();

              if (difficulty.matches("[^0-9]+")){
                 System.out.println("Please enter a valid number.");
                 System.out.println("Do you wish to play again (Y/N)? ");
                 String play_again = scanner.nextLine();

                 if (play_again.equals("y") || play_again.equals("Y")) {
                      continue;
                 }
                 else {
                     System.exit(0);
                 }
              }

              int Difficulty = Integer.parseInt(difficulty);


              if (Difficulty == 1){
                 level1();

                 System.out.println("Do you wish to play again (Y/N)? ");
                 String play_again = scanner.nextLine();

                 if (play_again.equals("y") || play_again.equals("Y")) {
                      continue;
                  }
                 else {
                      System.exit(0);
                  }

              }
              else if (Difficulty == 2){
                 level2();

                 System.out.println("Do you wish to play again (Y/N)? ");
                 String play_again = scanner.nextLine();

                 if (play_again.equals("y") || play_again.equals("Y")) {
                      continue;
                  }
                 else {
                      System.exit(0);
                  }

              }
              else if (Difficulty == 3){
                 level3();

                 System.out.println("Do you wish to play again (Y/N)? ");
                 String play_again = scanner.nextLine();

                 if (play_again.equals("y") || play_again.equals("Y")) {
                      continue;
                  }
                 else {
                      System.exit(0);
                  }

              }
          }

    }

    public static void level1 () {

        int number;
        int guesses;
        int win = 0;
        int Guess;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        number = rand.nextInt(11);

        System.out.print("I have my number. What's your guess? ");
        String guess = scanner.next();
        Guess = Integer.parseInt(guess);
        guesses = 1;

        while (win == 0) {
            if (Guess < number) {
                System.out.print("Too low. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess > number) {
                System.out.print("Too high. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess == number){
                System.out.print("You got it in " + guesses + " guesses!\n");
                win = 1;
            }

        }
    }

    public static void level2 () {
        int number;
        int guesses;
        int win = 0;
        int Guess;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        number = rand.nextInt(101);

        System.out.print("I have my number. What's your guess? ");
        String guess = scanner.next();
        Guess = Integer.parseInt(guess);
        guesses = 1;

        while (win == 0) {
            if (Guess < number) {
                System.out.print("Too low. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess > number) {
                System.out.print("Too high. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess == number){
                System.out.print("You got it in " + guesses + " guesses!\n");
                win = 1;
            }

        }
    }

    public static void level3 () {
        int number;
        int guesses;
        int win = 0;
        int Guess;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        number = rand.nextInt(1001);

        System.out.print("I have my number. What's your guess? ");
        String guess = scanner.next();
        Guess = Integer.parseInt(guess);
        guesses = 1;

        while (win == 0) {
            if (Guess < number) {
                System.out.print("Too low. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess > number) {
                System.out.print("Too high. Guess again: ");
                Guess = scanner.nextInt();

                guesses += 1;
            }

            else if (Guess == number){
                System.out.print("You got it in " + guesses + " guesses!\n");
                win = 1;
            }

        }
    }

}
