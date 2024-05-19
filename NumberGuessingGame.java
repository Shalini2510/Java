import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minNumber = 1;
        int maxNumber = 100;
        int generatedNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int attempts = 0;
        int maxAttempts = 6;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between " + minNumber + " and " + maxNumber + ". Guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == generatedNumber) {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            } else if (guess < generatedNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            
            }
        }

        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you have reached the maximum number of attempts. The correct number was " + generatedNumber + ".");
        }

        scanner.close();
    }
}
