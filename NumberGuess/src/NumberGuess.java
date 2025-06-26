
import java.util.*;

public class NumberGuess {

    public static void main(String[] args) {

        int range = -1;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What number range would you like to guess?:");
            System.out.println("1. 1-10 (Easy)\n2. 1-25 (Normal)\n3. 1-50 (Hard)\n4. 1-100 (Extreme)");
            range = input.nextInt();

            if (range < 1 || (range > 4 && range != 10 && range != 25 && range != 50 && range != 75 && range != 100)) {
                System.out.println("Invalid range. Try again.\n");
                continue;
            }

            int max = 0;
            if (range == 1 || range == 10) {
                max = 10;
            }
            if (range == 2 || range == 25) {
                max = 25;
            }
            if (range == 3 || range == 50) {
                max = 50;
            }
            if (range == 4 || range == 100) {
                max = 100;
            }

            int numGuess = rand.nextInt(max) + 1;
            int guess = -1;
            int attempts = 0;

            while (guess != numGuess && guess != 0) {
                System.out.println("Pick a number from 1 to " + max + "! 0 to exit.");
                guess = input.nextInt();

                if (guess == numGuess) {
                    attempts++;

                    System.out.println("You've guessed it!");

                    if (attempts == 1) {
                        System.out.println("Wow you're some kind of psychic!");
                    } else if (attempts <= 3) {
                        System.out.println("You're a natural! You've got some skills!");
                    } else if (attempts <= 10) {
                        System.out.println("Took you some time. But you got it! Nice.");
                    } else if (attempts <= 25) {
                        System.out.println("You finally got it... Congrats. Maybe you should take a break.");
                    } else {
                        System.out.println("ZZZ... Oh you're FINALLY DONE!");
                    }

                    System.out.println("Attempts: " + attempts);
                } else if (guess != 0) {
                    attempts++;

                    if (guess > numGuess) {
                        System.out.println("Too high! Try a lower number.");
                    } else {
                        System.out.println("Too low! Try a higher number.");
                    }
                }
            }

            break;
        }

        input.close();
    }
}
