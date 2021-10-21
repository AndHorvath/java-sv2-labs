package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDataPrinter productDataPrinter = new ProductDataPrinter();
        Product product;
        String name;
        int price;
        int priceChange;

        System.out.println("Please, specify the name of the product!");
        name = scanner.nextLine();

        System.out.println("Now, enter the product's price in HUF!");
        price = scanner.nextInt();
        scanner.nextLine();

        product = new Product(name, price);
        productDataPrinter.printProductData(product);

        System.out.println("A price increase is necessary. Please, enter its amount in HUF!");
        priceChange = scanner.nextInt();
        scanner.nextLine();

        product.increasePrice(priceChange);
        productDataPrinter.printProductData(product);

        System.out.println("Now, a price reduction is possible. Enter its amount in HUF!");
        priceChange = scanner.nextInt();

        product.decreasePrice(priceChange);
        productDataPrinter.printProductData(product);
    }
}
