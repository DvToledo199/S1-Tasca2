package nivel1;

import java.util.ArrayList;

public class Sale {

   private ArrayList<Product> products;
   private double totalPrice;

   public Sale(){
       this.products = new ArrayList<>();
       this.totalPrice = 0;
   }

   public void addProduct(Product product) {
       products.add(product);
   }

    public double calculateTotal() {

        if (products.isEmpty()) {
            throw new EmptySaleException("Cannot calculate total of an empty sale");
        }

        totalPrice = 0;

        for (int i = 0; i < products.size(); i++) {
            totalPrice = totalPrice + products.get(i).getPrice();
        }
        return totalPrice;



    }
}
