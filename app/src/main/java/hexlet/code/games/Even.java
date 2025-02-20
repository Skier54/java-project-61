package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;

public class Even {
    public static boolean isEven(int randomInt) {
        return randomInt % 2 == 0;
    }
    public static void checkingParity() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        String yesNo;
        int i = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            yesNo = isEven(randomInt) ? "yes" : "no";
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

