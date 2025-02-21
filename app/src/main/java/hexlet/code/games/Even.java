package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.ATTEMPT;

public class Even {
    public static boolean isEven(int randomInt) {
        return randomInt % 2 == 0;
    }
    public static void checkingParity() {
        String isGames = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] strRandomInt = new String[ATTEMPT];
        int[] randomInt = new int[ATTEMPT];
        String[] yesNo = new String[ATTEMPT];
        for (int i = 0; i < ATTEMPT; i++) {
            randomInt[i] = Engine.randomInt();
            yesNo[i] = isEven(randomInt[i]) ? "yes" : "no";
            strRandomInt[i] = String.valueOf(randomInt[i]);
        }
        Engine.logic(yesNo, strRandomInt, isGames);
    }
}
