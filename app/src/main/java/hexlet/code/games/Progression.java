package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.i;

public class Progression {
    public static void arithmeticProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Greet.newGreet();
        int result = 0;
        int userResult;
        System.out.println("What number is missing in the progression?");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int difference = random.nextInt(5) + 1;
            int index = random.nextInt(10);
            System.out.print("Question: ");
            for (int j = 0; j < 10; j++) {
                randomInt = randomInt + difference;
                if (index == j) {
                    result = randomInt;
                    System.out.print(".. ");
                } else {
                    System.out.print(randomInt + " ");
                }
            }
            System.out.println();
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
