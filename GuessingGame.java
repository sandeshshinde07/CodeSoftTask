import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();

       int maxNum = 100;
       int numberOfAttempts = 10;
       int score = 0;

       boolean playAgain = true;
       while (playAgain) {
           int randomNum = random.nextInt(maxNum) + 1;
           int attempts = 0;
           boolean guessedCorrect = false;

           while (attempts < numberOfAttempts && !guessedCorrect) {
               System.out.print("Guess a number between 1 and " + maxNum + ": ");
               int guess = scanner.nextInt();
               attempts++;

               if (guess == randomNum) {
                   System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                   score++;
                   guessedCorrect = true;
               } else if (guess < randomNum) {
                   System.out.println("Too low! Try again.");
               } else {
                   System.out.println("Too high! Try again.");
               }
           }

           if (!guessedCorrect) {
               System.out.println("Sorry, you ran out of attempts. The number was " + randomNum + ".");
           }

           System.out.print("Do you want to play again? (y/n): ");
           char playAgainChoice = scanner.next().charAt(0);
           playAgain = playAgainChoice == 'y' || playAgainChoice == 'Y';

           System.out.println("Your current score is: " + score);
       }

       System.out.println("Thank You For Playing!");
   }
}