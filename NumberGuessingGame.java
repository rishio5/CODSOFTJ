import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets begin the Number Guessing Game!");
        System.out.println("I have selected a number between 1 to 100,Can you guess it?");

        int score = 0;
        boolean playAgain = true;
        while (playAgain) {
            int Attempts = 0;
            int MaxAttempts = 6;
            int TargetNum = random.nextInt(100) + 1;

            while (Attempts < MaxAttempts) {
                System.out.println("Guess any number: ");
                int UserGuess = scanner.nextInt();
                scanner.nextLine();
                score++;// you guessed the number in total of how many attempts
                Attempts++;

                if (UserGuess == TargetNum) {
                    System.out
                            .println("Congratulations you guessed the rignt number " + TargetNum + "in no of attempts "
                                    + Attempts);
                    score++;
                    System.out.println("Your score is: " + score);
                    break;
                } else if (UserGuess < TargetNum) {
                    System.out.println("Too Low!,Try Again");

                } else {
                    System.out.println("Too High!,Try Again");
                }
            }

            if (Attempts >= MaxAttempts) {
                System.out.println("Sorry you have reached maximum attempts " + "the correct number was:" + TargetNum);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game is over your score is:" + score);
        scanner.close();
    }
}
