import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int randomNumber = (int) (Math.random() * 5) + 1;
        int numberGuess = scan.nextInt();

        while (numberGuess != randomNumber) {
            System.out.print("Guess again: ");
            numberGuess = scan.nextInt();
        }
        System.out.println("You got it!");

        // See Learn the Part for detailed instructions.

        scan.close();
    }

}
