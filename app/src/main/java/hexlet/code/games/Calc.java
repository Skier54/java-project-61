package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;
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
        Random random = new Random();
        String isGames = "What is the result of the expression?";
        String[] strRandomInt = new String[ATTEMPT];
        int[] randomIntOne = new int[ATTEMPT];
        int[] randomIntTwo = new int[ATTEMPT];
        int[] result = new int[ATTEMPT];
        String[] strResult = new String[ATTEMPT];
        for (int i = 0; i < ATTEMPT; i++) {
            randomIntOne[i] = Engine.randomInt();
            randomIntTwo[i] = Engine.randomInt();
            String[] operations = {"+", "-", "*"};
            String operation = operations[random.nextInt(operations.length)];
            result[i] = isCals(randomIntOne[i], randomIntTwo[i], operation);
            strResult[i] = String.valueOf(result[i]);
            strRandomInt[i] = randomIntOne[i] + " " + operation + " " + randomIntTwo[i];
        }
        Engine.logic(strResult, strRandomInt, isGames);
    }
}
