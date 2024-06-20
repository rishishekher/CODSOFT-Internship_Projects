package NUMBER_GAME;
import java.util.Random;
import java.util.Scanner;

class CompareUserGuess 
 {
    public static void main(String[] args) 
    {
        int min = 1;
        int max = 100;
        int userGuess;

        Random random = new Random();

        int randomNumber = random.nextInt((max - min) + 1) + min;

        Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter their guess
        System.out.print("Enter your guess (between " + min + " and " + max + "): ");
        userGuess = scanner.nextInt();

        scanner.close();

          // Output the user's guess
        System.out.println("You guessed: " + userGuess);

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

        // the generated number
        System.out.println("The generated number was: " + randomNumber);
    }
}

