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
    public static int[] isProgression(int randomInt, int difference) {
        int[] results = new int[NUMBER_SERIES];
        results[0] = randomInt;
        for (int j = 1; j < NUMBER_SERIES; j++) {
            results[j] = results[j - 1] + difference;
        }
        return results;
    }
    public static void arithmeticProgression() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Greet.newGreet();
        int result;
        int userResult;
        int i = 0;
        System.out.println("What number is missing in the progression?");
        while (i < ATTEMPT) {
            int randomInt = Engine.randomInt();
            int difference = random.nextInt(MAX_DIF) + 1;
            int index = random.nextInt(NUMBER_SERIES);
            int[] res = isProgression(randomInt, difference);
            result = res[index];
            System.out.print("Question: ");
            for (int j = 0; j < res.length; j++) {
                if (j == index) {
                    System.out.print(".. ");
                } else {
                    System.out.print(res[j] + " ");
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
