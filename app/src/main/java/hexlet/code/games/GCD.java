package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_FINISH_PARAMETERS;
import static hexlet.code.Engine.NUMBER_START_PARAMETERS;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.NUMBER_PARAMETERS;

public class GCD {
    public static int isGCD(int randomInt, int randomInt1) {
        while (randomInt != 0 && randomInt1 != 0) {
            if (randomInt > randomInt1) {
                randomInt = randomInt % randomInt1;
            } else {
                randomInt1 = randomInt1 % randomInt;
            }
        }
        return randomInt + randomInt1;
    }

    public static void nod() {
        String isGames = "Find the greatest common divisor of given numbers.";
        int[] randomIntOne = new int[ATTEMPT];
        int[] randomIntTwo = new int[ATTEMPT];
        int[] result = new int[ATTEMPT];
        String[][] strResultRandom = new String[ATTEMPT][NUMBER_PARAMETERS];
        for (int i = 0; i < ATTEMPT; i++) {
            randomIntOne[i] = Utils.randomInt();
            randomIntTwo[i] = Utils.randomInt();
            result[i] = isGCD(randomIntOne[i], randomIntTwo[i]);
            strResultRandom[i][NUMBER_START_PARAMETERS] = String.valueOf(result[i]);
            strResultRandom[i][NUMBER_FINISH_PARAMETERS] = randomIntOne[i] + " " + randomIntTwo[i];
        }
        Engine.logic(strResultRandom, isGames);
    }
}
