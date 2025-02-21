package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.ATTEMPT;

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
        String[] strRandomInt = new String[ATTEMPT];
        int[] randomIntOne = new int[ATTEMPT];
        int[] randomIntTwo = new int[ATTEMPT];
        int[] result = new int[ATTEMPT];
        String[] strResult = new String[ATTEMPT];
        for (int i = 0; i < ATTEMPT; i++) {
            randomIntOne[i] = Engine.randomInt();
            randomIntTwo[i] = Engine.randomInt();
            result[i] = isGCD(randomIntOne[i], randomIntTwo[i]);
            strResult[i] = String.valueOf(result[i]);
            strRandomInt[i] = randomIntOne[i] + " " + randomIntTwo[i];
        }
        Engine.logic(strResult, strRandomInt, isGames);
    }
}
