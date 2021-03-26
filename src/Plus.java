package source;

import java.util.Scanner;

public class Plus {

    private static Integer width, height;

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the width: ");
        width = scanner.nextInt();

        System.out.println("What is the height: ");
        height = scanner.nextInt();

        createSquare(width, height);
    }

    public static void createSquare(Integer w, Integer h) {
        System.out.println();

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int j = 0; j < h; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
        System.out.print("\n");

        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print("#");
            }
            System.out.print(" ");
            for (int j = 0; j < h; j++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
    }

}
