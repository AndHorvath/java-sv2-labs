package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class WebShop {

    // --- attributes ---------------------------------------------------------

    private List<Product> products;

    // --- constructors -------------------------------------------------------

    public WebShop() {
        this.products = new ArrayList<>();
    }

    // --- getters and setters ------------------------------------------------

    public List<Product> getProducts() { return products; }

    // --- public methods -----------------------------------------------------

    public void addProduct(Product product) {
        products.add(product);
    }

    public int findHowMany(Product product) {
        int counter = 0;
        for (Product actualProduct : products) {
            if (actualProduct.equals(product)) {
                counter++;
            }
        }
        return counter;
    }

    // --- main method --------------------------------------------------------

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        Product product = new Product("Product", "A-1");

        webShop.addProduct(new Product("Product A", "A-1"));
        System.out.println(webShop.findHowMany(product));

        webShop.addProduct(new Product("Product A", "B-2"));
        System.out.println(webShop.findHowMany(product));

        webShop.addProduct(new Product("Product B", "A-1"));
        System.out.println(webShop.findHowMany(product));
    }
}