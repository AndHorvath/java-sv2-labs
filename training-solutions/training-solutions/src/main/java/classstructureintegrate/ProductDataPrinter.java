package classstructureintegrate;

public class ProductDataPrinter {

    public void printProductData(Product product) {
        System.out.println("Product name: " + product.getName());
        System.out.println("Product price: " + product.getPrice() + " HUF");
    }
}
