package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;

import static hexlet.code.Engine.attempt;
import static hexlet.code.Engine.i;

public class GCD {
    public static void nod() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        int nodUser;
        int nod;
        System.out.println("Find the greatest common divisor of given numbers.");
        while (i < attempt) {
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
            nod = randomInt + randomInt1;
            try {
                nodUser = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("'" + scanner.next() + "' is wrong answer ;(. Correct answer was '" + nod + "'.");
                Engine.noCorrect();
                break;
            }
            if (nod == nodUser) {
                Engine.correct();
            } else {
                System.out.println("'" + nodUser + "' is wrong answer ;(. Correct answer was '" + nod + "'.");
                Engine.noCorrect();
                break;
            }
        }
        Engine.victory();
    }
}
