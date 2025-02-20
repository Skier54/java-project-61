package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Scanner;
import java.util.Random;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;

public class Calc {
    public static int isCals(int randomInt, int randomInt1, String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = randomInt + randomInt1;
                break;
            case "-":
                result = randomInt - randomInt1;
                break;
            case "*":
                result = randomInt * randomInt1;
                break;
            default:
                break;
        }
        return  result;
    }
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        Random random = new Random();
        int result;
        int userResult;
        int i = 0;
        System.out.println("What is the result of the expression?");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int randomInt1 = Engine.randomInt();
            String[] operations = {"+", "-", "*"};
            String operation = operations[random.nextInt(operations.length)];
            result = isCals(randomInt, randomInt1, operation);
            System.out.println("Question: " + randomInt + " " + operation + " " + randomInt1);
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
