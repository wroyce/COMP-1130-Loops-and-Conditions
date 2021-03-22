import java.util.concurrent.TimeUnit;

public class Table {

    private static int width, height;

    public Table (int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public Table getNumbers() throws InterruptedException {
        printMessage("Generating table...");
        printMessage("Table specs: " + width + " x " + height);
        printSpace();
        addDelay(2);

        int w = 1;
        for (int i = 1; i <= height; i++ ) {
            System.out.print(" | ");
            for (int j = 1; j <= width; j++) {
                System.out.print(w++ + " | ");
            }
            System.out.print("\n");
        }
        return null;
    }

    public static void printMessage (String message) {
        System.out.println(message);
    }

    public static void printSpace() {
        System.out.println();
    }

    public static void addDelay (int delay) throws InterruptedException {
        TimeUnit.SECONDS.sleep(delay);
    }

}
