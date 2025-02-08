package hexlet.code.games;
import hexlet.code.Greet;

import java.util.Scanner;
import java.util.Random;
public class Calc {
    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
        Random random = new Random();
        int result = 0;
        int userResult;
        System.out.println("What is the result of the expression?");
        int i = 0;
        while (i < 3) {
            int randomInt = (int) (Math.random() * 50);
            int randomInt1 = (int) (Math.random() * 50);
            int operation = random.nextInt(3);
            switch (operation) {
                case 0:
                    System.out.println("Question: " + randomInt + " + " + randomInt1);
                    result = randomInt + randomInt1;
                    break;
                case 1:
                    System.out.println("Question: " + randomInt + " - " + randomInt1);
                    result = randomInt - randomInt1;
                    break;
                case 2:
                    System.out.println("Question: " + randomInt + " * " + randomInt1);
                    result = randomInt * randomInt1;
                    break;
                default:
                    break;
            }
            System.out.print("Your answer: ");
            try {
                userResult = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("'Invalid Input' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Greet.userName + "!");
                break;
            }
            if (result == userResult) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + userResult + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Greet.userName + "!");
                break;
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Greet.userName + "!");
        }
    }
}
