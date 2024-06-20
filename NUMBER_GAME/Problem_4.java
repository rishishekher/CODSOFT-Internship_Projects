package NUMBER_GAME;
    
import java.util.Random;
import java.util.Scanner;

 class UserGuessCorrectNumber 
{
    public static void main(String[] args) 
    {
        int min = 1;
        int max = 100;

        Random random = new Random();

        int randomNumber = random.nextInt((max - min) + 1) + min;

        Scanner scanner = new Scanner(System.in);

        int userGuess = 0;

    // Repeat the prompt until the user guesses correctly
        while (userGuess != randomNumber) 
        {
            // Prompt the user to enter their guess
            System.out.print("Enter your guess (between " + min + " and " + max + "): ");
            userGuess = scanner.nextInt();

            // Provide feedback on the guess
            if (userGuess == randomNumber) 
            {
                System.out.println("Your guess is correct.");
            } else if (userGuess < randomNumber)
            {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        scanner.close();
    }
}
