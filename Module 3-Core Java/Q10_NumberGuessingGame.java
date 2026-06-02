import java.util.Random;
import java.util.Scanner;

public class Q10_NumberGuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int r = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        int g;

        System.out.println("Guess the number between 1 and 100!");

        do {
            System.out.print("Enter your guess: ");
            g = sc.nextInt();

            if (g < r) {
                System.out.println("Too Low!");
            } else if (g > r) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You guessed it.");
            }

        } while (g != r);

        sc.close();
    }
}
