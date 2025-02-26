package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.ATTEMPT;

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
        String[] strRandomInt = new String[ATTEMPT];
        int[] randomInt = new int[ATTEMPT];
        String[] yesNo = new String[ATTEMPT];
        for (int i = 0; i < ATTEMPT; i++) {
            randomInt[i] = Utils.randomInt() + a;
            yesNo[i] = isPrime(randomInt[i]) ? "yes" : "no";
            strRandomInt[i] = String.valueOf(randomInt[i]);
        }
        Engine.logic(yesNo, strRandomInt, isGames);
    }
}
