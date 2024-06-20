package NUMBER_GAME;
import java.util.Random;
import java.util.Scanner;

 class OptionOfMultipleRounds  
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            playGame(scanner);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Thank you for playing");
    }

    public static void playGame(Scanner scanner) {
        int min = 1;
        int max = 100;
        int maxAttempts = 10;

        Random random = new Random();

        int randomNumber = random.nextInt((max - min) + 1) + min;

        int userGuess = 0;
        int attemptCount = 0;

        // Repeat the prompt until the user guesses correctly or runs out of attempts
        while (userGuess != randomNumber && attemptCount < maxAttempts) {

            attemptCount++;

            // Prompt the user to enter their guess
            System.out.print("Attempt " + attemptCount + "/" + maxAttempts + "Enter your guess (between " + min + " and " + max + "): ");
            userGuess = scanner.nextInt();

            // Provide feedback on the guess
            if (userGuess == randomNumber) 
            {
                System.out.println("Your guess is correct.");
            } 
            else if (userGuess < randomNumber)
             {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }

        // Check if the user ran out of attempts
        if (userGuess != randomNumber) {
            System.out.println("Sorry, you have used all your attempts. The correct number was: " + randomNumber);
        }
    }
}

