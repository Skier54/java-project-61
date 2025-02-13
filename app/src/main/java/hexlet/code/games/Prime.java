package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;

public class Prime {
    public static void checkingPrime() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        final int a = 1;
        String yesNo = "no";
        int i = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt() + a;
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            if (randomInt == 1) {
                yesNo = "no";
            } else if (randomInt == 2) {
                yesNo = "yes";
            }
            for (int j = 2; j < randomInt; j++) {
                if (randomInt % j == 0) {
                    yesNo = "no";
                    break;
                } else {
                    yesNo = "yes";
                }
            }
            String userResult = scanner.next();
            if (yesNo.equals(userResult)) {
                Engine.correct();
                i++;
            } else {
                System.out.print("'" + userResult);
                incorrectCorrect();
                System.out.println(yesNo + "'.");
                Engine.noCorrect();
                break;
            }
        }
        if (i == ATTEMPT) {
            Engine.victory();
        }
    }
}
