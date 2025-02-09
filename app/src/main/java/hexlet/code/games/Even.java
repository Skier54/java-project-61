package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Greet;
//import static hexlet.code.Engine.*;
import java.util.Scanner;

import static hexlet.code.Engine.attempt;
import static hexlet.code.Engine.i;

public class Even {
    public static void checkingParity() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        String yes = "yes";
        String no = "no";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        //int i = 0;
        while (i < attempt) {
            int randomInt = Engine.randomInt();
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            String yesNo = scanner.next();
            if (randomInt % 2 == 0) {
                if (yes.equals(yesNo)) {
                    Engine.correct();
                } else {
                    System.out.println("'" + yesNo + "' is wrong answer ;(. Correct answer was '" + yes + "'.");
                    Engine.noCorrect();
                    break;
                }
            } else {
                if (no.equals(yesNo)) {
                    Engine.correct();
                } else {
                    System.out.println("'" + yesNo + "' is wrong answer ;(. Correct answer was '" + no + "'.");
                    Engine.noCorrect();
                    break;
                }
            }
        }
        Engine.victory();
    }
}
