package classstructureconstructors;

import java.util.Scanner;

public class StoreDataHandler {

    // --- public methods -----------------------------------------------------

    public void handleStockIncrease(Store store, Scanner scanner) {
        askForStoreData(store, scanner);
        bookStockIncrease(store, scanner);
        printStoreData(store);
    }

    public void handleStockDecrease(Store store, Scanner scanner) {
        askForStoreData(store, scanner);
        bookStockDecrease(store, scanner);
        printStoreData(store);
    }

    // --- private methods ----------------------------------------------------

    private String specifyStore(String id) {
        return "Store " + id;
    }

    private void askForStoreData(Store store, Scanner scanner) {
        System.out.println(specifyStore(store.getId()));

        System.out.println("Please, enter the type of the product!");
        store.setProduct(scanner.nextLine());

        System.out.println("Enter the amount of products available in stock!");
        store.setStock(scanner.nextInt());
        scanner.nextLine();
    }

    private void bookStockIncrease(Store store, Scanner scanner) {
        System.out.println("Number of new products delivered to store:");
        store.store(scanner.nextInt());
        scanner.nextLine();
    }

    private void bookStockDecrease(Store store, Scanner scanner) {
        System.out.println("Number of products delivered from store:");
        store.dispatch(scanner.nextInt());
        scanner.nextLine();
    }

    private void printStoreData(Store store) {
        System.out.println(specifyStore(store.getId()));
        System.out.println("Type of product: " + store.getProduct());
        System.out.println("Available products in stock: " + store.getStock());
    }
}