package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.i;

public class GCD {
    public static void nod() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        int userResult;
        int result;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int randomInt1 = Engine.randomInt();
            System.out.println("Question: " + randomInt + " " + randomInt1);
            System.out.print("Your answer: ");
            while (randomInt != 0 && randomInt1 != 0) {
                if (randomInt > randomInt1) {
                    randomInt = randomInt % randomInt1;
                } else {
                    randomInt1 = randomInt1 % randomInt;
                }
            }
            result = randomInt + randomInt1;
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
