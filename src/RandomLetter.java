import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RandomLetter {

    private static final boolean debug = false;

    public static void main (String[] args) throws InterruptedException {
        start();
    }

    public static void start() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyz";
        boolean playAgain = true;
        String answer;
        int score;

        while (playAgain) {
            // Step 1: Generate the number
            printMessage("Generating letter. please stand by...");
            char available = chars.charAt(random.nextInt(chars.length()));
            addDelay(2);
            printMessage("Letter generated. Game starts now!");
            addDelay(1);
            printSpace();
            printRules();

            // Step 1.5: Debugging
            if (debug) {
                printSpace();
                printMessage("[DEBUG] Random letter is: " + available);
            }

            // Step 2: Guess the random letter
            printMessage("Enter a word to start guessing the letter: ");
            answer = scanner.next();

            // Step 3: Check the score
            score = 0;
            String randomLetter = String.valueOf(available);
            if (!answer.substring(0, 1).equalsIgnoreCase(randomLetter)) {
                printSpace();
                printMessage("Letter not found. The random letter was: " + randomLetter);
                printMessage("Score: " + score);
            } else if (isAscending(answer)) {
                score = randomLetter.charAt(0) * 3;
                printSpace();
                printMessage("Letter found & found to be ascending!");
                printMessage("Score: " + score);
            } else if (answer.substring(0, 1).equalsIgnoreCase(randomLetter)) {
                score = randomLetter.charAt(0);
                printSpace();
                printMessage("Letter found!");
                printMessage("Score: " + score);
            }

            // Step 4: Repeat the program or break it
            printSpace();
            printMessage("Play again?");
            answer = scanner.next();
            if (answer.trim().equalsIgnoreCase("Y")) {
                playAgain = true;
                printMessage("");
            } else {
                playAgain = false;
            }
        }
    }

    public static void printRules() {
        printMessage("Rules: Enter a word to start guessing the letter. It will take the first one.");
        printMessage("If that letter is valid, you will get points! If the letters are all ascending,");
        printMessage("the score triples. If the letter isn't found, you score 0. Simple, right?");
    }

    public static boolean isAscending (String input) {
        boolean ascending;
        int i = 0;

        if (input == null || input.length() < 1) {
            return false;
        }
        ascending = false;

        while (i < input.length() - 1) {
            if (input.charAt(i) <= input.charAt(i + 1)) {
                ascending = true;
            } else {
                ascending = false;
                break;
            }
            i++;
        }
        return (ascending);
    }

    public static void printMessage (String message) {
        System.out.println(message);
    }

    public static void printSpace() {
        System.out.println("");
    }

    public static void addDelay (int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }
}
