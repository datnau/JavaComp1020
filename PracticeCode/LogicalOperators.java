import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // logical operators = used to connect two or more expressions
        // && (AND) = both conditions must be true
        // || () = either condition must be true
        // != (NOT) = reverses boolean valua of condition
        Scanner in = new Scanner(System.in);

        System.out.println("Your are playing a game! Press q or Q to quit");
        String response = in.next();

        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
        in.close();
    }

}
