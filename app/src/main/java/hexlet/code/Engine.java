package hexlet.code;

public class Engine {
    public static int attempt = 3;
    public static int i = 0;
    public static int randomInt() {
        return (int) (Math.random() * 100);
    }
    public static void correct() {
        System.out.println("Correct!");
        i++;
    }
    public static void noCorrect() {
        System.out.println("Let's try again, " + Greet.userName + "!");
    }
    public static void victory() {
        if (i == 3) {
            System.out.println("Congratulations, " + Greet.userName + "!");
        }
    }

}
