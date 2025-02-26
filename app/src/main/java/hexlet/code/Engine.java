package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ATTEMPT = 3;
    public static final int NUMBER_PARAMETERS = 2;
    public static final int NUMBER_START_PARAMETERS = 0;
    public static final int NUMBER_FINISH_PARAMETERS = 1;

    public static void logic(String[][] strResultRandom, String isGames) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String userResult;
        Greet.newGreet();
        System.out.println(isGames);
        while (i < ATTEMPT) {
            System.out.println("Question: " + strResultRandom[i][NUMBER_FINISH_PARAMETERS]);
            System.out.print("Your answer: ");
            userResult = scanner.next();
            if (strResultRandom[i][NUMBER_START_PARAMETERS].equals(userResult)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.print("'" + userResult);
                System.out.print("' is wrong answer ;(. Correct answer was '");
                System.out.println(strResultRandom[i][NUMBER_START_PARAMETERS] + "'.");
                System.out.println("Let's try again, " + Greet.getUserName() + "!");
                break;
            }
        }
        if (i == ATTEMPT) {
            System.out.println("Congratulations, " + Greet.getUserName() + "!");
        }
    }
}
