package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ATTEMPT = 3;
    public static final int MAX_NUMBER = 100;
    public static int randomInt() {
        return (int) (Math.random() * MAX_NUMBER);
    }
    public static void logic(String[] result, String[] randomInt, String isGames) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String userResult;
        Greet.newGreet();
        System.out.println(isGames);
        while (i < ATTEMPT) {
            System.out.println("Question: " + randomInt[i]);
            System.out.print("Your answer: ");
            userResult = scanner.next();
            if (result[i].equals(userResult)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.print("'" + userResult);
                System.out.print("' is wrong answer ;(. Correct answer was '");
                System.out.println(result[i] + "'.");
                System.out.println("Let's try again, " + Greet.getUserName() + "!");
                break;
            }
        }
        if (i == ATTEMPT) {
            System.out.println("Congratulations, " + Greet.getUserName() + "!");
        }
    }
}
