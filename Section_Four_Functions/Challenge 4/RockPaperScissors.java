import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        // Task 1: See if the user wants to play.
        String playGame = scan.nextLine();

        if (playGame.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String playerChoice = scan.nextLine();

            String computerChoice = computerChoice();
            String Winner = Result(playerChoice, computerChoice);

            printResult(playerChoice, computerChoice, Winner);
        } else {
            System.out.println("Darn, some other time...!");
        }
        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     * 
     * @return a choice (String).
     * 
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 0: returns the choice 'rock'
     *         if 1: returns the choice 'paper'
     *         if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int computerChoicePlay = (int) (Math.random() * 3);
        if (computerChoicePlay == 0) {
            return "rock";
        } else if (computerChoicePlay == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    /**
     * Function name: result - It returns the result of the game.
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     * 
     *         Inside the function:
     * 
     *         1. result is "You win!" if
     *         You: "paper" Computer: "rock"
     *         You: "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     * 
     *         Computer: "rock" You: "scissors"
     *         Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. result is "It's a tie" if: Your choice equals computer choice
     *         4. Otherwise, print "INVALID CHOICE" and exit the program.
     */
    public static String Result(String playerChoice, String computerChoice) {
        String message = "";
        if (playerChoice.equals("rock") && computerChoice.equals("scissors")
                || playerChoice.equals("paper") && computerChoice.equals("rock")
                || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            message = "You win!";
        } else if (playerChoice.equals("scissors") && computerChoice.equals("rock")
                || playerChoice.equals("rock") && computerChoice.equals("paper")
                || playerChoice.equals("paper") && computerChoice.equals("scissors")) {
            message = "You lose.";
        } else if (playerChoice.equals(computerChoice)) {
            message = "It's a Tie.";
        } else {
            System.out.println("INvalid CHOICE.");
            System.exit(0);
        }
        return message;
    }

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        return result;
    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }
}
