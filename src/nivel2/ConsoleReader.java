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

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                byte value = sc.nextByte();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid format. Please enter an integer between -128 and 127.");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                float value = sc.nextFloat();
                sc.nextLine();
                return value;
            } catch (Exception e) {
                System.out.println("Invalid format. Please enter a decimal number.");
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message){
        while (true){
            try{
                System.out.println(message);
                String value = sc.nextLine();
                if (value.length() != 1){
                    throw new Exception("Please enter a single character.");
                }
                char valueChar = value.charAt(0);
                return valueChar;
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
