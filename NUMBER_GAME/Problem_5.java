package NUMBER_GAME;

    import java.util.Random;
    import java.util.Scanner;
    
     class LimitNumberOfAttempts{
        public static void main(String[] args) {
            int min = 1;
            int max = 100;

            // Define the maximum number of attempts
            int maxAttempts = 10;
    
            Random random = new Random();
    
            int randomNumber = random.nextInt((max - min) + 1) + min;
    
            Scanner scanner = new Scanner(System.in);
    
            int userGuess = 0;
            int attemptCount = 0;
    
            // Repeat the prompt until the user guesses correctly or runs out of attempts
            while (userGuess != randomNumber && attemptCount < maxAttempts) {

                attemptCount++;
    
                // Prompt the user to enter their guess
                System.out.print("Attempt " + attemptCount + "/" + maxAttempts + " - Enter your guess (between " + min + " and " + max + "): ");
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
    
            // Check if the user ran out of attempts
            if (userGuess != randomNumber) {
                System.out.println("Sorry, you have used all sattempts.The correct number was: " + randomNumber);
            }
        }
    }
    
    

