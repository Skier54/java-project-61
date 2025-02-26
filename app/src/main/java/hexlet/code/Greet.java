package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static String userName = "";

    public static String getUserName() {
        return userName;
    }

    public static void newGreet() {
        Scanner greeting = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = greeting.next();
        System.out.println("Hello, " + userName + "!");
    }
}
