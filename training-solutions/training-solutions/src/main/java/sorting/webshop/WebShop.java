package sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {

    // --- attributes ---------------------------------------------------------

    private List<Product> products;

    // --- constructors -------------------------------------------------------

    public WebShop(List<Product> products) {
        this.products = products;
    }

    // --- getters and setters ------------------------------------------------

    public List<Product> getProducts() { return products; }

    // --- public methods -----------------------------------------------------

    public List<Product> getProductsInNameOrder() {
        List<Product> auxProducts = new ArrayList<>(products);
        auxProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product other) {
                return product.getName().compareTo(other.getName());
            }
        });
        return auxProducts;
    }

    public List<Product> getProductsInPriceOrder() {
        List<Product> auxProducts = new ArrayList<>(products);
        auxProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product other) {
                return Integer.compare(product.getPrice(), other.getPrice());
            }
        });
        return auxProducts;
    }

    public List<Product> getProductsInDateTimeOrder() {
        List<Product> auxProducts = new ArrayList<>(products);
        auxProducts.sort(new Comparator<Product>() {
            @Override
            public int compare(Product product, Product other) {
                return product.getDateTime().compareTo(other.getDateTime());
            }
        });
        return auxProducts;
    }
}