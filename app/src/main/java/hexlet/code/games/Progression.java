package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.incorrectCorrect;
import static hexlet.code.Engine.ATTEMPT;

public class Progression {
    public static final int MAX_DIF = 5;
    public static final int NUMBER_SERIES = 10;
    public static void arithmeticProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Greet.newGreet();
        int result = 0;
        int userResult;
        int i = 0;
        System.out.println("What number is missing in the progression?");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int difference = random.nextInt(MAX_DIF) + 1;
            int index = random.nextInt(NUMBER_SERIES);
            System.out.print("Question: ");
            for (int j = 0; j < NUMBER_SERIES; j++) {
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
