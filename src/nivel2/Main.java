package nivel2;
// Main para probar los metodos de la clase ConsoleReader//
public class Main {
    public static void main(String[] args){

        int number = ConsoleReader.readInt("Enter an integer:");
        System.out.println("You entered: " + number);

        double decimalNumber = ConsoleReader.readDouble("Enter a decimal number:");
        System.out.println("Your decimal is: " + decimalNumber);

        byte smallNumber = ConsoleReader.readByte("Enter a number between -128 and 127:");
        System.out.println("Your byte is: " + smallNumber);

        float floatNumber = ConsoleReader.readFloat("Enter a decimal number:");
        System.out.println("Your float is: " + floatNumber);

        char character = ConsoleReader.readChar("Enter a single character:");
        System.out.println("Your character is: " + character);

        boolean answer = ConsoleReader.readYesNo("Please choose 's' or 'n':");
        System.out.println("Your answer is: " + answer);

        String text = ConsoleReader.readString("Enter a text:");
        System.out.println("Your text is: " + text);


    }
}
