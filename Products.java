package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void initStoreItems() {
        String [] productNames = {"Iphone", "Samsung Phone", "Laptop", "Ipad", "Computer"};
        Double [] productPrice = {500.00d, 400.00d, 700.00d, 300.00d, 900.00d};
        Integer [] stock = {8, 6, 7, 10, 4};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }

    }
}