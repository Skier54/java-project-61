package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_FINISH_PARAMETERS;
import static hexlet.code.Engine.NUMBER_START_PARAMETERS;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.NUMBER_PARAMETERS;

public class Prime {
    public static boolean isPrime(int randomInt) {
        if (randomInt < 2) {
            return false;
        } else if (randomInt == 2) {
            return true;
        }
        for (int j = 2; j <= randomInt / 2; j++) {
            if (randomInt % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkingPrime() {
        String isGames = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int a = 1;
        int[] randomInt = new int[ATTEMPT];
        String[][] strResultRandom = new String[ATTEMPT][NUMBER_PARAMETERS];
        for (int i = 0; i < ATTEMPT; i++) {
            randomInt[i] = Utils.randomInt() + a;
            strResultRandom[i][NUMBER_START_PARAMETERS] = isPrime(randomInt[i]) ? "yes" : "no";
            strResultRandom[i][NUMBER_FINISH_PARAMETERS] = String.valueOf(randomInt[i]);
        }
        Engine.logic(strResultRandom, isGames);
    }
}
