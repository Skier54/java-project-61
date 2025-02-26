package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;
import static hexlet.code.Engine.NUMBER_FINISH_PARAMETERS;
import static hexlet.code.Engine.NUMBER_START_PARAMETERS;
import static hexlet.code.Engine.ATTEMPT;
import static hexlet.code.Engine.NUMBER_PARAMETERS;

public class Even {
    public static boolean isEven(int randomInt) {
        return randomInt % 2 == 0;
    }

    public static void checkingParity() {
        String isGames = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int[] randomInt = new int[ATTEMPT];
        String[][] strResultRandom = new String[ATTEMPT][NUMBER_PARAMETERS];
        for (int i = 0; i < ATTEMPT; i++) {
            randomInt[i] = Utils.randomInt();
            strResultRandom[i][NUMBER_START_PARAMETERS] = isEven(randomInt[i]) ? "yes" : "no";
            strResultRandom[i][NUMBER_FINISH_PARAMETERS] = String.valueOf(randomInt[i]);
        }
        Engine.logic(strResultRandom, isGames);
    }
}
