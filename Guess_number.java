import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");

        while (attempts < maxAttempts) 
        {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) 
            {
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                break;
            } 
            else if (guess < randomNumber) 
            {
                System.out.println("Too low! Try again.");
            } 
            else 
            {
                System.out.println("Too high! Try again.");
            }
        }

        if (attempts == maxAttempts) 
        {
            System.out.println("Sorry, you've run out of attempts. The number was: " + randomNumber);
        }

        scanner.close();
    }
}
