package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Greet;

import java.util.Scanner;
import java.util.Random;

import static hexlet.code.Engine.attempt;
import static hexlet.code.Engine.i;

//import static hexlet.code.Engine.*;

public class Calc {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        Random random = new Random();
        int result = 0;
        int userResult;
        System.out.println("What is the result of the expression?");
        //int i = 0;
        while (i < attempt) {
            int randomInt = Engine.randomInt();
            int randomInt1 = Engine.randomInt();
            int operation = random.nextInt(3);
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
                System.out.println("'" + scanner.next() + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                Engine.noCorrect();
                break;
            }
            if (result == userResult) {
                Engine.correct();
            } else {
                System.out.println("'" + userResult + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                Engine.noCorrect();
                break;
            }
        }
        Engine.victory();
    }
}
