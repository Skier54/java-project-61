package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import static hexlet.code.Engine.ATTEMPT;

public class Progression {
    public static final int MAX_DIF = 5;
    public static final int NUMBER_SERIES = 10;

    public static int[] isProgression(int randomInt, int difference, int numberSeries) {
        int[] results = new int[numberSeries];
        results[0] = randomInt;
        for (int j = 1; j < numberSeries; j++) {
            results[j] = results[j - 1] + difference;
        }
        return results;
    }

    public static void arithmeticProgression() {
        Random random = new Random();
        String isGames = "What number is missing in the progression?";
        String[] strRandomInt = new String[ATTEMPT];
        int[] randomInt = new int[ATTEMPT];
        String[] strResult = new String[ATTEMPT];
        String[] str = new String[NUMBER_SERIES];
        int[] difference = new int[ATTEMPT];
        int[] index = new int[ATTEMPT];
        for (int i = 0; i < ATTEMPT; i++) {
            randomInt[i] = Utils.randomInt();
            difference[i] = random.nextInt(MAX_DIF) + 1;
            index[i] = random.nextInt(NUMBER_SERIES);
            int[] result = isProgression(randomInt[i], difference[i], NUMBER_SERIES);
            for (int j = 0; j < result.length; j++) {
                str[j] = String.valueOf(result[j]);
                if (j == index[i]) {
                    strResult[i] = str[j];
                    str[j] = "..";
                }
                strRandomInt[i] = strRandomInt[i] + " " + str[j];
            }
            strRandomInt[i] = strRandomInt[i].replaceAll("null ", "");
        }
        Engine.logic(strResult, strRandomInt, isGames);
    }
}

