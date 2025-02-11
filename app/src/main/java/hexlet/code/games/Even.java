package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.attempt;
import static hexlet.code.Engine.i;

public class Even {
    public static void checkingParity() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        String yesNo;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (i < attempt) {
            int randomInt = Engine.randomInt();
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            if (randomInt % 2 == 0) {
                yesNo = "yes";
            } else {
                yesNo = "no";
            }
            String userResult = scanner.next();
            if (yesNo.equals(userResult)) {
                Engine.correct();
            } else {
                System.out.print("'" + userResult);
                incorrectCorrect();
                System.out.println(yesNo + "'.");
                Engine.noCorrect();
                break;
            }
        }
        Engine.victory();
    }
}
