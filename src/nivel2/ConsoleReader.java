package nivel2;

import java.util.Scanner;

public class ConsoleReader {
    private static Scanner sc = new Scanner(System.in);

    public static int readInt(String message) {

        while (true) {
            try {
                System.out.println(message);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid format. Please enter an integer number.");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                double value = sc.nextDouble();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid format. Please enter a decimal number.");
                sc.nextLine();
            }
        }
    }
}
