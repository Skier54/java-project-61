package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;

public class GCD {
    public static int isGCD(int randomInt, int randomInt1) {
        while (randomInt != 0 && randomInt1 != 0) {
            if (randomInt > randomInt1) {
                randomInt = randomInt % randomInt1;
            } else {
                randomInt1 = randomInt1 % randomInt;
            }
        }
        return randomInt + randomInt1;
    }
    public static void nod() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        int userResult;
        int result;
        int i = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int randomInt1 = Engine.randomInt();
            result = isGCD(randomInt, randomInt1);
            System.out.println("Question: " + randomInt + " " + randomInt1);
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
                i++;
            } else {
                System.out.print("'" + userResult);
                incorrectCorrect();
                System.out.println(result + "'.");
                Engine.noCorrect();
                break;
            }
        }
        if (i == ATTEMPT) {
            Engine.victory();
        }
    }
}
