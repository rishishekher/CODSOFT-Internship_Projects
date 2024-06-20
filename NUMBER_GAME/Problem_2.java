package NUMBER_GAME;
import java.util.Random;
import java.util.Scanner;

 class GuessNumber 
{
    public static void main(String[] args) 
    {
        
        int min = 1;
        int max = 100;

         Random random = new Random();

        int randomNumber = random.nextInt((max - min) + 1) + min;

        Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter their guess
        System.out.print("Enter your guess (between " + min + " and " + max + "): ");
        int userGuess = scanner.nextInt();

    // Close the scanner
        scanner.close();

          // Output the result
        System.out.println("You guessed: " + userGuess);
        System.out.println("The generated number was: " + randomNumber);

    // Check if the guess is correct
        if (userGuess == randomNumber) 
        {
            System.out.println("Your guess is correct.");
        } else {
            System.out.println("Your guess is incorrect.");
        }
    }
}
