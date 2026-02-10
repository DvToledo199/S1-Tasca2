package nivel1;

import java.util.ArrayList;

public class Sale {

    ArrayList<Product> products = new ArrayList<>();

    double totalPrice = 0;

    public double calculateTotal() {

        if (products.isEmpty())
            throw new EmptySaleException("Cannot calculate total of an empty sale");

        for (int i = 0; i < products.size(); i++) {
            totalPrice = totalPrice + products.get(i).getPrice();
        }
        return totalPrice;

    }
}
