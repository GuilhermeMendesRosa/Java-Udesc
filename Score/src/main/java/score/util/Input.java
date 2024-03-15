package score.util;

import java.util.Scanner;

public class Input {
    public static String getString(String label) {
        printLabel(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    public static int getInt(String label) {
        printLabel(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printLabel(String label) {
        System.out.print(label + ": ");
    }

}
