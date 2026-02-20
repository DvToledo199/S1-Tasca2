package nivel1;

public class Main {
    public static void main(String[] args){

        Sale s1 = new Sale();

// Primero provocamos EmptySaleException
        try {
            s1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

// Luego provocamos IndexOutOfBoundsException
        try {
            java.util.ArrayList<String> list = new java.util.ArrayList<>();
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
