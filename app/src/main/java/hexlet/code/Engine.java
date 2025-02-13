package hexlet.code;

public class Engine {
    public static final int ATTEMPT = 3;
    public static final int MAX_NUMBER = 100;
    public static int randomInt() {
        return (int) (Math.random() * MAX_NUMBER);
    }
    public static void correct() {
        System.out.println("Correct!");
    }
    public static void noCorrect() {
        System.out.println("Let's try again, " + Greet.getUserName() + "!");
    }
    public static void victory() {
        System.out.println("Congratulations, " + Greet.getUserName() + "!");
    }
    public static void incorrectCorrect() {
        System.out.print("' is wrong answer ;(. Correct answer was '");
    }

}
