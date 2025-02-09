package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit
                """);
        System.out.print("Your choice: ");
        String gameNumber = scanner.next();
        switch (gameNumber) {
            case "0":
                System.out.println("Exit"); break;
            case "1":
                Greet.newGreet(); break;
            case "2":
                Even.checkingParity(); break;
            case "3":
                Calc.calculator(); break;
            case "4":
                GCD.nod(); break;
            default :
                System.out.println("The game number was incorrectly dialed");
        }
        scanner.close();
    }
}
