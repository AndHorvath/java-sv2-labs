package classstructureconstructors;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StoreDataHandler storeDataHandler = new StoreDataHandler();

        Store storeA = new Store("A", "");
        Store storeB = new Store("B", "");

        storeDataHandler.handleStockIncrease(storeA, scanner);
        storeDataHandler.handleStockDecrease(storeB, scanner);
    }
}