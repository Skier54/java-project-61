package hexlet.code;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        //Cli.greeting();
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        //int gameNumber = scanner.nextInt();
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "0":
                System.out.println("Exit"); break;
            case "1":
                Greet.newGreet(); break;
            case "2":
                Even.checkingParity(); break;
            default :
                System.out.println("The game number was incorrectly dialed");
        }
        scanner.close();
    }
}
