import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String usernameUser = scan.nextLine();

        System.out.print("- Password: ");
        String passwordUser = scan.nextLine();

        // see Learn the Part for the remaining instructions.
        while (!username.equals(usernameUser) || !password.equals(passwordUser)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            usernameUser = scan.nextLine();
            System.out.print("- Password: ");
            passwordUser = scan.nextLine();
        }
        System.out.println("Sign in successful. Welcome!");

        scan.close();

    }
}
