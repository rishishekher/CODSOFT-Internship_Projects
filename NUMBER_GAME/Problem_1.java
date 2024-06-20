package NUMBER_GAME;
import java.util.Random;

class RandomNumberGenerator {
    public static void main(String[] args) {
        // Define the range
        int min = 1;                                         
        int max = 100;

        int randomNumber;

   // Create an instance of the Random class

        Random random = new Random();                   
      // Generate a random number within the specified range 
      //  the range includes 100 - 1 + 1 = 100 possible 

        randomNumber = random.nextInt((max - min) + 1) + min;   
                                                                
    System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
   
