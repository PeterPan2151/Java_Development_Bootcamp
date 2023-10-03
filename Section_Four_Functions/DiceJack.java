import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter 3 numbers between 1 and 6: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (isLessThan1(num1, num2, num3) || isHigherThan6(num1, num2, num3)) {
            System.out.println("You've entered values outside of range.");
            System.exit(0);
        }

        int sumNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Your sum: " + sumNumbers + "   Computer sum: " + sumOfDiceRolls);

        if (userWon(sumNumbers, sumOfDiceRolls)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nBetter luck next time.");
        }

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        scan.close();

    }

    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 2 || num3 < 1);
    }

    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}
