package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;
import static hexlet.code.Engine.NUMBER_FINISH_PARAMETERS;
import static hexlet.code.Engine.NUMBER_START_PARAMETERS;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.NUMBER_PARAMETERS;


public class Calc {
    public static int isCals(int randomInt, int randomInt1, String operation) {
        int result = switch (operation) {
            case "+" -> randomInt + randomInt1;
            case "-" -> randomInt - randomInt1;
            case "*" -> randomInt * randomInt1;
            default -> throw new Error("Unknown operator: " + operation + " !");
        };
        return result;
    }

    public static void calculator() {
        Random random = new Random();
        String isGames = "What is the result of the expression?";
        int[] randomIntOne = new int[ATTEMPT];
        int[] randomIntTwo = new int[ATTEMPT];
        int[] result = new int[ATTEMPT];
        String[][] strResultRandom = new String[ATTEMPT][NUMBER_PARAMETERS];
        for (int i = 0; i < ATTEMPT; i++) {
            randomIntOne[i] = Utils.randomInt();
            randomIntTwo[i] = Utils.randomInt();
            String[] operations = {"+", "-", "*"};
            String operation = operations[random.nextInt(operations.length)];
            result[i] = isCals(randomIntOne[i], randomIntTwo[i], operation);
            strResultRandom[i][NUMBER_START_PARAMETERS] = String.valueOf(result[i]);
            strResultRandom[i][NUMBER_FINISH_PARAMETERS] = randomIntOne[i] + " " + operation + " " + randomIntTwo[i];
        }
        Engine.logic(strResultRandom, isGames);
    }
}
