package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import java.util.Random;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.i;

public class Calc {
    public static final int MAT_OPERATION = 3;
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        Random random = new Random();
        int result = 0;
        int userResult;
        System.out.println("What is the result of the expression?");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int randomInt1 = Engine.randomInt();
            int operation = random.nextInt(MAT_OPERATION);
            switch (operation) {
                case 0:
                    System.out.println("Question: " + randomInt + " + " + randomInt1);
                    result = randomInt + randomInt1;
                    break;
                case 1:
                    System.out.println("Question: " + randomInt + " - " + randomInt1);
                    result = randomInt - randomInt1;
                    break;
                case 2:
                    System.out.println("Question: " + randomInt + " * " + randomInt1);
                    result = randomInt * randomInt1;
                    break;
                default:
                    break;
            }
            System.out.print("Your answer: ");
            try {
                userResult = scanner.nextInt();
            } catch (Exception e) {
                System.out.print("'" + scanner.next());
                incorrectCorrect();
                System.out.println(result + "'.");
                Engine.noCorrect();
                break;
            }
            if (result == userResult) {
                Engine.correct();
            } else {
                System.out.print("'" + userResult);
                incorrectCorrect();
                System.out.println(result + "'.");
                Engine.noCorrect();
                break;
            }
        }
        Engine.victory();
    }
}
