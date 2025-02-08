package hexlet.code;
import java.util.Scanner;
public class Even {
    public static void checkingParity() {
        Scanner scanner = new Scanner(System.in);
        Greet.newGreet();
//        System.out.println();
//        System.out.println("Welcome to the Brain Games!");
//        System.out.print("May I have your name? ");
//        String userName = scanner.next();
//        System.out.println("Hello, " + userName + "!");
        String yes = "yes";
        String no = "no";
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int i = 0;
        while (i < 3) {
            int randomInt = (int) (Math.random() * 100);
            System.out.println("Question: " + randomInt);
            System.out.print("Your answer: ");
            String yesNo = scanner.next();
            if (randomInt % 2 == 0) {
                if (yes.equals(yesNo)) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'" + yesNo + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + Greet.userName);
                    break;
                }
            } else {
                if (no.equals(yesNo)) {
                    System.out.println("Correct!");
                    i++;
                } else {
                    System.out.println("'" + yesNo + "'" + " is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + Greet.userName);
                    break;
                }
            }
        }
        if (i == 3) {
            System.out.println("Congratulations, " + Greet.userName);
        }
        scanner.close();
    }
}
